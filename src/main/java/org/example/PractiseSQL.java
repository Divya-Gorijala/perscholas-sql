package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PractiseSQL {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/classicmodels";
        String user="root";
        String pswd="Ind@1590";

        try {
            //Loading class
            //Class.forName("com.mysql.jdbc.Driver");
            //Opening DataBase Connection
            Connection conn= DriverManager.getConnection(url,user,pswd);
            //select statement
            String selectSQL= "Select * from employees";
            //create statement
            Statement stmt = conn.createStatement();
            //execute query
            ResultSet result=stmt.executeQuery(selectSQL);

            while(result.next()){
                String name = result.getString("firstName");
                String email = result.getString("email");
                System.out.println(name+" | "+email);
            }
            conn.close();
        }
       catch (Exception e){
           System.out.println(e);
        }
    }
}
