/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author phamh
 */


public class CreatingProductCode {
    public static int productQuantity = 0;
    public static String createCode(){
        String code = "SP" + String.format("%06d", ++productQuantity);
        return code;
    
    }
    
}
