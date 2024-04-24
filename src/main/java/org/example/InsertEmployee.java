package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertEmployee {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "Ind@1590";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try{
        Connection connection = DriverManager.getConnection(dburl, user, password);
        String sqlQuery = "insert into employees (officeCode,firstName,lastName,email,extension,reportsTo,VacationHours,employeeNumber,jobTitle)" +
                " values (?,?,?,?,?,?,?,?,?)";
           PreparedStatement prepStmt = connection.prepareStatement(sqlQuery);
            prepStmt.setInt(1, 6);
            prepStmt.setString(2, "Jamil");
            prepStmt.setString(3, "fink");
            prepStmt.setString(4, "JJ@gmail.com");
            prepStmt.setString(5, "2759");
            prepStmt.setInt(6, 1143);
            prepStmt.setInt(7, 9);
            prepStmt.setInt(8, 0003);
            prepStmt.setString(9, "Manager");
            int affectedRows = prepStmt.executeUpdate();
            System.out.println(affectedRows + " row(s) affected !!");
        }
        catch (Exception e){
        System.out.println(e);
    }
    }
}
