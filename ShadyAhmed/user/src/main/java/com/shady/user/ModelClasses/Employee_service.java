package com.shady.user.ModelClasses;
import java.util.ArrayList;

public class Employee_service {
    public static DLL storeEmployee =new DLL();
    public  Employee_service(){
       
    }

   public  static void  addEmployee(Employee e)
    {

        storeEmployee.Append(e);
    }
    public  static void deleteEmpolyee(int id)
    {

        storeEmployee.deleteAtPos(id);
    }
    public  static  int LinarsearchEmployee(int id )// give posstion for this employee
    {
       
            return storeEmployee.whereposistion(id).Position;
       
    }
    public  static  void display()// give posstion for this employee
    {
       
           storeEmployee.display();
       
    }



}
