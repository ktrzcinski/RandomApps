package loops;

public class Patient {

	// variables
	private String fName;
	private String lName;
	private String ppsNo;

	// setters and getters
	public String getFName() {
		return this.fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return this.lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	public String getPpsNo() {
		return this.ppsNo;
	}

	public void setPpsNo(String ppsNo) {
		this.ppsNo = ppsNo;
	}

	// constructors
	public Patient() {

	}

	public Patient(String fName, String lName, String ppsNo) {
		setFName(fName);
		setLName(lName);
		setPpsNo(ppsNo);
	}

}
