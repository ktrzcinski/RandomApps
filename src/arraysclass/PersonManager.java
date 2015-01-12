package arraysclass;

public class PersonManager {
	public static void main(String[] args) {
		PersonDatabase pdb = new PersonDatabase();
		pdb.add(new Person("Ana", "Murphy", "3425423A"));
		pdb.add(new Person("John", "Smith", "5423151S"));
		pdb.add(new Person("Krzysztof", "Trzcinski", "353625234F"));
		
		System.out.println(pdb);
		pdb.remove(new Person("Ana", "Murphy", "3425423A"));
		System.out.println();
		System.out.println(pdb);
	}
}
