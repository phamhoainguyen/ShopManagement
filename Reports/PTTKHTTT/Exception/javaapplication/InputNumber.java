/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author phamh
 */
public class InputNumber {
    public static void checkNegativeNumber(int n) throws UnsignedIntegerException{
        if(n < 0) {
          throw new UnsignedIntegerException("Số nhập vào không thể là số âm");
       }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n:");
        
        try{
            int n = input.nextInt();
            checkNegativeNumber(n);
        }
        catch(UnsignedIntegerException e){ 
            System.out.print(e.getMessage());
        }
    }
}
