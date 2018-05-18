//Details: Find out how many miles Jake can travel on a full tank of gas.

import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {

		//Output
		System.out.println("Find out how many miles Jake can travel on a full tank of gas. ");

		//Created Scanner Object
		Scanner tS = new Scanner(System.in);
		Scanner gL = new Scanner(System.in);
		Scanner mT = new Scanner(System.in);

		//Output
		System.out.println("Enter a fuel capacity between: ");

		//Declare variable tankSize
		double tankSize = tS.nextDouble();

		//Output
		System.out.println("Enter the miles traveled: ");

		//Declare variable milesTraveled
		double milesTraveled = mT.nextDouble();

		//Output
		System.out.println("Enter the remaining gallons less than what you have entered for the fuel capacity: ");

		//Declare variable gallonsLeft
		double gallonsLeft = gL.nextDouble();


		//formula
		double driveFullTank = (tankSize * milesTraveled) / (tankSize - gallonsLeft);

		//Output
		System.out.println("Jake can drive " + driveFullTank + " miles on a full tank of gas.");

		tS.close();
		gL.close();
		mT.close();
	}
}