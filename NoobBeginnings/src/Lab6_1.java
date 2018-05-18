//Details: (Sum a Series)
import java.util.Scanner;

public class Lab6_1 {

	public static void main(String[] args) {

		//Scanner Object Created
		Scanner input = new Scanner(System.in);

		//User Input required 
		System.out.println("What's your name?");
		String name = input.nextLine();
		System.out.println("Hello " + name + "! I am here to help you find the sum of the following series: \n1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + . . . + 95/97 + 97/99");

		//for loop
		double sum = 0.0;
		for (double i= 1; i <= 97; i+= 2) {
			sum+= i/(i+2);
		}

		//Output
		System.out.println("The sum is " + sum + ".");

		//Closed Scanner Object
		input.close();
	}
}