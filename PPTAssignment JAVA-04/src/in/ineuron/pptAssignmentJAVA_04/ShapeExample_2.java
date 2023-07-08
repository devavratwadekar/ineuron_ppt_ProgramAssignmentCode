package in.ineuron.pptAssignmentJAVA_04;

//Abstract class with abstract and concrete methods
abstract class Shape {
	// Abstract methods
	public abstract double calculateArea();

	public abstract double calculatePerimeter();

	// Concrete methods
	public void displayArea() {
		System.out.println("Area: " + calculateArea());
	}

	public void displayPerimeter() {
		System.out.println("Perimeter: " + calculatePerimeter());
	}
}

//Concrete subclass implementing the Shape abstract class
class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (length + width);
	}
}

//Concrete subclass implementing the Shape abstract class
class Circle extends Shape {
	private double radius;
	private final double PI = 3.14159;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * PI * radius;
	}
}

//Main program
public class ShapeExample_2 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 7);
		Circle circle = new Circle(3);

		rectangle.displayArea();
		rectangle.displayPerimeter();

		circle.displayArea();
		circle.displayPerimeter();
	}
}
