//Details: (Revisit Lab 6-3 (Math tutor)) Rewrite this program that displays a menu as shown in the sample run in lab 6-3
import java.util.Scanner;

public class Lab7_2 {

private static Scanner scan;
	

	//Main Method
	public static void main(String[] args) {

		//Scanner Object
		Scanner scan = new Scanner(System.in);

		//Random number generator
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		//Intro
		System.out.println("Hello! I am here to help you with math.");

		//Initialized choice variable
		int choice = 0;

		// While-loop
		while (choice != 5) {
			System.out.println(
					"Main menu \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division \n 5: Exit\n"
							+ "\nEnter a choice:");
			choice = scan.nextInt();

			// Calling Methods
			if (choice == 1)
				System.out.println(addition(number1, number2));
			else if (choice == 2 && number1 >= number2)
				System.out.println(subtraction(number1, number2));
			else if (choice == 3)
				System.out.println(multiplication(number1, number2));
			else if (choice == 4 && (number2 != 0))
				System.out.println((division(number1, number2)));

		}

		//Exit program statement
		System.out.println("\nThank you for using the Math Tutor Program. Have a great day!\n");
		scan.close();
	}

	// Addition Method
	public static String addition(int number1, int number2) {
		scan = new Scanner(System.in);
		System.out.println("What is " + number1 + " + " + number2 + "?: ");
		int userAnswer = scan.nextInt();
		int correctAnswer = number1 + number2;
		if (correctAnswer == userAnswer)
			return "\nCorrect\n";
		else
			return "Your answer is wrong. The correct answwer is " + correctAnswer + "\n";
	}

	// Subtraction Method
	public static String subtraction(int number1, int number2) {
		scan = new Scanner(System.in);
		System.out.println("What is " + number1 + " - " + number2 + "?: ");
		int userAnswer = scan.nextInt();
		int correctAnswer = number1 - number2;
		if (correctAnswer == userAnswer)
			return "\nCorrect\n";
		else
			return "Your answer is wrong. The correct answwer is " + correctAnswer + "\n";

	}

	// Multiplication Method
	public static String multiplication(int number1, int number2) {
		scan = new Scanner(System.in);
		System.out.println("What is " + number1 + " * " + number2 + "?: ");
		int userAnswer = scan.nextInt();
		int correctAnswer = number1 * number2;
		if (correctAnswer == userAnswer)
			return "\nCorrect\n";
		else
			return "Your answer is wrong. The correct answwer is " + correctAnswer + "\n";
	}

	// Division Method
	public static String division(int number1, int number2) {
		scan = new Scanner(System.in);
		System.out.print("What is " + number1 + " / " + number2 + "?: ");
		double userAnswer = scan.nextDouble();
		double correctAnswer = (int) number1 / number2;
		if (correctAnswer == userAnswer)
			return "\nCorrect\n";
		else
			return "Your answer is wrong. The correct answwer is " + correctAnswer + "\n";
	}
}