package me.souprpk.api.math;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Encyption {

    public static String SHA256(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

        StringBuilder hexString = new StringBuilder(2 * encodedhash.length);
        for (byte b : encodedhash) {
            String hex = Integer.toHexString(0xff &b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static String Base64encode(String input){
        return Base64.getEncoder().withoutPadding().encodeToString(input.getBytes());
    }

    public static String Base64decode(String input){
        return new String(Base64.getDecoder().decode(input));
    }

    public Encyption(){
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }
}
