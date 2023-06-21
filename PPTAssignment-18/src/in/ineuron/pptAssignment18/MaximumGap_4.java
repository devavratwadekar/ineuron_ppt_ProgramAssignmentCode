package in.ineuron.pptAssignment18;

import java.util.Arrays;

public class MaximumGap_4 {
	public static int maximumGap(int[] nums) {
		int n = nums.length;

		if (n < 2) {
			return 0;
		}

		// Find the maximum element in the array
		int maxNum = Arrays.stream(nums).max().getAsInt();

		int exp = 1; // Current digit position
		int[] sorted = new int[n];

		while (maxNum / exp > 0) {
			int[] count = new int[10]; // Counting sort array to store the occurrence of each digit

			// Count the occurrences of each digit at the current digit position
			for (int i = 0; i < n; i++) {
				int digit = (nums[i] / exp) % 10;
				count[digit]++;
			}

			// Calculate the cumulative count for each digit
			for (int i = 1; i < 10; i++) {
				count[i] += count[i - 1];
			}

			// Build the sorted array based on the current digit position
			for (int i = n - 1; i >= 0; i--) {
				int digit = (nums[i] / exp) % 10;
				sorted[count[digit] - 1] = nums[i];
				count[digit]--;
			}

			// Copy the sorted array back to the original array
			System.arraycopy(sorted, 0, nums, 0, n);

			// Move to the next digit position
			exp *= 10;
		}

		// Calculate the maximum difference between two successive elements in the
		// sorted array
		int maxDiff = 0;
		for (int i = 1; i < n; i++) {
			int diff = nums[i] - nums[i - 1];
			maxDiff = Math.max(maxDiff, diff);
		}

		return maxDiff;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 6, 9, 1 };
		int maxGap = maximumGap(nums);
		System.out.println("Maximum Gap: " + maxGap);
	}
}
