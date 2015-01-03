package supcon;

public class Apple extends Fruit {
	private String variety;
	
	public Apple(String variety) {
		this.variety = variety;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println(": " + variety);
	}
}
