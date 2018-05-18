//Details: Processing Strings
import java.util.Scanner;

public class Lab5_5 {

	public static void main(String[] args) {

		//Scanner Object
		Scanner input = new Scanner(System.in);

		//User input required
		System.out.println("Hello! I am here to point out the last character in a string.\nEnter a string like \"I love to hike\" .");
		System.out.println("Enter your string:");
		String str = input.nextLine();
		System.out.println("last char = " + str.charAt(str.length() - 1));
		
		//Closed Scanner Object
		input.close();
	}
}