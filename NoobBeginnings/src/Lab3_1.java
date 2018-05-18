//Details: Convert Celsius to  Fahrenheit && Fahrenheit to Celcius

import java.util.Scanner;

public class Lab3_1 {

	public static void main(String args [ ]) {

		//Declared variables		
		double degreesF;
		double degreesC;

		//Created Scanner Object
		Scanner input = new Scanner(System.in);

		//User's instructions
		System.out.println("Hello! I am here to help convert any temperature from Celcius to Fahrenheit  \nand also from Fahrenheit to Celcius.");

		//User input required
		System.out.println("Enter temperature: ");
		double x = input.nextInt();

		System.out.println("Enter C or c for Celcius or an F or f for Fahrenheit");
		char temp = input.next(".").charAt(0);

		//switch statement
		switch (temp) {
		case 'C':

			degreesF = .5555555556 * (x - 32);
			System.out.println(x + " degrees Fahrenheit is " + degreesF + " Celcius.");
			break;

		case 'c':
			degreesF = .5555555556 * (x - 32);
			System.out.println(x +" degress Fahrenheit is "+ degreesF + " Celcius.");
			break;

		case 'F':
			degreesC = 1.8 * x + 32;
			System.out.println(x + " degrees Celcius is " + degreesC + " Fahrenheit.");
			break;

		case 'f':
			degreesC = 1.8 * x + 32;
			System.out.println(x + " degrees Celcius is " + degreesC + " Fahrenheit.");
			break;

		default: 
			System.out.println("Error! Please run the program again and try again.");
		}

		//Closed Scanner Object
		input.close();
	}		
}