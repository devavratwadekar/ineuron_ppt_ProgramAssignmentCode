package in.ineuron.pptAssignmentJAVA_03;

class Shape {
	public void draw() {
		System.out.println("Drawing a shape.");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a circle.");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle.");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a triangle.");
	}
}

public class PolymorphismExample_3 {
	public static void main(String[] args) {
		Shape shape1 = new Circle();
		Shape shape2 = new Rectangle();
		Shape shape3 = new Triangle();

		shape1.draw(); // Output: Drawing a circle.
		shape2.draw(); // Output: Drawing a rectangle.
		shape3.draw(); // Output: Drawing a triangle.
	}
}
