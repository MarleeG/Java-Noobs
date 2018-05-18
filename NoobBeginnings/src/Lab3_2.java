//Details: Compute the perimeter of a triangle
import java.util.Scanner;

public class Lab3_2 {
	
	public static void main(String args []) {

		//Created Scanner Objects
		Scanner input = new Scanner(System.in);

		//Prompt user for input
		System.out.println("Hello! I am here to help you find the perimeter of a triangle.\nYou will enter in three numbers which will add up to be the perimeter.\nAfter each number is entered press \"Enter\". ");
		System.out.println("Enter a number that will represent the first side of a triangle.");
		int firstSide = input.nextInt();

		//Prompt user for input
		System.out.println("Enter a number that will represent the second side of a triangle.");
		int secondSide = input.nextInt();

		//Prompt user for input
		System.out.println("Enter a number that will represent the third side of a triangle.");
		int thirdSide = input.nextInt();

		//Calculations
		int perimeter = firstSide + secondSide + thirdSide;

		//Parameters 
		if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
			System.out.println("This is a valid triangle. The perimeter of the triangle is " + perimeter + "." );
		}
		else {
			System.out.println("Please run the program again and be sure the input is valid if the sum of every pair of two edges is greater than the remaining edge.");
		}

		//Closed Scanner Objects
		input.close();
	}
}