/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiprogramming;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Hoai Nguyen
 */
public class PaintPanel extends JFrame{
    
    public PaintPanel(){
        setTitle("Paint");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(100, 100, 100, 100);
        
    }
    public static void main(String[] args){
        PaintPanel paint = new PaintPanel();
    }
    
}
