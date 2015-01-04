package enumex;

import java.util.Scanner;

public class Pizzeria {
	public static void main(String[] args) {
		System.out.println("Available Pizzas: ");
		for (Pizza p: Pizza.values()) {
			System.out.println(p);
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Please select pizza: ");
		Pizza pizza = Pizza.valueOf(input.nextLine());
		
		System.out.println("Thank you for your selection of " + pizza.name());
		input.close();
	}

}
