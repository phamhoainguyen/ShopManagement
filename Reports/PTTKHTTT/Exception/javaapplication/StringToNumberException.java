/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author phamh
 */
public class StringToNumberException {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        String string = input.next();
        try{
            System.out.println(Integer.parseInt(string));
        }
        catch(NumberFormatException e){ //NumberFormatException 
            System.out.print(e.getMessage());
            System.out.print("\nChuoi khong hop le");
            //e.printStackTrace();
        }
    }
}
