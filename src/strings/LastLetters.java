package strings;

import java.util.Scanner;

public class LastLetters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		in.nextLine();
		
		String[] words = new String[number];
		StringBuilder finalWord = new StringBuilder();
		
		for (int i = 0; i < words.length; i++) {
			words[i] = in.nextLine();
		}
		
		for (int i = 0; i < words.length; i++) {
			finalWord.append(words[i].charAt(words[i].length() - 1));
		}
		
		System.out.println(finalWord.toString());
		
		in.close();
	}
}
