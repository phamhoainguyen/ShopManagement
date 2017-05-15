/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manhinhgiaodien;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class JFrame_Giaodien extends JFrame{
    //public JFrame_Giaodien(){
    //}
    
public static void main (String[] args) {
    JFrame frame = new JFrame("HÓA ĐƠN BÁN HÀNG");
    JPanel_Hoadonbanhang jp1 = new JPanel_Hoadonbanhang();
    frame.setVisible(true);
    frame.setSize(1400, 1200);
    frame.add(jp1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
