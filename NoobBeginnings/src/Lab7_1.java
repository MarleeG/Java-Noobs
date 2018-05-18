//Details: Temperature Conversions between Celsius and Fahrenheit. (Revisit Lab 3-1)
import java.util.Scanner;

@SuppressWarnings("unused")
public class Lab7_1 {

	public static void main(String[] args) {

		// Display table
		System.out.println( // Header
				"Celsius     Fahrenheit     |     Fahrenheit     Celsius\n" +
				"-------------------------------------------------------");
		// Display data
		for (double celsius = 40.0, fahrenheit = 120.0; 
				celsius >= 31.0; celsius--, fahrenheit -= 10) {
			System.out.printf("%-12.1f", celsius);
			System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
			System.out.printf("     %-15.1f", fahrenheit);
			System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));
		}
	}

	//Celsius to Fahrenheit 
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}


	//Fahrenheit to Celsius
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}