package maps;

import java.util.Scanner;

public class CompanyApp {
	
	public static final int ADD_EMPLOYEE = 0;
	public static final int FIND_EMPLOYEE = 1;
	public static final int EXIT = 2;
	
	private Company company;
	
	CompanyApp() {
		company = new Company();
	}
	
	public static void main(String[] args) {
		CompanyApp companyApp = new CompanyApp();
		try (Scanner sc = new Scanner(System.in);) {
			int userOption;
			do {
				companyApp.printOptions();
				userOption = sc.nextInt();
				sc.nextLine();
				
				switch(userOption) {
				case CompanyApp.ADD_EMPLOYEE:
					companyApp.addEmployee(sc);
					break;
				case CompanyApp.FIND_EMPLOYEE:
					companyApp.findAndPrintEmployee(sc);
					break;
				case CompanyApp.EXIT:
					break;
				}
			} while (userOption != CompanyApp.EXIT);
		}
	}
	
	private void printOptions() {
		System.out.println("0 - Add Employee");
		System.out.println("1 - Search Employee");
		System.out.println("2 - Exit");
	}
	
	private void addEmployee(Scanner sc) {
		Employee employee = new Employee();
		
		System.out.println("Adding employee:");
		System.out.println("First Name:");
		employee.setFName(sc.nextLine());
		System.out.println("Last Name:");
		employee.setFName(sc.nextLine());
		System.out.println("Salary:");
		employee.setSalary(sc.nextDouble());
		sc.nextLine();
		
		company.addEmployee(employee);
	}
	
	private void findAndPrintEmployee(Scanner sc) {
		System.out.println("Searching employee:");
		System.out.println("First Name:");
		String fName = sc.nextLine();
		System.out.println("Last Name:");
		String lName = sc.nextLine();
		
		Employee employee = company.getEmployee(fName, lName);
		System.out.println(employee);
	}
}
