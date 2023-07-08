package in.ineuron.pptAssignmentJAVA_03;

public class PolymorphismExample_4 {
	public void display(String message) {
		System.out.println("Displaying message: " + message);
	}

	public void display(String message, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Displaying message: " + message);
		}
	}

	public void display(double number) {
		System.out.println("Displaying number: " + number);
	}

	public static void main(String[] args) {
		PolymorphismExample_4 polymorphism = new PolymorphismExample_4();

		polymorphism.display("Hello!"); // Output: Displaying message: Hello!
		polymorphism.display("Hi!", 3); // Output: Displaying message: Hi! (printed 3 times)
		polymorphism.display(3.14); // Output: Displaying number: 3.14
	}
}
