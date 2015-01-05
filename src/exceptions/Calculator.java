package exceptions;

public class Calculator {
	public final String PLUS = "+";
	public final String MINUS = "-";
	public final String MULTIPLY = "*";
	public final String DIVIDE = "/";

	public double calculate(double a, double b, String operator)
			throws ArithmeticException, UnknownOperatorException {
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
			if (b == 0) {
				throw new ArithmeticException("I cannot divide by 0!");
			}
			result = a / b;
			break;
		default:
			throw new UnknownOperatorException("Invalid arithmetic opeartor");
		}

		return result;
	}
}
