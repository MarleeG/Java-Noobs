//Details: Calculating the Body Mass Index (BMI).
import java.util.Scanner;

public class Lab2_3 {

	public static void main(String [] args) {

		//Created scanner object
		Scanner iP = new Scanner (System.in);

		//Prompt user for input
		System.out.print("Enter your weight in pounds: ");
		double weight = iP.nextDouble();

		//Calculation
		//double weightInKg = weight * 0.45; //42.975

		//Created another scanner object
		Scanner iP2 = new Scanner (System.in);

		//Prompt user for input
		System.out.print("Enter your height in inches: ");
		double height = iP.nextDouble();

		/*
		 * Calculations
		 * double heightInMeters = height * 0.025; //1.25
					double heightInMeters2 = heightInMeters * heightInMeters; //1.5625
		 */


		
		//double bmi = weightInKg / heightInMeters2;
		double bmi = weight/(height * height) *703;

		//Output
		System.out.println("Your BMI is " + bmi + "." );

		//Closed Scanner Objects
		iP.close();
		iP2.close();
	}
}