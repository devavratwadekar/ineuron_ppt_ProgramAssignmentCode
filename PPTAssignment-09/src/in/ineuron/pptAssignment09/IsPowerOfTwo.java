package in.ineuron.pptAssignment09;

public class IsPowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false; // Negative numbers and zero are not powers of two
		}

		// Check if there is only one set bit in the binary representation of n
		// If so, n is a power of two
		return (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		int n = 16;
		boolean result = isPowerOfTwo(n);
		System.out.println(result);
	}
}
