//Details: Decimal to binary
import java.util.Scanner;
import java.util.Stack;

public class Lab5_3 {

	public static void main(String[] args) {

		//Created Scanner Object
		Scanner input = new Scanner(System.in);

		// Created Stack object
		Stack <Integer> stack = new Stack<Integer>();

		// User input required
		System.out.println("Hello! I am here to help convert a decimal number into it's binary equivalent.");
		System.out.println("Enter decimal number between 0-15: ");
		int num = input.nextInt();

		//Condition
		while (num != 0)
		{
			int d = num % 2;
			stack.push(d);
			num /= 2;
		} 

		//Output
		System.out.print("\nBinary representation is:");
		
		//Condition
		while (!(stack.isEmpty() ))
		{
			System.out.print(stack.pop());
		}
		
		//Output
		//System.out.println();

		//Closed Scanner Object
		input.close();
	}
}