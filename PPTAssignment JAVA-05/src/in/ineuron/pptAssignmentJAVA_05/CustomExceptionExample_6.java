package in.ineuron.pptAssignmentJAVA_05;

//Custom exception class
class MyCustomException extends Exception {
	public MyCustomException(String message) {
		super(message);
	}
}

//Example class using the custom exception
public class CustomExceptionExample_6 {
	public static void main(String[] args) {
		try {
			// Call a method that may throw the custom exception
			performOperation();
		} catch (MyCustomException e) {
			System.out.println("Custom exception caught: " + e.getMessage());
		}
	}

	public static void performOperation() throws MyCustomException {
		// Condition that triggers the custom exception
		boolean condition = true;

		if (condition) {
			// Throw the custom exception with a specific message
			throw new MyCustomException("Custom exception occurred!");
		} else {
			// Perform some other operation if the condition is not met
			System.out.println("Operation performed successfully.");
		}
	}
}
