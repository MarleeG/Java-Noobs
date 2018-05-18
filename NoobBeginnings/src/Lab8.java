//Details: Design a solution that requests and receives student names and an exam score for each.
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {

		//Scanner Object
		Scanner input = new Scanner(System.in);

		//Variables
		String name = "Nobody";
		String highName = "Nobody";
		int highScore = 0;
		int score = 0;

		//While-Loop
		while (!name.equals("alldone")) {

			//User Input Required
			System.out.println("Please enter student's name, or \"alldone\" if finished >");
			name = input.next();

			//If statement
			if(!name.equals("alldone")){
				System.out.println("Please enter student's score >");
				score = input.nextInt();

				//If statement
				if (score > highScore) {
					highName = name;
					highScore = score;
				}   
			}
		}

		//Output: highName + highScore
		System.out.println(highName + " had the highest score which was " + highScore);

		//Closed Scanner Object
		input.close();
	}
}