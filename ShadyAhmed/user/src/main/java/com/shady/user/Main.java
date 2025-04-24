package com.shady.user;

import com.shady.user.ModelClasses.Role;
import com.shady.user.ModelClasses.User;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        boolean flage = true;

        do {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Enter your email:");
            String email = scanner.nextLine();
            System.out.println("Enter your password:");
            String password = scanner.nextLine();
            System.out.println("Enter your phone number:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter your address:");
            String address = scanner.nextLine();
            System.out.println("Enter your card number:");
            String cardNumber = scanner.nextLine();
            System.out.println("Enter your balance:");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter your role (CUSTOMER, EMPLOYEE):");
            String roleInput = scanner.nextLine();
            Role role = roleInput.equalsIgnoreCase("EMPLOYEE") ? Role.EMPLOYEE : Role.CUSTOMER;

            // إنشاء المستخدم
            User user = new User(name, email, password, phoneNumber, address, cardNumber, balance, role);

            user.saveToDatabase();
           

            System.out.println("Do you want to create another user? (yes/no)");
            String answer = scanner.nextLine();
            flage = answer.equalsIgnoreCase("yes");

        } while (flage);

        System.out.println("Exit...");
    }
}
