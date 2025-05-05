package com.shady.user.ModelClasses;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;
import java.util.LinkedList;
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;


public class Employee_service {
    public static DLL storeEmployee = new DLL();
    private static final String FILE_NAME = "employee_data.json";
    private static final String SECRET_KEY = "1234567890123456"; // 16-byte key for AES encryption

    public Employee_service() {
      //  readFromFile();
      //  setupShutdownHook();
    }

    public static void addEmployee(Employee e) {
        storeEmployee.Append(e);
    }

    public static void deleteEmployee(int id) {
        storeEmployee.deleteAtPos(id);
    }

    public static int linearSearchEmployee(int id) {
        return storeEmployee.whereposistion(id).Position;
    }

    public static void display() {
        storeEmployee.display();
    }
    public static Employee login(String email, String password) {
      return storeEmployee.login(email, password);
    }

    /*private static void readFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return; // No file to read, start with an empty list
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String encryptedData = reader.readLine();
            if (encryptedData != null) {
                String decryptedData = decrypt(encryptedData, SECRET_KEY);
                DLL employeeList = new Gson().fromJson(decryptedData, new TypeToken<DLL>() {}.getType());
                for (Employee e : employeeList) {
                    storeEmployee.Append(e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        

    private static void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Employees.json"))) {
            DLL employeeList = storeEmployee.toLinkedList(); // Assuming DLL has a method to convert to LinkedList
            String jsonData = new Gson().toJson(employeeList);
            String encryptedData = encrypt(jsonData, SECRET_KEY);
            writer.write(encryptedData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        

    private static void setupShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(Employee_service::saveToFile));
    }

    private static String encrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(data));
        return new String(decryptedBytes);
    } */
         
}
