/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HangHoa;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author phamh
 */
public class Window {
    public static void main(String args[])
    {
         
      Container cpane;
      JFrame frame = new JFrame("ELEVATOR");
      cpane = frame.getContentPane();
      ThietLapGia lp1 = new ThietLapGia();
      Hanghoa.JPanel_Danhmuchanghoa dmhh = new Hanghoa.JPanel_Danhmuchanghoa();
      frame.setSize(900,500);
      
      frame.add(new index());
      frame.setVisible(true);
      
      
      //frame.add(lp1);
      //frame.add(dmhh);
     
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     
    }
}
