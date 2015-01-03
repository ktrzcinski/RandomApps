package staticex;

public class University {
	public static void main(String[] args) {
		Student st1 = new Student("Krzysztof", "Trzcinski", "X00107882");
		Student st2 = new Student("Zbigniew", "Szulc", "X00098000");
		System.out.println("Amount of students: " + Student.counter);
	}
}
