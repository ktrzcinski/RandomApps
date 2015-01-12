package comparators;

import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 5, 7, 34, 23, 35, 87, 31, 67, 84, 90, 56, 39,
				78, 91, 28, 19, 55, 22, 2 };
		System.out.println("Unsorted: ");
		printArray(numbers);
		
		Arrays.sort(numbers);
		System.out.println("Sorted in ascending order: ");
		printArray(numbers);
		
		Arrays.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1.compareTo(o2));
			}
		});
		System.out.println("Sorted in descending order: ");
		printArray(numbers);
	}

	static void printArray(Integer arr[]) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
