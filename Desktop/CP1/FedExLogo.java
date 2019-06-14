 


/**
 * Write a description of class LoopDrawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class FedExLogo extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
	/******** Put your code here  *********/
        
        Color purple = new Color(63, 48, 130);
        Color white = new Color(238 ,238, 238);
        Color orange = new Color(237, 100, 43);
        g2.setColor(purple);
        
        Rectangle boxF1 = new Rectangle(50, 50, 90, 30);
        g2.draw(boxF1);
        g2.fill(boxF1);
        
        Rectangle boxF2 = new Rectangle(50, 80, 40, 120);
        g2.draw(boxF2);
        g2.fill(boxF2);

        Rectangle boxF3 = new Rectangle(80, 110, 50, 30);
        g2.draw(boxF3);
        g2.fill(boxF3);
        
        Ellipse2D.Double circlee1 = new Ellipse2D.Double(120, 100, 100, 100);
        g2.draw(circlee1);
        g2.fill(circlee1);
        
        g2.setColor(white);
        Ellipse2D.Double circlee2 = new Ellipse2D.Double(145, 120, 50, 60);
        g2.draw(circlee2);
        g2.fill(circlee2);

        g2.setColor(purple);
        Rectangle boxe1 = new Rectangle(140, 140, 60, 20);
        g2.draw(boxe1);
        g2.fill(boxe1);
        
        g2.setColor(white);
        Rectangle boxe2 = new Rectangle(180, 161, 40, 15);
        g2.draw(boxe2);
        g2.fill(boxe2);
        
        g2.setColor(purple);
        Ellipse2D.Double circled1 = new Ellipse2D.Double(205, 100, 100, 100);
        g2.draw(circled1);
        g2.fill(circled1);
        
        Rectangle boxd1 = new Rectangle(280, 50, 35, 150);
        g2.draw(boxd1);
        g2.fill(boxd1);
        
        g2.setColor(white);
        Ellipse2D.Double circled2 = new Ellipse2D.Double(240, 120, 40, 60);
        g2.draw(circled2);
        g2.fill(circled2);
        
        g2.setColor(orange);
        Rectangle boxE1 = new Rectangle(315, 50, 40, 150);
        g2.draw(boxE1);
        g2.fill(boxE1);
        
        Rectangle boxE2 = new Rectangle(355, 50, 55, 35);
        g2.draw(boxE2);
        g2.fill(boxE2);
        
        Rectangle boxE3 = new Rectangle(355, 110, 55, 25);
        g2.draw(boxE3);
        g2.fill(boxE3);
        
        Rectangle boxE4 = new Rectangle(355, 170, 55, 30);
        g2.draw(boxE4);
        g2.fill(boxE4);
        
        Rectangle boxx1 = new Rectangle(410, 110, 120, 90);
        g2.draw(boxx1);
        g2.fill(boxx1);
        
        //Trix 1
        g2.setColor(white);
        int x1[] = {410, 450, 410};
        int y1[] = {110, 155, 200};
        g.drawPolygon(x1, y1, 3);
        g.fillPolygon(x1, y1, 3);
        
        //Trix 2
        int x2[] = {450, 490, 470};
        int y2[] = {110, 110, 130};
        g.drawPolygon(x2, y2, 3);
        g.fillPolygon(x2, y2, 3);
        
        //Trix 3
        int x3[] = {530, 490, 530};
        int y3[] = {110, 155, 200};
        g.drawPolygon(x3, y3, 3);
        g.fillPolygon(x3, y3, 3);
        
        //Trix 4
        int x4[] = {450, 490, 470};
        int y4[] = {200, 200, 175};
        g.drawPolygon(x4, y4, 3);
        g.fillPolygon(x4, y4, 3);
        
   	// comment this out once you have finished
        //drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
    }
}
