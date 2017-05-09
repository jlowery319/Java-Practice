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

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;

public class Animation {
    
    int x = 70;
    int y = 70;
    
    public static void main(String[] args) {
        Animation a = new Animation();
        a.start();
    }
    
    public void start() {
        // create window
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawPanel draw = new DrawPanel();
        
        // add panel to window
        frame.getContentPane().add(draw);
        
        // make window visible
        frame.setSize(400,400);
        frame.setVisible(true);
        
        for (int i = 0; i < 90; i++) {
            // increment coordinates, moves circle across screen
            x = x+2;
            y++;
            draw.repaint(); // refresh panel in window
            try {
                Thread.sleep(50);
            }
            catch (Exception e) {}
        }
        
    }
    
    // inner class 
    class DrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            // set entire background to white
            // clears previous oval on refresh
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            
            g.setColor(Color.orange);
            g.fillOval(x,y,100,100);
        }
    }
}
