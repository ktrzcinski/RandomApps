package arrays;

public class MultiArrays {
	public static void main(String args[]) {
		double[][] array = { { 1.0, 1.5, 2.0 }, { 1.5, 2.0, 2.5 },
				{ 2.0, 2.5, 3.0 } };
		System.out.println("The sum of the products of the diagonals: "
				+ (array[0][0] + array[1][1] + array[2][2])
				* (array[0][2] + array[1][1] + array[2][0]));
		System.out
				.println("The product of the sum of the middle row and the middle column: "
						+ (array[1][0] * array[0][1])
						+ (array[1][1] * array[1][1])
						+ (array[1][2] * array[2][1]));
		System.out
				.println("The sum of the edge elements: "
						+ (array[0][0] + array[0][1] + array[0][2]
								+ array[1][2] + array[2][2] + array[2][1]
								+ array[2][1] + array[2][0] + array[1][0]));
	}
}
