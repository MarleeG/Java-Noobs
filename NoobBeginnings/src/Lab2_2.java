//Details: Sum the digits in an integer

import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {

		//Created scanner object
		Scanner iP = new Scanner(System.in);

		//Prompt user for input
		System.out.println("Enter a number between 0 and 1000: ");
		int number = iP.nextInt();

		//Calculations
		int lessThan10 = (number % 10);		
		number /= 10;							
		int tens = (number % 10);				
		number /= 10;							
		int hundreds = (number % 10);		
		number /= 10;							
		int sum = hundreds + tens + lessThan10;	

		// Output
		System.out.println("Great number! The sum of those digits are " + sum + ".");

		iP.close();

		System.out.println("");
	}
}