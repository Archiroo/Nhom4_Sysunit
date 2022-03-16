package GreenBackend.global;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class RandomString {

    /**
     * Generate a random string.
     */
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final String NU = "0123456789";
    static SecureRandom rnd = new SecureRandom();

    public static String randomString(int len){
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String randomString(int len, String type) {
        StringBuilder sb = new StringBuilder(len);

        if (type.equalsIgnoreCase("number")) {
            for(int i = 0; i < len; i++)
                sb.append(NU.charAt(rnd.nextInt(NU.length())));
        }
        else {
            for(int i = 0; i < len; i++)
                sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }

        return sb.toString();
    }

}