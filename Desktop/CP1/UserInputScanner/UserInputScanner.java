
import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = kin.nextLine();

		System.out.println("Hello " + name + ", it's nice to meet you!");

		System.out.print("What is your Last Name? ");
		String LastName = kin.nextLine();

		System.out.println(LastName + ", " + name + " " + LastName + ", Welcome to MI6");
        
        System.out.print("What us your address? ");
        String Add = kin.nextLine();
        
        System.out.println(Add + ":Encrypting... Please Wait");
        
        System.out.print("What is your Zip Code? ");
        String Zip = kin.nextLine();
        
        System.out.println("" + Zip + ":Encrypting... Please Wait");
        
        System.out.print("What is your City? ");
        String Cit = kin.nextLine();
        
        System.out.println("" + Cit + ":Encrypting... Please Wait");
        
        System.out.println("You will recieve a package with all the information you need in the coming days at " + Add + " in " + Cit + ". Good Luck!");
	}
}
