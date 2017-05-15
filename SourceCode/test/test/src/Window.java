/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 



import java.awt.Container;
import java.awt.Frame;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;


import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument.Content;

/* MenuDemo.java requires images/middle.gif. */

/*
 * This class is just like MenuLookDemo, except the menu items
 * actually do something, thanks to event listeners.
 */
public class Window {
    
    private static JFrame frame;
    
    JTextArea output;
    JScrollPane scrollPane;
    ThietLapGia tlg;
    TongQuan tongQuan;
    Container contentPane;
    private final int THIET_LAP_GIA = 22;
    private final int TONG_QUAN = 1;
    private final int DANH_MUC = 21;
    private int idPanel;
    String newline = "\n";

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;

        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Thêm menu Tổng quan
        JMenu menuTongQuan = new JMenu("Tổng quan");
        //Thêm icon
        ImageIcon icon = createImageIcon("images/middle.gif");
        menuTongQuan.setIcon(icon);
        
        menuBar.add(menuTongQuan);
        //----------------------------Menu Hàng Hóa---------------------------
        //Thêm menu Hàng hóa
        JMenu menuHangHoa = new JMenu("Hàng hóa");
        menuBar.add(menuHangHoa);
        
        //MenuItem trong menu Hàng Hóa
       JMenuItem  menuItemDanhMuc = new JMenuItem("Danh mục", KeyEvent.VK_T);
        menuItemDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDanhMucActionPerformed(evt);
            }
        });
       
        menuHangHoa.add(menuItemDanhMuc);
        JMenuItem menuItemThietLapGia = new JMenuItem("Thiết lập giá", icon);
        menuItemThietLapGia.setMnemonic(KeyEvent.VK_B);
        //menuItemThietLapGia.addActionListener(this);
        menuHangHoa.add(menuItemThietLapGia);
        JMenuItem menuItemKiemKho = new JMenuItem("Kiểm kho", icon);
        menuHangHoa.add(menuItemKiemKho);
        //--------------------------------------------------------------------
        //Thêm menu Giao dịch
        JMenu menuGiaoDich = new JMenu("Giao dịch");
        menuBar.add(menuGiaoDich);
        
        //Thêm menu Giao dịch
        JMenu menuDoiTac = new JMenu("Đối tác");
        menuBar.add(menuDoiTac);
        
        //Thêm menu Giao dịch
        JMenu menuSoQuy = new JMenu("Sổ quỹ");
        menuBar.add(menuSoQuy);
        
        //Thêm menu Giao dịch
        JMenu menuBaoCao = new JMenu("Báo cáo");
        menuBar.add(menuBaoCao);
        
        


        return menuBar;
    }
    
    
//
    public Container setContentPane(Container container) {
        //Create the content-pane-to-be.
        contentPane = container;
        return contentPane;
    }


    public void itemStateChanged(ItemEvent e) {
        JMenuItem source = (JMenuItem)(e.getSource());
        String s = "Item event detected."
                   + newline
                   + "    Event source: " + source.getText()
                   + " (an instance of " + getClassName(source) + ")"
                   + newline
                   + "    New state: "
                   + ((e.getStateChange() == ItemEvent.SELECTED) ?
                     "selected":"unselected");
        output.append(s + newline);
        output.setCaretPosition(output.getDocument().getLength());
    }

    // Returns just the class name -- no package info.
    protected String getClassName(Object o) {
        String classString = o.getClass().getName();
        int dotIndex = classString.lastIndexOf(".");
        return classString.substring(dotIndex+1);
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Window.class.getResource(path);
        
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("SHOP MANAGERMENT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        Window demo = new Window();
        frame.setJMenuBar(demo.createMenuBar());
        
        frame.setContentPane(demo.setContentPane(new TongQuan()));

        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
    
    
    //Thêm sự kiên cho menuItemDanhMucActionPerformed
    private void menuItemDanhMucActionPerformed(java.awt.event.ActionEvent evt) {   
        //JOptionPane.showMessageDialog(null, "My Goodness, this is so concise");
        //frame.setContentPane(new ThietLapGia())
        frame.removeAll();
        frame.repaint();
        frame.revalidate();
        
        frame.add(new ThietLapGia());
        frame.repaint();
        frame.revalidate();
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}