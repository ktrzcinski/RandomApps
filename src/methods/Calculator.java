package methods;

public class Calculator {
	public static void main(String[] args) {

		double a = 4.6;
		double b = 10.2;

		Calculate calc1 = new Calculate();
		System.out.println("Addiotion result is " + calc1.add(a, b));
		System.out.println("Subtraction result is " + calc1.subtract(a, b));
		System.out.println("Multiplication result is " + calc1.multiply(a, b));
		System.out.println("Division result is " + calc1.divide(a, b));

	}
}

class Calculate {

	double add(double a, double b) {
		return a + b;
	}

	double subtract(double a, double b) {
		return a - b;
	}

	double multiply(double a, double b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}

}