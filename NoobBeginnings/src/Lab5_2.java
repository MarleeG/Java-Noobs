//Details: Find the Unicode of a character (Chapter4: Ex 4.9)
import java.util.Scanner;

public class Lab5_2 {

	public static void main(String[] args) {

		//Created Scanner Object
		Scanner input = new Scanner(System.in);

		//User Input required
		System.out.println("Hello! I am here to help you find the ASCII Code's character. \nEnter a character: ");
		String i = input.nextLine();
		char ch = i.charAt(0);

		//Output
		System.out.print("The Unicode for the character " + ch + " is " + (int) ch);

		//Closed Scanner Object
		input.close();
	}	
}