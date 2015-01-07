package innerclasses;

public class ArraySorter {
	public static void main(String[] args) {
		Sortable sorter = new Sortable() {
			
			@Override
			public int[] sort(int[] tab) {
				int temp;
				for (int i = 0; i < tab.length; i++) {
					for (int j = 1; j < tab.length - i; j++) {
						System.out.println(tab[i] + " < " + tab[j] + " " + (tab[i] < tab[j]));
						if (tab[j - 1] > tab[j]) {
							temp = tab[j];
							tab[j] = tab[j - 1];
							tab[j - 1] = temp;
						}
					}
				}
				return tab;
			}
		};
		
		int[] array = {10, 9, 8, 1, 2, 3, 6, 5, 4, 7};
		sorter.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "  ");
		}
	}
}
