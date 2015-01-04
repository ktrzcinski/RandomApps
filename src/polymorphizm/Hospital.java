package polymorphizm;

public class Hospital {
	public static final int MAX_EXPLOYEES = 100;
	private Person[] employees;
	private int empNo;
	
	public Person[] getEmployees() {
		return employees;
	}
	
	public void setEmployees(Person[] employees) {
		this.employees = employees;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public Hospital() {
		employees = new Person[MAX_EXPLOYEES];
		empNo = 0;
	}
	
	public void add(Person p) {
		if (empNo == MAX_EXPLOYEES) {
			System.out.println("You reached max employees");
		} else {
			employees[empNo] = p;
			empNo++;
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < empNo; i++) {
			result = result + employees[i];
		}
		return result;
	}
}
