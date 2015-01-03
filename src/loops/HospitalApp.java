package loops;

import java.util.Scanner;

public class HospitalApp {
	public static final int EXIT = 0;
	public static final int ADD_PATIENT = 1;
	public static final int PRINT_PATIENTS = 2;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option = -1;

		Hospital hospital = new Hospital();

		while (option != EXIT) {
			System.out.println("Available options:");
			System.out.println("0 - Exit the program");
			System.out.println("1 - Add patient");
			System.out.println("2 - Print list of patients");
			System.out.println();

			System.out.print("Please choose your option: ");
			option = input.nextInt();
			input.nextLine();

			switch (option) {
			case ADD_PATIENT:
				Patient patient = new Patient();
				System.out.print("First Name: ");
				patient.setFName(input.nextLine());
				System.out.print("Last Name: ");
				patient.setLName(input.nextLine());
				System.out.print("PPS No: ");
				patient.setPpsNo(input.nextLine());
				hospital.addPatient(patient);
				break;
			case PRINT_PATIENTS:
				hospital.printPatients();
				System.out.println();
				break;
			case EXIT:
				System.out.println("Closing program.");
			default:
				System.out.println("Invalid option.");
			}
		}

		input.close();
	}

}
