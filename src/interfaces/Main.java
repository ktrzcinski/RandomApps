package interfaces;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		
		ShapeCalculator shapeCalc = new ShapeCalculator();
		Shape shape = null;
		
		boolean readComplete = false;
		while (!readComplete) {
			try {
				main.printOptions();
				shape = shapeCalc.createShape();
				readComplete = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid format, try again.");
			} catch (NoSuchElementException e) {
				System.out.println("Invalid figure, try again.");
			}
		}
		
		System.out.println(shape);
		shapeCalc.closeScanner();
	}
	
	public void printOptions() {
		System.out.println("Please choose a figure for which you would like to calculate Area and Parimeter:");
		System.out.println(Shape.RECTANGLE + " - rectangle");
		System.out.println(Shape.CIRCLE + " - circle");
		System.out.println(Shape.TRIANGLE + " - triangle");
	}
}
