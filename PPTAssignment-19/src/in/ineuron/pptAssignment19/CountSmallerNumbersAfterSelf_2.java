package in.ineuron.pptAssignment19;

import java.util.ArrayList;
import java.util.List;

public class CountSmallerNumbersAfterSelf_2 {
	public static void main(String[] args) {
		int[] nums = { 5, 2, 6, 1 };
		int[] counts = countSmaller(nums);
		for (int count : counts) {
			System.out.print(count + " ");
		}
		// Output: 2 1 1 0
	}

	public static int[] countSmaller(int[] nums) {
		int n = nums.length;
		int[] counts = new int[n];
		List<Integer> sorted = new ArrayList<>();

		for (int i = n - 1; i >= 0; i--) {
			int index = findIndex(sorted, nums[i]);
			counts[i] = index;
			sorted.add(index, nums[i]);
		}

		return counts;
	}

	private static int findIndex(List<Integer> sorted, int target) {
		int left = 0;
		int right = sorted.size() - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (sorted.get(mid) < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return left;
	}
}
