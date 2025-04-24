package com.shady.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/user"; // اسم قاعدة البيانات
    private static final String USER = "root"; // اسم المستخدم الافتراضي
    private static final String PASSWORD = ""; // كلمة المرور الافتراضية

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

