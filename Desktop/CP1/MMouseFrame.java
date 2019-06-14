 import javax.swing.JFrame;

public class MMouseFrame{
    public static void main(String[] args){
	
	// You should change the Title
        JFrame frame = new JFrame("Frame for Picture");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MMousePicture picture = new MMousePicture();
        frame.add(picture);
        
        frame.setVisible(true);
    }
}
