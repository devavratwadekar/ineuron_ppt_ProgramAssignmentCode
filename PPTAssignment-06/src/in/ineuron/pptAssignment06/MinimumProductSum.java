package in.ineuron.pptAssignment06;

import java.util.Arrays;

public class MinimumProductSum {
	public static int minProductSum(int[] nums1, int[] nums2) {
		Arrays.sort(nums1); // Sort nums1 in ascending order
		Arrays.sort(nums2); // Sort nums2 in ascending order

		int n = nums1.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums1[i] * nums2[n - i - 1];
			// Multiply the smallest number in nums1 with the largest number in nums2, and
			// so on
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] nums1 = { 5, 3, 4, 2 };
		int[] nums2 = { 4, 2, 2, 5 };
		int minProduct = minProductSum(nums1, nums2);
		System.out.println("Minimum product sum: " + minProduct);
	}
}
