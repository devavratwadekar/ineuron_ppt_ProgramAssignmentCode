package in.ineuron.pptAssignment09;

public class Factorial {
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1; // Base case: factorial of 0 or 1 is 1
		} else {
			return n * factorial(n - 1); // Recursive case: factorial of n is n multiplied by factorial of n-1
		}
	}

	public static void main(String[] args) {
		int N = 5;
		int result = factorial(N);
		System.out.println(result);
	}
}
