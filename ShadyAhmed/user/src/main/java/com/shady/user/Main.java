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
         Employee em1= new Employee("text", "text", "text", "text", "text", "text", 564,  "text", "text");
         Employee em2= new Employee("text", "text", "text", "text", "text", "text", 564,  "text", "text");
         Employee em3= new Employee("text", "text", "text", "text", "text", "text", 564,  "text", "text");
    
       
        Employee_service.addEmployee(em1);
        Employee_service.addEmployee(em2);
        Employee_service.addEmployee(em3);
       System.out.print(Employee_service.LinarsearchEmployee(em3.getEmployeeId()));
       Employee_service.storeEmployee.display();
       Employee_service.deleteEmpolyee(em3.getEmployeeId());
       
       Employee_service.storeEmployee.display();
    }
}
