package files;

public class Employee extends Person {
	private static final long serialVersionUID = 45345345;
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(String fn, String ln, double s) {
		super(fn, ln);
		setSalary(s);
	}
}