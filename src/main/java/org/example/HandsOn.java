package org.example;

import java.sql.*;
public class HandsOn {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "Ind@1590";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);
            String SelectSQL = "Select * FROM employees where officeCode between ? and ?";
            PreparedStatement mystmt = connection.prepareStatement(SelectSQL);
            mystmt.setInt(1,1);
            mystmt.setInt(2,4);
            ResultSet result =  mystmt.executeQuery();
            while(result.next())
            {
                String EmployeeID  = result.getString("employeeNumber");
                String fname = result.getString("firstName");
                String lname  = result.getString("lastName");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname );
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
