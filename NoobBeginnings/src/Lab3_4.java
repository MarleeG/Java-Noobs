//Details: Middle Value
import java.util.Scanner;

public class Lab3_4 {

	public static void main(String args []) {

		//Created Scanner Objects
		Scanner input = new Scanner(System.in);

		//Prompt user for input
		System.out.println("Hello! This program will help you locate the middle value. You will enter in 3 different numbers to begin.");
		System.out.println("Please enter in the first digit: ");
		int digitOne = input.nextInt();
		System.out.println("Please enter in the second digit: ");
		int digitTwo = input.nextInt();
		System.out.println("Please enter in the third digit: ");
		int digitThree = input.nextInt();

		//Parameters
		if (digitTwo > digitOne && digitOne > digitThree || digitThree > digitOne && digitOne > digitTwo) {
			System.out.println(digitOne + " is the middle value.");
		}

		if (digitOne > digitTwo && digitTwo > digitThree || digitThree > digitTwo && digitTwo > digitOne) {
			System.out.println(digitTwo + " is the middle value.");
		}

		if (digitOne > digitThree && digitThree > digitTwo || digitTwo > digitThree && digitThree > digitOne) {
			System.out.println(digitThree + " is the middle value.");
		}

		//Close Scanner Objects
		input.close();
	}	
}