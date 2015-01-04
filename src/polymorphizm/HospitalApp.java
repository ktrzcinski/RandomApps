package polymorphizm;

public class HospitalApp {
	public static void main(String[] args) {
		Person p1 = new Person("John", "Smith", 45.500);
		Person d1 = new Doctor("Amelia", "Swift", 60.900, 10.500);
		Person n1 = new Nurse("Genowefa", "Cebulak", 20.300, 10.5);
		Hospital hospital = new Hospital();
		
		hospital.add(p1);
		hospital.add(d1);
		hospital.add(n1);
		
		System.out.println(hospital);
	}
}
