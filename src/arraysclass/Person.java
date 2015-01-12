package arraysclass;

public class Person {
	private String firstName;
	private String lastName;
	private String pps;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPps() {
		return pps;
	}
	
	public void setPps(String pps) {
		this.pps = pps;
	}
	
	public Person(String firstName, String lastName, String pps) {
		setFirstName(firstName);
		setLastName(lastName);
		setPps(pps);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", pps=" + pps + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (pps == null) {
			if (other.pps != null)
				return false;
		} else if (!pps.equals(other.pps))
			return false;
		return true;
	}
	
	
}
