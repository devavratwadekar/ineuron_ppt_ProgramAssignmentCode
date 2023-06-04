package in.ineuron.pptAssignment10;

public class PowerOfThree {
	public static boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}

		while (n % 3 == 0) {
			n /= 3;
		}

		return n == 1;
	}

	public static void main(String[] args) {
		int number = 27;
		boolean isPower = isPowerOfThree(number);
		System.out.println(isPower);
	}
}
