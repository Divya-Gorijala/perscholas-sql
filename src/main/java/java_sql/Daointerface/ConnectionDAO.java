package java_sql.Daointerface;

import java.sql.*;

public class ConnectionDAO{
    static Connection con=null;
    protected PreparedStatement ps =null;
    protected ResultSet rs= null;
    public static Connection getConnection() throws ClassNotFoundException{
        final String DBURL = "jdbc:mysql://localhost:3306/library";
        final String DBUSERNAME ="root";
        final String DBPASSWORD = "Ind@1590";
        try{
            con= DriverManager.getConnection(DBURL,DBUSERNAME,DBPASSWORD);
            System.out.println("Connected Database Successfully");
        }
        catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }
    public void disconnect() {
        try {
            // Close the ResultSet if it's not null
            if (rs != null) {
                rs.close();
            }
            // Close the PreparedStatement if it's not null
            if (ps != null) {
                ps.close();
            }
            // Close the Connection if it's not null
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            // TODO: Properly handle the exception
            e.printStackTrace(); // Print the exception stack trace for debugging purposes
        }
    }


}