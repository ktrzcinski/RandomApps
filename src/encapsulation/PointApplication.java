package encapsulation;

public class PointApplication {
	public final static int ADD_X = 0, ADD_Y = 1, MINUS_X = 2, MINUS_Y = 3;

	public static void main(String[] args) {

		Point p1 = new Point(1, 2);
		PointController pc = new PointController();
		System.out.println("Point before change: (" + p1.getX() + ", "
				+ p1.getY() + ")");

		int option = ADD_Y;

		switch (option) {
		case ADD_X:
			pc.addX(p1);
			break;
		case ADD_Y:
			pc.addY(p1);
			break;
		case MINUS_X:
			pc.minusX(p1);
			break;
		case MINUS_Y:
			pc.minusY(p1);
			break;
		default:
			System.out.println("Invalid value");
		}

		System.out.println("Point after change: (" + p1.getX() + ", "
				+ p1.getY() + ")");

	}
}
