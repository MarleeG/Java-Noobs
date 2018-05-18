//Details: Find the character of an ASCII code (Chapter4: Ex 4.8)
import java.util.Scanner;

public class Lab5_1 {

	public static void main(String[] args) {

		//Created Scanner Object
		Scanner input = new Scanner (System.in);

		//User Input required
		System.out.println("Hello! I am here to help you find the character from the ASCII Code. \nEnter a ASCII code between 1-127: ");
		int i = input.nextInt();

		//Output
		System.out.print("The character for ASCII code " + i + " is " + (char)i + ".");

		//Closed Scanner Object
		input.close();
	}
}