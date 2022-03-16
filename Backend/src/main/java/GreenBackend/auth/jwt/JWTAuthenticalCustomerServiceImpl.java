package GreenBackend.auth.jwt;

import GreenBackend.service.IRedisService;
import com.greentrade.common.base.Cred;
import com.greentrade.common.base.GTException;
import com.greentrade.common.utils.CmnEnums;
import com.greentrade.common.utils.CompareUtil;
import com.greentrade.common.utils.Utils;
import io.jsonwebtoken.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@Slf4j
public class JWTAuthenticalCustomerServiceImpl implements JWTAuthenticalCustomerService {

    @Autowired
    private IRedisService redisService;

    // Đoạn JWT_SECRET này là bí mật, chỉ có phía server biết
    private final String JWT_SECRET = "greentrade@1234";

    //Thời gian có hiệu lực của chuỗi jwt
    private final long JWT_EXPIRATION = 1000 * 60 * 60 * 24; // 1 day

    // Tạo ra jwt từ thông tin user
    @Override
    public String generateToken(Cred cred) throws Exception{
        try {
            Date now = new Date();
            Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);
            // Tạo chuỗi json web token từ id của user.
            String token = Jwts.builder()
                    .setSubject(cred.getUserId())
                    .setIssuedAt(now)
                    .setExpiration(expiryDate)
                    .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
                    .compact();
            String json = Utils.toJson(cred);
            redisService.setValueCustomer(token, json);
            return token;
        }
        catch (Exception ex) {
            throw ex;
        }
    }

    // Lấy thông tin user từ jwt
    @Override
    public Cred getCredFromJWT(String token) throws Exception{
        Cred userData = null;
        if(!token.isEmpty()) {
            String data = redisService.getValueCustomer(token);
            userData = Utils.fromJson(data, Cred.class);
        }

        if(CompareUtil.isEqualsNull(userData)) {
            throw new GTException("vi", "E205_011", null, null);
        }
        // sửa lại phải lấy từ DB
//        if (DateTimeUtil.toSmallSqlDate(userData.getBusinessDate()).compareTo(DateTimeUtil.toSmallSqlDate(GlobalData.businessDate)) != 0) {
//            redisTemplate.delete(token);
//            throw new GTException("vi", "E205_012", null, null);
//        }

        return userData;
    }


    @Override
    public boolean validateToken(String authToken) throws Exception {
        try {
            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(authToken);
            return true;
        } catch (MalformedJwtException ex) {
            throw new GTException("vi", "E205_001", null);
        } catch (ExpiredJwtException ex) {
            redisService.deleteValueCustomer(authToken);
            throw new GTException("vi", "E205_002", null);
        } catch (UnsupportedJwtException ex) {
            throw new GTException("vi", "E205_003", null);
        } catch (IllegalArgumentException ex) {
            throw new GTException("vi", "E205_004", null);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public Cred checkSession(String token, boolean isCheckStatus) throws Exception {
        Boolean exist = redisService.hasKeyCustomer(token);
        if (!exist) {
            throw new GTException("vi", "E205_001", null);
        }
        validateToken(token);
        Cred cred = getCredFromJWT(token);
        if (isCheckStatus) {
            if (!redisService.getBusinessDateStatus(cred.getBranchCode()).equals(CmnEnums.BusinessDateStatus.OPEN)) {
                throw new Exception("Ngày giao dịch hiện tại chưa mở");
            }
        }
        return cred;
    }

    @Override
    public void logout(String token) throws Exception {
        validateToken(token);
        redisService.deleteValueCustomer(token);
    }
}
