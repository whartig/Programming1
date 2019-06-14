import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  //Creates the title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //tells program to close when it's done
		frame.setSize(400, 400); //sets width/height of object

		Shapes r = new Shapes(); //Creating the Shapes object
		frame.add(r); //adding r to the frame

		frame.setVisible(true); //show frame
	}
}
