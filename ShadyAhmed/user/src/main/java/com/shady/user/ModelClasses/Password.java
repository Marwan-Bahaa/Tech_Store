package com.shady.user.ModelClasses;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Password {
    private String EncryptedPassword;

   
public Password(String Password) {
        setPassword(Password);
    }
    public void setPassword(String Password) {
        this.EncryptedPassword = hashPassword(Password);
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) // if we dont found algorithm dont hash the password
         // and throw exception
        {
            throw new RuntimeException("Error hashing password", e);
        }
    }



    public String getEncryptedPassword() {
        return EncryptedPassword;
    }

    public boolean checkPassword(String password) {
        return this.EncryptedPassword.equals(hashPassword(password));
    }
}