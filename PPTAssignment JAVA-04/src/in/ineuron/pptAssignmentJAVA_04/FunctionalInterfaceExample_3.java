package in.ineuron.pptAssignmentJAVA_04;

//Functional interface with a single abstract method
@FunctionalInterface
interface MathOperation {
	int operate(int a, int b);
}

//Main program
public class FunctionalInterfaceExample_3 {
	public static void main(String[] args) {
		// Using lambda expressions to implement the functional interface
		MathOperation addition = (a, b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication = (a, b) -> a * b;

		// Perform operations using the functional interface implementations
		int result1 = performOperation(5, 3, addition);
		System.out.println("Result of addition: " + result1);

		int result2 = performOperation(10, 4, subtraction);
		System.out.println("Result of subtraction: " + result2);

		int result3 = performOperation(6, 8, multiplication);
		System.out.println("Result of multiplication: " + result3);
	}

	// Method that takes a functional interface as a parameter
	public static int performOperation(int a, int b, MathOperation mathOperation) {
		return mathOperation.operate(a, b);
	}
}
