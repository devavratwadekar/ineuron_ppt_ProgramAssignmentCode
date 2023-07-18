package in.ineuron.pptAssignment24;

public class UglyNumbers_5 {
	public static int nthUglyNumber(int n) {
		int[] uglyNumbers = new int[n];
		uglyNumbers[0] = 1;

		int index2 = 0; // Index for the next number to multiply by 2
		int index3 = 0; // Index for the next number to multiply by 3
		int index5 = 0; // Index for the next number to multiply by 5

		int factor2 = 2; // Next multiple of 2
		int factor3 = 3; // Next multiple of 3
		int factor5 = 5; // Next multiple of 5

		// Generate the ugly numbers up to the nth number
		for (int i = 1; i < n; i++) {
			// Find the minimum of the three factors
			int min = Math.min(factor2, Math.min(factor3, factor5));

			// Store the minimum ugly number
			uglyNumbers[i] = min;

			// Update the indices and factors accordingly
			if (min == factor2) {
				index2++;
				factor2 = uglyNumbers[index2] * 2;
			}
			if (min == factor3) {
				index3++;
				factor3 = uglyNumbers[index3] * 3;
			}
			if (min == factor5) {
				index5++;
				factor5 = uglyNumbers[index5] * 5;
			}
		}

		return uglyNumbers[n - 1];
	}

	public static void main(String[] args) {
		int n1 = 10;
		int result1 = nthUglyNumber(n1);
		System.out.println("Input: " + n1);
		System.out.println("Output: " + result1);

		int n2 = 1;
		int result2 = nthUglyNumber(n2);
		System.out.println("Input: " + n2);
		System.out.println("Output: " + result2);
	}
}
