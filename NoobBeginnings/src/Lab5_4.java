//Details: Binary to decimal
import java.util.Scanner;

public class Lab5_4 {

	public static void main(String[] args) {

		//Created Scanner Object
		Scanner input = new Scanner(System.in);

		//User Input required
		System.out.println("Hello! I am here to help convert a binary number into it's decimal equivalent.");
		System.out.print("Enter a binary number: ");
		String binaryString = input.nextLine();
		
		//Output
		System.out.println("Output:" + Integer.parseInt(binaryString,2));

		//Close Scanner Object
		input.close();
	}
}