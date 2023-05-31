package in.ineuron.pptAssignment02;
/**
 * 
 * @author DEVAVRAT
 *
 */
public class MaximumProductofThreeNumbers {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		System.out.println("Maximum Product of Three Numbers::" + maximumProduct(nums));

	}

	public static int maximumProduct(int[] nums) {
		// Find the three largest numbers in the array.
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max3 = max2;
				max2 = num;
			} else if (num > max3) {
				max3 = num;
			}
		}

		// Return the product of the three largest numbers.
		return max1 * max2 * max3;
	}

}
