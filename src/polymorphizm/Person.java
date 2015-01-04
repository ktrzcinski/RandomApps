package polymorphizm;

public class Person {
	private String firstName;
	private String lastName;
	private double salary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Person(String firstName, String lastName, double salary) {
		setFirstName(firstName);
		setLastName(lastName);
		setSalary(salary);
	}

	@Override
	public String toString() {
		return "First Name: " + getFirstName() + "\n" + "Last Name: " +  getLastName() + "\n" + "Salary: " + getSalary() + "\n\n";
	}
}
