//Details: Create a restaurant. You have been approached to create a computer program that will accurately calculate bills for each customer.
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {

		//Scanner Object
		Scanner input = new Scanner(System.in);

		//Variables
		int totalGuest;
		int discount = 0;
		double entireTotal= 0;
		int selectOne = 0;
		int selectTwo;

		double wingAmount;
		int i;

		double optionTotalOne = 0;
		double optionTotalTwo = 0;
		double optionTotalThree = 0;

		//Total
		double personTotal = 0;
		double addedTotal = 0; 

		//Menu Array
		String menu[] = new String[9];
		menu[0] = "Soup";
		menu[1] = "Wings";
		menu[2] = "Burger";
		menu[3] = "Chicken Sandwhich";
		menu[4] = "Fries";
		menu[5] = "Pie";
		menu[6] = "Ice cream";
		menu[7] = "Soft drink"; 
		menu[8] = "Coffee";

		//Price Array
		double prices[] = new double[9];
		prices[0] = 2.50;
		prices[1] = .15;
		prices[2] = 4.95;
		prices[3] = 5.95;
		prices[4] = 1.99;
		prices[5] = 2.95;
		prices[6] = 2.99;
		prices[7] = 1.5;
		prices[8] = 1;

		//Party amount
		System.out.println("Welcome to Sand Castle Shack!");
		System.out.println("How many people are in your party? ");
		totalGuest = input.nextInt();

		//for-loop
		for (i = 1; i <= totalGuest; i++) {

			//Order input
			System.out.println("\nPlease input order information for person " + i + "\n");

			//Discount menu displayed
			System.out.println("Is this person eligible for a discount? (enter a number 1 - 4)" +
					"\n1 - if CHILD 5 years of age or younger \n2 - if TEEN between 13 and 19 years of age"
					+ "\n3 - if SENIOR 65 years of age or older \n4 - if NONE of the above \nPlease type a value for DISCOUNT_TYPE: ");
			discount = input.nextInt();

			//Switch statement - Discount Prices
			switch (discount) {
			case 1: 
				prices[0] = 0;
				prices[1] = 0;
				prices[2] = 0;
				prices[3] = 0;
				prices[4] = 0;
				prices[5] = 0;
				prices[6] = 0;
				prices[7] = 0;
				prices[8] = 0;
				break;
			case 2: 
			case 3: 
				prices[0] *= .75;
				prices[1] *= .75;
				prices[2] *= .75;
				prices[3] *= .75;
				prices[4] *= .75;
				prices[5] *= .75;
				prices[6] *= .75;
				prices[7] *= .75;
				prices[8] *= .75;
				break; 
			case 4: 
				prices[0] += (.05 * prices[0]);
				prices[1] += (.05 * prices[1]);
				prices[2] += (.05 * prices[2]);
				prices[3] += (.05 * prices[3]);
				prices[4] += (.05 * prices[4]);
				prices[5] += (.05 * prices[5]);
				prices[6] += (.05 * prices[6]);
				prices[7] += (.05 * prices[7]);
				prices[8] += (.05 * prices[8]);
				break;
			default: System.out.println("This is not a discount option.");
			}

			//Menu output
			System.out.println("Menu items that may be selected: \n1 " + menu[0] + "\n2 " + 
					menu[1] + "\n3 " + menu[2] + "\n4 " + menu[3] + "\n5 " + menu[4] + "\n6 " + menu[5] +
					"\n7 " + menu[6] + "\n8 " + menu[7] + "\n9 " + menu[8]);

			//Menu Item 1 prompt
			System.out.println("\n \nPlease select menu item 1 (enter a number 1 - 9) \nPlease type a value for SELECTED_ITEM: ");
			selectOne = input.nextInt();		


			switch(selectOne) {
			case 1: optionTotalOne = prices[0];
			break;
			case 2: System.out.println("Please enter number of wings to be ordered \nPlease type a value for NUMBER_OF_WINGS: ");
			wingAmount = input.nextInt();
			optionTotalOne = wingAmount * prices[1];
			break;
			case 3: optionTotalOne = prices[2];
			break;
			case 4: optionTotalOne = prices[3];
			break;
			case 5: optionTotalOne = prices[4];
			break;
			case 6: optionTotalOne = prices[5];
			break;
			case 7: optionTotalOne = prices[6];
			break;
			case 8: optionTotalOne = prices[7];
			break;
			case 9: optionTotalOne = prices[8];
			break;
			default: System.out.println("This is not an option on the menu.");
			}

			//Menu Item 2 prompt
			System.out.println("Please select menu item 2 (enter a number 1 - 9) \nPlease type a value for SELECTED_ITEM: ");
			selectTwo = input.nextInt();

			//Switch Statement
			switch(selectTwo) {
			case 1: optionTotalTwo = prices[0];
			break;
			case 2: System.out.println("Please enter number of wings to be ordered \nPlease type a value for NUMBER_OF_WINGS: ");
			wingAmount = input.nextInt();
			optionTotalTwo = wingAmount * prices[1];
			break;
			case 3: optionTotalTwo = prices[2];
			break;
			case 4: optionTotalTwo = prices[3];
			break;
			case 5: optionTotalTwo = prices[4];
			break;
			case 6: optionTotalTwo = prices[5];
			break;
			case 7: optionTotalTwo = prices[6];
			break;
			case 8: optionTotalTwo = prices[7];
			break;
			case 9: optionTotalTwo = prices[8];
			break;
			default: System.out.println("This is not an option on the menu.");
			}

			//Menu Item 3 prompt
			System.out.println("Please select menu item 3 (enter a number 1 - 9) \nPlease type a value for SELECTED_ITEM: ");
			int selectThree = input.nextInt();

			//Switch Statement
			switch(selectThree) {
			case 1: optionTotalThree = prices[0];
			break;
			case 2: System.out.println("Please enter number of wings to be ordered \nPlease type a value for NUMBER_OF_WINGS: ");
			wingAmount = input.nextInt();
			optionTotalThree = wingAmount * prices[1];
			break;
			case 3: optionTotalThree = prices[2];
			break;
			case 4: optionTotalThree = prices[3];
			break;
			case 5: optionTotalThree = prices[4];
			break;
			case 6: optionTotalThree = prices[5];
			break;
			case 7: optionTotalThree = prices[6];
			break;
			case 8: optionTotalThree = prices[7];
			break;
			case 9: optionTotalThree = prices[8];
			break;
			default: System.out.println("This is not an option on the menu.");
			}

			//Totals
			personTotal = optionTotalOne + optionTotalTwo + optionTotalThree;
			addedTotal += optionTotalOne + optionTotalTwo + optionTotalThree;

			//Person Total
			System.out.printf("Person " + i + " Total: $%.2f" + " (Discount Type " + discount + ")", personTotal);

			//Price Array
			prices[0] = 2.50;
			prices[1] = .15;
			prices[2] = 4.95;
			prices[3] = 5.95;
			prices[4] = 1.99;
			prices[5] = 2.95;
			prices[6] = 2.99;
			prices[7] = 1.5;
			prices[8] = 1;
		}
		//entire total
		entireTotal = addedTotal; 
		System.out.printf("\n \nGrand Total for Order: $%.2f ", entireTotal);

		//Closed Scanner
		input.close();
	}
}