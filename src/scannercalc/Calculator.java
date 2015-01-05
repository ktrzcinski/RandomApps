package scannercalc;

public class Calculator {
	public final String PLUS = "+", MINUS = "-", MULTIPLY = "*", DIVIDE = "/";

	public double calculate(double a, double b, String operator) {
		double result = 0;

		switch (operator) {
		case PLUS:
			result = a + b;
			break;
		case MINUS:
			result = a - b;
			break;
		case MULTIPLY:
			result = a * b;
			break;
		case DIVIDE:
			result = a / b;
			break;
		default:
			System.out.println("Provided operator doesn't exist!");
		}

		return result;
	}

}
