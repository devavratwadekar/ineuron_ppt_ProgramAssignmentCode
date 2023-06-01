package in.ineuron.pptAssignment03;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 3, 50, 75 };
		int lower = 0;
		int upper = 99;
		List<String> missingRanges = findMissingRanges(nums, lower, upper);
		System.out.println(missingRanges);
	}

	public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
		List<String> result = new ArrayList<>();

		int n = nums.length;
		int prev = lower - 1;

		for (int i = 0; i <= n; i++) {
			int curr = (i == n) ? upper + 1 : nums[i];
			if (curr - prev >= 2) {
				result.add(getRange(prev + 1, curr - 1));
			}
			prev = curr;
		}

		return result;
	}

	// Helper function to get the range string based on the lower and upper values
	private static String getRange(int lower, int upper) {
		return (lower == upper) ? String.valueOf(lower) : lower + "->" + upper;
	}

}
