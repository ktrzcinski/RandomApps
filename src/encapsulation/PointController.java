package encapsulation;

public class PointController {

	public void addX(Point pointX) {
		pointX.setX(pointX.getX() + 1);
	}

	public void minusX(Point pointX) {
		pointX.setX(pointX.getX() - 1);
	}

	public void addY(Point pointY) {
		pointY.setY(pointY.getY() + 1);
	}

	public void minusY(Point pointY) {
		pointY.setY(pointY.getY() - 1);
	}

}
