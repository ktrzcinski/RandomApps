package staticex;

public class Student {
	public static int counter;
	private String firstName;
	private String lastName;
	private String studentNo;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public Student(String firstName, String lastName, String studentNo) {
		setFirstName(firstName);
		setLastName(lastName);
		setStudentNo(studentNo);
		counter++;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", SN = " + studentNo;
	}

}
