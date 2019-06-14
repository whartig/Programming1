 import javax.swing.JFrame;

public class FedExFrame
{
    public static void main(String[] args){
	
	// You should change the Title
        JFrame frame = new JFrame("FedEx logo");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	FedExLogo picture = new FedExLogo();
        frame.add(picture);
        
        frame.setVisible(true);
    }
}
