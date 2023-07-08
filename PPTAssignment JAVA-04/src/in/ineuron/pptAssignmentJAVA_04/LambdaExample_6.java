package in.ineuron.pptAssignmentJAVA_04;

interface MathOperation_ {
	int operate(int a, int b);
}

public class LambdaExample_6 {
	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;

		int result1 = addition.operate(5, 3);
		System.out.println("Result of addition: " + result1);

		int result2 = subtraction.operate(10, 4);
		System.out.println("Result of subtraction: " + result2);
	}
}
