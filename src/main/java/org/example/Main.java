package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) throws SQLException {
            String dburl = "jdbc:mysql://localhost:3306/classicmodels";
            String user = "root";
            String password = "Ind@1590";
            //try {
                //Class.forName("com.mysql.cj.jdbc.Driver"); // optional
                Connection connection = DriverManager.getConnection(dburl, user, password);
                connection.close();

           // }
            //catch(SQLException | ClassNotFoundException e) {
              //  e.printStackTrace();
           // }
        }
}