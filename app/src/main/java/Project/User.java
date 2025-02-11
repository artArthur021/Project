package Project;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class User {
    private String username;
    private String passwordHash; // Store hashed password
    private double balance;

    public User(String username, String password, double balance) {
        this.username = username;
        this.passwordHash = hashPassword(password);
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public boolean checkPassword(String password) {
        return passwordHash.equals(hashPassword(password));
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
 
}
