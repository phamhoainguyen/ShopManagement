/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author phamh
 */
public class ConnectionUtils {
    public Connection getMySQLConnection() throws SQLException, ClassNotFoundException{
        String hostName = "localhost";
        String dbName = "shop";
        String userName = "root ";
        String password = "123456";
        return getMySQLConnection(hostName, dbName, userName, password);
    }
    
    public Connection getMySQLConnection(String hostName, String dbName,
         String userName, String password) {

     String connectionURL = "jdbc:mysql://localhost:3306/shop?useSSL=false";
     Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionURL, "root", "123456");
            System.out.print("Get connection successfully");
        } catch (SQLException ex) {
            
            System.out.print("Get connection unsuccessfully");
        }
//    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "123456");  
         return conn;
    }
    
//    public static void main(String[] args){
//        ConnectionUtils conn = new ConnectionUtils();
//        try {
//            conn.getMySQLConnection();
//            System.out.print("Success");
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectionUtils.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.print("Error 1");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ConnectionUtils.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.print("Error");       
//        }
//    }
}
