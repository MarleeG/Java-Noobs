//
import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		//Created scanner object
				Scanner iP = new Scanner(System.in);

				//Prompt user for input
				System.out.println("Enter a number to find out the degree in Celsius to convert it to Fahrenheit:");

				//Fahrenheit variable created
				double celsius = iP.nextDouble();
				double fH = (1.8 * celsius) + 32;

				//Output
				System.out.println("Awesome number! Your temperature in Fahrenheit is " + fH + " degrees.");
				
				iP.close();
	}	
}