package objects;

public class Company {
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		emp1.f_name = "John";
		emp1.l_name = "Smith";
		emp1.dob = "11/08/1986";
		emp1.los = 12;

		emp2.f_name = "Carmen";
		emp2.l_name = "Electra";
		emp2.dob = "20/07/1980";
		emp2.los = 14;

		emp3.f_name = "Jan";
		emp3.l_name = "Kowalski";
		emp3.dob = "21/01/1923";
		emp3.los = 982;

		emp1.printEmp();
		emp2.printEmp();
		emp3.printEmp();

	}
}

class Employee {

	String f_name;
	String l_name;
	String dob;
	int los;

	protected void printEmp() {
		System.out.println("First Name: " + f_name);
		System.out.println("Last Name: " + l_name);
		System.out.println("DOB: " + dob);
		System.out.println("LOS: " + los);
		System.out.println();
	}
}