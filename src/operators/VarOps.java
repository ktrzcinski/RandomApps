package operators;

public class VarOps {
	public static void main(String[] args) {

		int x = 10;
		int y = 5;

		System.out.println(x > y);
		System.out.println((x * 2) > y);
		System.out.println((x + 3) > y && (x - 2) > y);
		System.out.println((x * y) % 2 == 0);

	}
}
