//Details: Program will calculate sum, difference, product, quotient, and average of 2 numbers provided by the user. 

import java.util.Scanner;

public class Lab1_1 {

	public static void main(String[] args) {

		//Created Scanner 
		Scanner input = new Scanner(System.in);

		//User input required
		System.out.println("Enter two digits:");
		double firstNumber = input.nextDouble();
		double secondNumber = input.nextDouble();


		//Sum of input
		double sum = (firstNumber + secondNumber);

		//result
		System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum + ".");


		//Difference of input
		double diff = (firstNumber - secondNumber);

		//result
		System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is " + diff + ".");


		//Product of input
		double prod = (firstNumber * secondNumber);

		//result
		System.out.println("The product of " + firstNumber + " and " + secondNumber + " is " + prod + ".");

		//Quotient of input
		double quot = (firstNumber / secondNumber);

		//result
		System.out.println("The quotient of " + firstNumber + " and " + secondNumber + " is " + quot + ".");

		//Average of input
		double avg = ((firstNumber + secondNumber) / 2);

		//result
		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + avg + ".");

		//Completion statement 
		System.out.println("Congratulations! You are now able to compute the sum, difference, product, quotient, and average of " + firstNumber + " and " + secondNumber + ".");

		input.close();
	}
}