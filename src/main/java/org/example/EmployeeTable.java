package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeTable {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "Ind@1590";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try{
            Connection connection = DriverManager.getConnection(dburl, user, password);
            String SelectSQL = "Select * FROM employees where employeeNumber = ?";
            PreparedStatement myStmt = connection.prepareStatement(SelectSQL);
            myStmt.setInt(1,1002);
            ResultSet result = myStmt.executeQuery();
            while(result.next())
            {
                String name = result.getString("firstName");
                String email  = result.getString("email");
                System.out.println(name +" | " + email);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
