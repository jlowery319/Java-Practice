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

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        
        Graphics2D g2d = (Graphics2D)g;
        
        // get a random color every time this method runs
        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);
        Color paintColor = new Color(red, green, blue);
        
        // fill background
        g2d.setColor(Color.white);
        g2d.fillRect(0,0, this.getWidth(), this.getHeight());
        // set color for oval & create oval
        g2d.setPaint(paintColor);
        g2d.fillOval(70,70,100,100);
    }
}
