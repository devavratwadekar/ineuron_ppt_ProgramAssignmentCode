package in.ineuron.pptAssignment02;

import java.util.Arrays;

/**
 * 
 * @author DEVAVRAT
 *
 */

public class ArrayPiarSum {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 3, 2 };
		System.out.println("The maximum possible sum is " + arrayPairSum(nums));

	}

	public static int arrayPairSum(int[] nums) {
		// sort the array
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 1; i < nums.length; i += 2) {
			sum += Math.min(nums[i], nums[i - 1]);
		}
		return sum;
	}

}
