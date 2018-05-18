// TODO Auto-generated method stub
import java.util.Scanner;

public class Lab1_3 {

	public static void main(String[] args) {

		//Scanner Created
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount less than $1.00:");
		double amount = input.nextDouble();

		//Amounts
		int remainingAmount = (int)(amount * 100);

		@SuppressWarnings("unused")
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		int numberOfQuarters = remainingAmount /25;
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10; 

		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount / 1;

		//Output
		System.out.println("Your amount of " + amount + " cents consists of \n" + "\t" + "numberOfOneDollars" + "dollars\n" + "\t" + numberOfQuarters + "quarters\n" + "\t" + numberOfDimes + "dimes\n" + "\t" + numberOfNickels + "nickels\n" + "\t" + numberOfPennies + "pennies\n" + "\t");	

		//Close Scanner Object
		input.close();
	}
}