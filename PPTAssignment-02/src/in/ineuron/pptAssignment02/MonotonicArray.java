package in.ineuron.pptAssignment02;

/**
 * 
 * @author DEVAVRAT WADEKAR 
 * 		An array nums is monotone increasing if for all i <=
 *         j, nums[i] <= nums[j]. An array nums is monotone decreasing if for
 *         all i <= j, nums[i] >= nums[j]. Given an integer array nums, return
 *         true if the given array is monotonic, or false otherwise.
 * 
 *         Example 1: Input: nums = [1,2,2,3] Output: true
 */
public class MonotonicArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3 };
		System.out.println("Monotonic Array :: " + isMonotonic(nums));
	}

	public static boolean isMonotonic(int[] nums) {

		boolean increasing = true;
		boolean decreasing = true;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] > nums[i]) {
				decreasing = false;
			}

			if (nums[i + 1] < nums[i]) {
				increasing = false;
			}

			if (increasing == false && decreasing == false) {
				return false;
			}
		}
		return true;
	}

}
