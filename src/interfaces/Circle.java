package interfaces;

public class Circle implements Shape {

	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle(double r) {
		setR(r);
	}

	@Override
	public double calculateArea() {
		return Shape.PI * r * r;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Shape.PI * r;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Circle, ");
		sb.append("radius, " + r + ", ");
		sb.append("area, " + calculateArea() + ", ");
		sb.append("perimeter, " + calculatePerimeter());
		return sb.toString();
	}
}
