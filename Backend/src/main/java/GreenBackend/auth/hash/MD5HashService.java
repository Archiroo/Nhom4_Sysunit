package GreenBackend.auth.hash;

import java.security.NoSuchAlgorithmException;

public interface MD5HashService {
    public String hashMD5(String text) throws NoSuchAlgorithmException;
}
