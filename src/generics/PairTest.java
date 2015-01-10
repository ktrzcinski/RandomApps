package generics;

public class PairTest {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("Ana", 1987);
		Pair<Double, Double> p2 = new Pair<>(20.5, 31.7);
		Pair<String, String> p3 = new Pair<>("John", "Smith");
		
		PairTest.printPair(p1);
		PairTest.printPair(p2);
		PairTest.printPair(p3);
	}
	
	static <T, V> void printPair(Pair<T, V> pair) {
		System.out.println("<" + pair.getT() + " ; " + pair.getV() + ">");
	}
}
