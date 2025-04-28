package com.shady.user.ModelClasses;
import java.util.Random;
public class Employee extends User{
    protected int employeeId;
    protected String department;
   

    public Employee(String name, String email, String password, String phoneNumber, String address, String cardNumber,double balance, String employeeId, String department) {
        super( name,  email,  password,  phoneNumber,  address,  cardNumber, balance) ;
 
        this.employeeId = new Random().nextInt(9999) + 1000; 
        this.department = department;
        
        this.role = Role.EMPLOYEE; 
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


   

}
