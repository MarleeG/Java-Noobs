//Details: (Game: scissor, rock, paper)
import java.util.Scanner;

public class Lab6_2 {

	public static void main(String[] args) {

		//Scanner Object Created
		Scanner input = new Scanner(System.in);

		//User Input Required
		System.out.println("Let's play a game!" + "\nRules: A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.\n" );

		//variable scores 
		int userScore = 0;
		int compScore = 0;

		while ((userScore - compScore) != 2 && (compScore - userScore) != 2) {

			//User Input Required
			System.out.println("Pick your weapon! \nEnter your selection: scissors (0), rock (1), paper (2): ");
			int weapon = input.nextInt();

			//Random number generator from 0-2
			int computer = ((int)(Math.random() * 3));

			//Condition
			if ((weapon == computer))  {
				System.out.println("It's a draw");
			} else if (((weapon == 0) && (computer == 2)) || ((weapon == 1)  && (computer == 0)) || ((weapon == 2) && (computer == 1))) {
				System.out.println("You won!");
				++userScore;
			} else {
				System.out.println("You've lost :(.");
				++compScore;
			} 

			//Switch statement with your weapon of choice
			switch (weapon) {
			case 0: System.out.println("Your weapon of choice: scissors");
			break;
			case 1: System.out.println("Your weapon of choice: rock");
			break;
			case 2: System.out.println("Your weapon of choice: paper");
			break;
			default: System.out.println("Error!");
			}

			//Switch statement with computer's weapon of choice
			switch (computer) {
			case 0: System.out.println("Computer's weapon: scissors");
			break;
			case 1: System.out.println("Computer's weapon: rock");
			break;
			case 2: System.out.println("Computer's weapon: paper");
			break;
			default: System.out.println("Error! Try again");
			}
		}

		//Stats
		System.out.println("\n \nFinal Stats \nYour score is: " + userScore + "\nComputer's score is: " + compScore);

		//Condition
		if ((userScore - compScore) == 2) {
			System.out.println("\n \nCongratulations! You've won the game.");
		}else {
			System.out.println("\n \nYou've lost the game");
		}

		//Closed Scanner Object
		input.close();
	}
}