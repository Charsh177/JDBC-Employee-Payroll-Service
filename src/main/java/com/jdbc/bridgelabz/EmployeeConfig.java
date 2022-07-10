package com.jdbc.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConfig {
    public static Connection getConfig() {
        String URL_JD = "jdbc:mysql://localhost:3306/payroll_service";
        String USER_NAME = "root";
        String PASSWORD = "Happy12345678";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded!!");
            connection = DriverManager.getConnection(URL_JD, USER_NAME, PASSWORD);
            System.out.println("connection Established!!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

//    public static void main(String[] args) {
//        EmployeeConfig e = new EmployeeConfig();
//        EmployeeConfig.getConfig();
//    }
}