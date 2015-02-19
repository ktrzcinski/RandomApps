package iterators;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NamesIterator {
	public static void main(String[] args) {
		Map<String, String> names = new TreeMap<>();
		
		names.put("Smith", "John Smith - 35");
		names.put("Murphy", "Laura Murphy - 21");
		names.put("Trzcinski", "Krzysztof Trzcinski - 28");
		
		Iterator<String> valuesIterator = names.values().iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}
	}
}
