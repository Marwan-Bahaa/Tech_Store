package com.shady.user;

import com.shady.user.ModelClasses.Employee;
import com.shady.user.ModelClasses.Employee_service;
import com.shady.user.ModelClasses.Role;
import com.shady.user.ModelClasses.User;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        boolean flage = true;

        /*do {
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
           

     
            User user = new User(name, email, password, phoneNumber, address, cardNumber, balance);

            user.saveToDatabase();
           

            System.out.println("Do you want to create another user? (yes/no)");
            String answer = scanner.nextLine();
            flage = answer.equalsIgnoreCase("yes");

        } while (flage);

        System.out.println("Exit...");*/
       System.out.println("Hello, World!");
        String text="+";
        char ch= text.charAt(0);
        
        Employee em1= new Employee(text, text, text, text, text, text, ch, null, text, text);
        Employee em2= new Employee(text, text, text, text, text, text, ch, null, text, text);
        Employee em3= new Employee("shady","ahmed@email", "1234", text, text, text, ch, null, text, text);
        Employee_service employee_service= new Employee_service();
         Employee_service.addEmployee(em1);
        Employee_service.addEmployee(em2);
        Employee_service.addEmployee(em3);
       /*  Employee_service.storeEmployee.display();
        System.out.println("__________________________");
       System.out.println(Employee_service.linearSearchEmployee(em3.employeeId));
       System.out.println("__________________________");
      // Employee_service.deleteEmployee(em3.employeeId);
       
       Employee_service.storeEmployee.display();*/
     
       try {
        System.out.println(Employee_service.login("ahmed@email", "1234").display());
       System.out.println(Employee_service.login("ahmed@email", "1244").getName());
       System.out.println(Employee_service.login("ahmed@eail", "1244").getName());
       } catch (Exception e) {
           System.out.println(e.getMessage());
           
       } 
    }
}
