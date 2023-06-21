package in.ineuron.pptAssignment18;

import java.util.Arrays;

public class LongestIncreasingSubsequence_7 {
	public static int lengthOfLIS(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		// dp[i] represents the length of the longest increasing subsequence ending at
		// index i

		Arrays.fill(dp, 1);
		// Initialize dp array with 1 since each element is a valid subsequence of
		// length 1

		int maxLen = 1; // Maximum length of the increasing subsequence

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					// If the current number is greater than the previous number, we can extend the
					// subsequence
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			maxLen = Math.max(maxLen, dp[i]);
		}

		return maxLen;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int maxLength = lengthOfLIS(nums);
		System.out.println("Length of Longest Increasing Subsequence: " + maxLength);
	}
}
