package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
	public static void main(String[] args) {
		List<Integer> userNumbers = new ArrayList<>();
		
		System.out.println("Welcome to the Lotto draw! Enter your numbers.");
		try(Scanner sc = new Scanner(System.in);) {
			int numbers = 6;
			while(numbers > 0) {
				System.out.println("Enter next number: ");
				userNumbers.add(sc.nextInt());
				sc.nextLine();
				numbers--;
			}
		}
		
		Lotto lotto = new Lotto();
		lotto.randomize();
		int found = lotto.checkResult(userNumbers);
		System.out.println("Matching numbers: " + found);
	}
}
