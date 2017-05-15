/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import entities.Product;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author phamh
 */
public class MainClass {
    public static void main(String[] args){
        QueryData queryData = null;
        ReadingExcelFile readFile = null;
        
        // khoi tao QueryData va ket noi database
        try {
            queryData = new QueryData();
            System.out.print("\n successfully init queryData ");
            
        } catch (SQLException ex) {
            
            System.out.print("\n unsuccessfully init queryData ");
            
        } catch (ClassNotFoundException ex) {
           
            System.out.print("\n unsuccessfully init queryData ");
        }
        
        
        // open excel file
        try {
            readFile = new ReadingExcelFile("Products.xlsx");
            System.out.print("\n initial readFile iss successful");
            
        } catch (IOException ex) {
            
            System.out.print("\n readFile initial is unsuccessful 1");   
        }
        
        
        
        // thuc hien cau truy van
//        Product product = readFile.getProductFromFile(90);
//        queryData.insertProduct(product);
          queryData.clearAllData("hanghoa");

            
    
        if(readFile != null)
            readFile.closeFile();
        if(queryData != null)
            queryData.closeDatabase();
    }
}
