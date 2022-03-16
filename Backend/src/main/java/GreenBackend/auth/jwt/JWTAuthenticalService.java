package GreenBackend.auth.jwt;

import com.greentrade.common.base.Cred;
import com.greentrade.common.domain.User;


public interface JWTAuthenticalService {

    public String generateToken(Cred cred) throws Exception;

    public Cred getCredFromJWT(String token) throws Exception;

    public boolean validateToken(String authToken) throws Exception;

    public Cred checkSession(String token, boolean isCheckStatus) throws Exception;

    public void logout(String token) throws Exception;
}
