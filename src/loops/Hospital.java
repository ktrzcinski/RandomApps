package loops;

public class Hospital {
	public final int MAX_PATIENTS_NO = 10;
	private Patient[] patients;
	private int regPatients;

	public Hospital() {
		patients = new Patient[MAX_PATIENTS_NO];
		regPatients = 0;
	}

	public void addPatient(Patient patient) {
		if (regPatients < MAX_PATIENTS_NO) {
			patients[regPatients] = patient;
			regPatients++;
		} else {
			System.out
					.println("Max limit of patients has been reached. Please come back tomorrow.");
		}
	}

	public void printPatients() {
		for (int i = 0; i < regPatients; i++) {
			System.out.println(patients[i].getFName() + " "
					+ patients[i].getLName() + " " + patients[i].getPpsNo());
		}
	}

}
