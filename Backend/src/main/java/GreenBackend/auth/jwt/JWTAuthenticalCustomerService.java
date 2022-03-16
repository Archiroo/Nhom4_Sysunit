package GreenBackend.auth.jwt;

import com.greentrade.common.base.Cred;


public interface JWTAuthenticalCustomerService {

    String generateToken(Cred cred) throws Exception;

    Cred getCredFromJWT(String token) throws Exception;

    boolean validateToken(String authToken) throws Exception;

    Cred checkSession(String token, boolean isCheckStatus) throws Exception;

    void logout(String token) throws Exception;
}
