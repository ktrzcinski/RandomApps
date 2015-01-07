package files;

import java.io.Serializable;

public abstract class Person implements Serializable {
	private static final long serialVersionUID = 249445345;
	
	private String firstName;
	private String lastName;
	
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
	
	public Person() {}
	
	public Person(String fn, String ln) {
		setFirstName(fn);
		setLastName(ln);
	}
}
