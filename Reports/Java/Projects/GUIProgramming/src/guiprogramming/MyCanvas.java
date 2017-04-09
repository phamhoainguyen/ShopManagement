/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiprogramming;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Hoai Nguyen
 */
class MyCanvas extends JPanel {

  @Override
  public void paintComponents(Graphics g) {
      super.paintComponent(g);
      this.setBackground(Color.WHITE);
      g.setColor(Color.BLACK);
      g.fillOval(100, 100, 100, 100);
  }
}

