/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author Jessica
 */

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class PracticeGUI {
    
    JFrame frame;
    JLabel label;
    
    public static void main(String[] args) {
        PracticeGUI pg = new PracticeGUI();
        pg.go();
    }
    
    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());
        
        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ColorListener());
        
        MyDrawPanel drawPanel = new MyDrawPanel();
        label = new JLabel("Label");
        
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        
        frame.setSize(400,300);
        frame.setVisible(true);
    } 
    
    // inner classes for different buttons
    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Label clicked");
        }
    }
    
    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }
    
    
}
