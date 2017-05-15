/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import entities.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamh
 */

public class QueryData {
    
   private Connection connection;
   //private PreparedStatement preStatement;
   //private Statement statement;
   //private ResultSet resultSet;
   public QueryData() throws SQLException, ClassNotFoundException{
       connection = new ConnectionUtils().getMySQLConnection();
   }
   
   // them 1 record hang hoa
   ////////////////////////////////////////////////////////////////////////////
   public void insertProduct(Product product){
       
       try {
           String sql = "insert into hanghoa (MAHANGHOA, TENHANGHOA, GIABAN, GIAVON, TONKHO, NHOMHANGHOA, DINHMUCTONITNHAT, DINHMUCTONNHIEUNHAT) values (?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement preStatement = connection.prepareStatement(sql);
           preStatement.setString(1, product.getMaHangHoa());
           preStatement.setString(2, product.getTenHangHoa());
           preStatement.setInt(3, product.getGiaBan());
           preStatement.setInt(4, product.getGiaVon());
           preStatement.setInt(5, product.getTonKho());
           preStatement.setString(6, product.getNhomHangHoa());
           preStatement.setInt(7,product.getDinhMucTonItNhat());
           preStatement.setInt(8, product.getDinhMucTonNhieuNhat());


//           PreparedStatement preStatement = connection.prepareStatement(sql);
//           preStatement.setString(1, "SP003");
//           preStatement.setString(2, "Ao Nike");
//           preStatement.setInt(3, 300);
//           preStatement.setInt(4,250);
//           preStatement.setInt(5, 5);
//           preStatement.setString(6, "Ao the thao");
//           preStatement.setInt(7,3);
//           preStatement.setInt(8, 7);
           
           preStatement.execute();
           
           
           System.out.print("\n successfully insert data");
//        Statement statement = (Statement) connection.createStatement();
//        String sql2 = "insert into hanghoa (MAHANGHOA, TENHANGHOA, GIABAN, GIAVON, TONKHO, NHOMHANGHOA, DINHMUCTONITNHAT, DINHMUCTONNHIEUNHAT)"
//                            + " values (SP0032, Ao Nike, 300, 250, 4, Ao the thao, 4, 7)";
//        statement.execute(sql2);
       } catch (SQLException ex) {
          System.out.print("\n unsuccessfully insert data");
       }
   }
   
   
   // them 1 recode hang hoa
   //////////////////////////////////////////////////////////////////////////
    public void insertProduct(Product product, int tonKho, int dinhMucTonItNhat, int dinhMucTonNhieuNhat){
       
       try {
           String sql = "insert into hanghoa (MAHANGHOA, TENHANGHOA, GIABAN, GIAVON, TONKHO, NHOMHANGHOA, DINHMUCTONITNHAT, DINHMUCTONNHIEUNHAT) values (?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement preStatement = connection.prepareStatement(sql);
           preStatement.setString(1, product.getMaHangHoa());
           preStatement.setString(2, product.getTenHangHoa());
           preStatement.setInt(3, product.getGiaBan());
           preStatement.setInt(4, product.getGiaVon());
           preStatement.setInt(5, tonKho);
           preStatement.setString(6, product.getNhomHangHoa());
           preStatement.setInt(7, dinhMucTonItNhat);
           preStatement.setInt(8, dinhMucTonNhieuNhat);


//           PreparedStatement preStatement = connection.prepareStatement(sql);
//           preStatement.setString(1, "SP003");
//           preStatement.setString(2, "Ao Nike");
//           preStatement.setInt(3, 300);
//           preStatement.setInt(4,250);
//           preStatement.setInt(5, 5);
//           preStatement.setString(6, "Ao the thao");
//           preStatement.setInt(7,3);
//           preStatement.setInt(8, 7);
           
           preStatement.execute();
           
           
           System.out.print("\n successfully insert data");
        }catch (SQLException ex) {
            System.out.print("\n unsuccessfully insert data");
        }
   }
   
    
    //////////////////////////LAM TOI DAY ROI////////////////////////////
    public Product getProductFromDatabase(String maHangHoa){
        
        return null;
    }
    //  xoa het du lieu cua table
   public void clearAllData(String tableName){
       try {
            Statement statement = (Statement) connection.createStatement();
            String sql2 = "delete from " + tableName;
            statement.execute(sql2);
           
           System.out.print("\nclear all data in table " + tableName + " successfully!");
       } catch (SQLException ex) {
           System.out.print("\nclear all data in table " + tableName + " unsuccessfully!");
       }
   }
   
   
   
   public void closeDatabase(){
       try {
           connection.close();
           System.out.print("\nSuccessfully close connection");
           
       } catch (SQLException ex) {
           System.out.print("\nUnuccessfully close connection");
       }
   }
}
