import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class Shapes extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g; //importing graphics 2d

		Rectangle box = new Rectangle(5, 10, 20, 30); //Draws Rectangle coordinate (5,10) and width 20 height 30
		g2.draw(box);//Draw the box

		g2.setColor(Color.blue);//makes the color blue

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);//make a circle with the parameters
		g2.fill(circle); //fill in a circle
	}
}
