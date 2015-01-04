package polymorphizm;

public class Nurse extends Person {
	private double overtime;

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}

	public Nurse(String firstName, String lastName, double salary,
			double overtime) {
		super(firstName, lastName, salary);
		setOvertime(overtime);
	}
	
	@Override
	public String toString() {
		return "First Name: " + getFirstName() + "\n" + "Last Name: " +  getLastName() + "\n" + "Salary: " + getSalary() + "\n" + "Overtime: " + getOvertime() + "\n\n";
	}
}
