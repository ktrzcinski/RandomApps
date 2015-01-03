package loops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, sum = 0;

		System.out.print("Enter the amount of numbers you want to sum: ");
		num = input.nextInt();

		while (num-- > 0) {
			System.out.print("Enter your next number: ");
			sum = sum + (input.nextInt());
		}

		System.out.println("Sum off all numbers equals " + sum);
		input.close();

	}

}
