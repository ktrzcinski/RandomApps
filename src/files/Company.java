package files;

public class Company {
	private static final int MAX_EMPLOYEES = 3;
	
	private Person[] employees;
	private int empCount;
	
	public Person[] getEmployees() {
		return employees;
	}
	
	public void setEmployees(Person[] p) {
		this.employees = p;
	}
	
	public Company() {
		employees = new Employee[MAX_EMPLOYEES];
		empCount = 0;
	}
	
	public void addEmployee(Employee e) {
		if (empCount == MAX_EMPLOYEES) {
			System.out.println("No more space");
		} else {
			employees[empCount] = e;
			empCount++;
		}
	}
}
