//Details: Calculating the Body Mass Index (BMI)
import java.util.Scanner;

public class Lab3_3 {

	public static void main(String args [] ) {

		//Created Scanner Objects 
		Scanner input = new Scanner(System.in);

		//Prompt user for input
		System.out.println("Hello! I am here to help calculate your BMI (Body Mass Index) to determine if you are underweight, normal weight, overweight, or obese. \nTell me a lttle about yourself!");
		System.out.println("Let's start with your weight. Please enter your weight in pounds. Once you've entered your weight please press \"Enter\".");
		double weight = input.nextDouble();

		System.out.println("Let's get some details about your height! If your height is 5 ft 10 inches please enter your height as \"5\" feet and your inches as \"10\".");
		System.out.println("Please enter the feet portion of your height:");
		int feet = input.nextInt();
		System.out.println("Enter the inches portion of your height:");
		int inches = input.nextInt();

		//Calculations
		double height1 = (12.0/1.0) * feet;
		double officialHeight = height1 + inches;
		double bmi = weight / (officialHeight * officialHeight);
		double bmiOfficial = bmi * 703;

		//Output
		System.out.println("Your BMI is " + bmiOfficial + ".");

		//Parameters
		if (bmiOfficial < 18.5) {
			System.out.println("You're underweight.");
		}
		else if (bmiOfficial >= 18.5 && bmiOfficial < 25) {
			System.out.println("You're normal weight.");
		}
		else if (bmiOfficial >= 25 && bmiOfficial < 30) {
			System.out.println("You're overweight.");
		}
		else {
			System.out.println("You're obese.");
		}

		//Close scanner objects
		input.close();
	}	
}