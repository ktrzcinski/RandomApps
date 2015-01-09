package recursion;

public class Factorial {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		int factArg = 5;
		int result = f.factorial(factArg);
		System.out.println("Factorial " + factArg + " = " + result);
	}
	
	public int factorial(int n) {
		return n > 1 ? n * factorial(n - 1) : n;
	}
}
