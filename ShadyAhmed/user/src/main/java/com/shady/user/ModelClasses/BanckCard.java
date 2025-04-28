package com.shady.user.ModelClasses;
public class BanckCard {
    private String cardNumber;
    private double balance=0.0;
   

    public BanckCard(String cardNumber, double balance) {
        this.balance = balance;
        this.cardNumber = cardNumber;
     
    }

    // Getters and setters for the fields can be added here
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }   
    public double getBalance() {
        return balance;
    }
   
    public void addBalance(double amount) {
        this.balance += amount;
    }
   
    public void debitCard(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
