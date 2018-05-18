//Details: (Math tutor)
import java.util.Scanner;

public class Lab6_3 {

	public static void main(String[] args) {

		//Scanner Object Created
		Scanner input = new Scanner(System.in);

		//Variables
		int number1;
		int number2;

		int choice;

		//Do While-loop
		do {
			//User Input Required
			System.out.println("Pick a number corresponding to the math operation you would like to try.\n  \n");
			System.out.println("Main Menu: \n1: Addition \n2: Subtraction \n3: Multiplication \n4: Division \n5: Exit \nEnter a choice: ");
			choice = input.nextInt();

			// Switch case
			switch (choice) {

			//Case 1 Addition
			case 1:
				//Variables 
				number1 = ((int)(Math.random() * 10));
				number2 = ((int)(Math.random() * 10));
				
				//Stores answer
				int addAnswer = (number1 + number2);

				//User Input Required
				System.out.println("What is the answer of " + number1 + " + " + number2 + " = ");
				int ans = input.nextInt();

				//if else statement
				if (ans == addAnswer) {
					System.out.println("Correct");
				} 
				else {
					System.out.println("Your answer is wrong. The correct answer is: " + addAnswer);
				}
				break;

			//Case 2 Subtraction
			case 2: 
				//Variables 
				int ans2;
				number1 = ((int)(Math.random() * 10));
				number2 = ((int)(Math.random() * 10));

				//If, else if statement
				if ((number1 - number2) < 0 ) {

					//Variables
					int subtractAnswer1 = (number2 - number1);

					//User Input Required
					System.out.println("What is the answer of " + number2 + " - " + number1 + " = ");
					ans2 = input.nextInt();

					//nested if else statement
					if (ans2 == subtractAnswer1) {
						System.out.println("Correct");
					} 
					else {
						System.out.println("Your answer is wrong. The correct answer is: " + subtractAnswer1);
					}
				}
				else if ((number1 - number2) >= 0) {
					//Variables
					int subtractAnswer2 = (number1 - number2);

					//Input required
					System.out.println("What is the answer of " + number1 + " - " + number2 + " = ");
					ans2 = input.nextInt();

					//nested if else statement
					if (ans2 == subtractAnswer2) {
						System.out.println("Correct");
					} 
					else {
						System.out.println("Your answer is wrong. The correct answer is: " + subtractAnswer2);
					}
				}
				else {
					System.out.println("Error! Run program again.");
				}
				break;

			//Case 3 Multiplication 
			case 3:
				//Variables 
				number1 = ((int)(Math.random() * 10));
				number2 = ((int)(Math.random() * 10));
				
				//Stores answer
				int multiply = number1 * number2;

				//User Input required
				System.out.println("What is the answer of " + number1 + " * " + number2 + " = ");
				int ans3 = input.nextInt();

				//if else statement
				if (ans3 == multiply) {
					System.out.println("Correct");
				}else {
					System.out.println("Your answer is wrong. The correct answer is: " + multiply);
				}
				break;

			//Case 4 Division
			case 4:
				//Variables 
				number1 = ((int)(Math.random() * 10));
				number2 = ((int)(Math.random() * 10));
				
				//if else statement
				if (number1 < number2) {

					//User Input Required
					System.out.println("What is the answer of " + number2 + " / " + number1 + " = ");
					int ans4 = input.nextInt();

					//Stores answer
					int ansDivide = number2 / number1;

					//nested if else statement
					if (ans4 == ansDivide) {
						System.out.println("Correct");
					}
					else {
						System.out.println("Your answer is wrong. The correct answer is: " + ansDivide);
					}
				} 
				else if (number1 >= number2) {

					//User Input Required
					System.out.println("What is the answer of " + number1 + " / " + number2 + " = ");
					int ans4B = input.nextInt();

					//Stores answer
					int ansDivide = number1 / number2;

					//nested if else statement
					if (ansDivide == ans4B) {
						System.out.println("Correct");
					}
					else {
						System.out.println("Your answer is wrong. The correct answer is: " + ansDivide);
					}
				}
				break;
			}
		} while (choice < 5);
		
		//Exit do while loop
		System.out.println("Thank you for using the Math Tutor Program. Have a Great Day!");

		//Closed Scanner Object
		input.close();
	}
}