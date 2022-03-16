package GreenBackend.service;

import GreenBackend.auth.jwt.JWTAuthenticalCustomerService;
import GreenBackend.auth.jwt.JWTAuthenticalCustomerService;
import GreenBackend.service.IRedisService;
import com.greentrade.common.base.Cred;
import com.greentrade.common.utils.CmnEnums;
import com.greentrade.common.utils.CompareUtil;
import com.greentrade.common.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class RedisServiceImpl implements IRedisService {
    public static final String BUSINESS_KEY = "BUSINESS_DATE_STATUS_";

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate customerRedisTemplate;

    @Autowired
    private JWTAuthenticalCustomerService jwtAuthenticalCustomerService;

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public void openBusinessDate(String branchCode) throws Exception {
        redisTemplate.opsForValue().set(BUSINESS_KEY + branchCode, CmnEnums.BusinessDateStatus.OPEN);
        customerRedisTemplate.opsForValue().set(BUSINESS_KEY + branchCode, CmnEnums.BusinessDateStatus.OPEN);
    }
    @Transactional(rollbackFor = { Exception.class })
    @Override
    public void closeBusinessDate(String branchCode) throws Exception {
        redisTemplate.opsForValue().set(BUSINESS_KEY + branchCode, CmnEnums.BusinessDateStatus.CLOSE);
        customerRedisTemplate.opsForValue().set(BUSINESS_KEY + branchCode, CmnEnums.BusinessDateStatus.CLOSE);
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public void closeHistBusinessDate(String branchCode) throws Exception {
        redisTemplate.opsForValue().set(BUSINESS_KEY + branchCode, CmnEnums.BusinessDateStatus.CLOSE_HIST);
        customerRedisTemplate.opsForValue().set(BUSINESS_KEY + branchCode, CmnEnums.BusinessDateStatus.CLOSE_HIST);
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public String getBusinessDateStatus(String branchCode) throws Exception {
        return redisTemplate.opsForValue().get(BUSINESS_KEY + branchCode);
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public String getBusinessDateStatusCustomer(String branchCode) throws Exception {
        return customerRedisTemplate.opsForValue().get(BUSINESS_KEY + branchCode);
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public void setValue(String key, String value) throws Exception {
        redisTemplate.opsForValue().set(key, value);
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public void setValueCustomer(String key, String value) throws Exception {
        customerRedisTemplate.opsForValue().set(key, value);
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public String getValue(String key) throws Exception {
        return redisTemplate.opsForValue().get(key);
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public String getValueCustomer(String key) throws Exception {
        return customerRedisTemplate.opsForValue().get(key);
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public void deleteValue(String key) throws Exception {
        redisTemplate.delete(key);
    }

    @Override
    public void deleteValueCustomer(String key) throws Exception {
        customerRedisTemplate.delete(key);
    }

    @Override
    public Boolean hasKey(String key) throws Exception {
        return redisTemplate.hasKey(key);
    }

    @Override
    public Boolean hasKeyCustomer(String key) throws Exception {
        return customerRedisTemplate.hasKey(key);
    }

    @Override
    public void deleteAllToken(String userId) throws Exception {
        RedisConnection redisConnection = redisTemplate.getConnectionFactory().getConnection();
        Set<byte[]> redisKeys = redisConnection.keys("*".getBytes());
        List<String> keysList = new ArrayList<>();
        for (byte[] data : redisKeys) {
            keysList.add(new String(data, 0, data.length));
        }
        redisConnection.close();
        for (String key: keysList){
            String value = getValueCustomer(key);
            Cred userData = Utils.fromJson(value, Cred.class);
            if (!CompareUtil.isEqualsNull(userData) && !CompareUtil.isEqualsNull(userData.getUserId()) && userData.getUserId().equals(userId)) {
                deleteValueCustomer(key);
            }
        }
    }

    @Override
    public void deleteAllTokenCustomer(String userId) throws Exception {
        RedisConnection redisConnection = customerRedisTemplate.getConnectionFactory().getConnection();
        Set<byte[]> redisKeys = redisConnection.keys("*".getBytes());
        List<String> keysList = new ArrayList<>();
        for (byte[] data : redisKeys) {
            keysList.add(new String(data, 0, data.length));
        }
        redisConnection.close();
        for (String key: keysList){
            String value = getValueCustomer(key);
            Cred userData = Utils.fromJson(value, Cred.class);
            if (!CompareUtil.isEqualsNull(userData) && !CompareUtil.isEqualsNull(userData.getUserId()) && userData.getUserId().equals(userId)) {
                deleteValueCustomer(key);
            }
        }
    }

    @Override
    public void deleteAllToken() throws Exception {
        RedisConnection redisConnection = redisTemplate.getConnectionFactory().getConnection();
        Set<byte[]> redisKeys = redisConnection.keys("*".getBytes());
        List<String> keysList = new ArrayList<>();
        for (byte[] data : redisKeys) {
            keysList.add(new String(data, 0, data.length));
        }
        redisConnection.close();
        for (String key: keysList){
//            String value = getValueCustomer(key);
//            Cred userData = Utils.fromJson(value, Cred.class);
            if (key.contains(BUSINESS_KEY)) {
                continue;
            }
            deleteValueCustomer(key);
        }
    }

    @Override
    public void deleteAllTokenCustomer() throws Exception {
        RedisConnection redisConnection = customerRedisTemplate.getConnectionFactory().getConnection();
        Set<byte[]> redisKeys = redisConnection.keys("*".getBytes());
        List<String> keysList = new ArrayList<>();
        for (byte[] data : redisKeys) {
            keysList.add(new String(data, 0, data.length));
        }
        redisConnection.close();
        for (String key: keysList){
//            String value = getValueCustomer(key);
//            Cred userData = Utils.fromJson(value, Cred.class);
            if (key.contains(BUSINESS_KEY)) {
                continue;
            }
            deleteValueCustomer(key);
        }
    }

    @Override
    public List<Cred> getCustomerActive() throws Exception {
        List<Cred> result = new ArrayList<>();
        RedisConnection redisConnection = customerRedisTemplate.getConnectionFactory().getConnection();
        Set<byte[]> redisKeys = redisConnection.keys("*".getBytes());
        List<String> keysList = new ArrayList<>();
        for (byte[] data : redisKeys) {
            keysList.add(new String(data, 0, data.length));
        }
        redisConnection.close();
//        Set<String> keysList = customerRedisTemplate.keys("*");
        for (String key: keysList){
            if (key.contains("BUSINESS_DATE_STATUS")) {
                continue;
            }
            try {
                jwtAuthenticalCustomerService.validateToken(key);
            } catch (Exception ex) {
                deleteValueCustomer(key);
                continue;
            }
            String value = getValueCustomer(key);
            Cred userData = Utils.fromJson(value, Cred.class);
            result.add(userData);
        }

        return result;
    }


}
