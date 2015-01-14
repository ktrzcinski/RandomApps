package sets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class NameReader {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("namespl.txt"));
		
		TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		
		String name;
		while ((name = reader.readLine()) != null) {
			names.add(name);
		}
		reader.close();
		
		System.out.println("Numbers of names in set: " + names.size());
		System.out.println("First name: " + names.first());
		System.out.println("Last name: " + names.last());
	}
}
