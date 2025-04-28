package com.shady.user.ModelClasses;

import com.shady.user.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {


    // Attributes
    protected String name;
    protected String email;
    protected Password password;
    protected String phoneNumber;
    protected String address;
    protected BanckCard card;
    protected Role role;

    public User(String name, String email, String password, String phoneNumber, String address, String cardNumber,double balance) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.card = new BanckCard(cardNumber, balance); 
        this.password=new Password(password);
        this.role = Role.CUSTOMER; 
    }
 public void setAddress(String address) {
     this.address = address;
 }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getCardNumber() {
        return card.getCardNumber();
    }
    public double getCardBalance() {
        return card.getBalance();
    }
    public void addCardBalance(double amount) {
        card.addBalance(amount);
    }
    public void setCardNumber(String cardNumber) {
        card.setCardNumber(cardNumber);
    }
   
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

   
    public String getPassword() {
        return password.getEncryptedPassword();
    }
    public boolean checkPassword(String password) {
        return this.password.checkPassword(password);
    }
    public Role getRole() {
        return role;
    }
    public void debitCard(double amount) {
        card.debitCard(amount);
    }
    

 public void saveToDatabase() {
        String sql = "INSERT INTO users (name, email, password, phone_number, address, card_number, balance, role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, this.name);
            stmt.setString(2, this.email);
            stmt.setString(3, this.password.getEncryptedPassword());
            stmt.setString(4, this.phoneNumber);
            stmt.setString(5, this.address);
            stmt.setString(6, this.card.getCardNumber());
            stmt.setDouble(7, this.card.getBalance());
            stmt.setString(8, this.role.name());

            stmt.executeUpdate();
            System.out.println("User saved to database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}





