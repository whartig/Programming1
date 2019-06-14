 


/**
 * Mickey Mouse
 *
 * WillHartig
 * lol I Dunno 69
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MMousePicture extends JComponent {
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(Color.black);
        Ellipse2D.Double Head = new Ellipse2D.Double(100, 100, 200, 200);
        g2.fill(Head);
        
        g2.setColor(Color.black);
        Ellipse2D.Double Lear = new Ellipse2D.Double(60, 60, 100, 100);
        g2.fill(Lear);
        
        g2.setColor(Color.black);
        Ellipse2D.Double Rear = new Ellipse2D.Double(230, 60, 100, 100);
        g2.fill(Rear);
	}
}
