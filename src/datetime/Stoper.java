package datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("To start press ENTER");
			sc.nextLine();
			Instant i1 = Instant.now();
			
			System.out.println("To stop press ENTER");
			sc.nextLine();
			Instant i2 = Instant.now();
			
			Duration time = Duration.between(i1,  i2);
			System.out.println("Time elapsed: " + time.getSeconds());
		}
	}
}
