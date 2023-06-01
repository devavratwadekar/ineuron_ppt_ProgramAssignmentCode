package in.ineuron.pptAssignment03;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		PlusOne solution = new PlusOne();
		int[] digits = { 4,3,2,1 };
		int[] result = solution.plusOne(digits);
		System.out.println(Arrays.toString(result)); // Output: [1, 2, 4]
	}

	public int[] plusOne(int[] digits) {
		int n = digits.length;

		// Start from the least significant digit
		for (int i = n - 1; i >= 0; i--) {
			// Increment the digit by 1
			digits[i] += 1;

			// If the digit becomes 10, carry the 1 to the next digit
			if (digits[i] == 10) {
				digits[i] = 0;
			} else {
				// No carry, return the updated digits
				return digits;
			}
		}

		// If all digits were 9 and carried to become 0, create a new array with one
		// more digit
		int[] newDigits = new int[n + 1];
		newDigits[0] = 1;
		return newDigits;
	}

}
