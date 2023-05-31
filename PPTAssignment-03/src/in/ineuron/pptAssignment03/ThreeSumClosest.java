package in.ineuron.pptAssignment03;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;

		System.out.println("Three SUM Closest :: " + threeSumClosest(nums, target));
	}

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closestSum = Integer.MAX_VALUE;
		int curSum = 0;

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				curSum = nums[i] + nums[left] + nums[right];
				if (curSum == target) {
					return curSum;
				} else if (Math.abs(target - curSum) < Math.abs(target - closestSum)) {
					closestSum = curSum;
				}
				if (curSum <= target) {
					left += 1;
					while (nums[left] == nums[left - 1] && left < right) {
						left += 1;
					}
				} else {
					right -= 1;
				}
			}
		}
		return closestSum;
	}

}
