package polymorphizm;

public class Doctor extends Person {
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Doctor(String firstName, String lastName, double salary, double bonus) {
		super(firstName, lastName, salary);
		setBonus(bonus);
	}
	
	@Override
	public String toString() {
		return "First Name: " + getFirstName() + "\n" + "Last Name: " +  getLastName() + "\n" + "Salary: " + getSalary() + "\n" + "Bonus: " + getBonus() + "\n\n";
	}
}
