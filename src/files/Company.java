package files;

import java.io.Serializable;

public class Company implements Serializable {
	private static final long serialVersionUID = 24525424;
	public static final int EMPLOYEES = 3;

	private Employee[] employees;

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] p) {
		this.employees = p;
	}

	public Company() {
		employees = new Employee[EMPLOYEES];
	}

	public void add(Employee e, int index) {
		employees[index] = e;
	}
}
