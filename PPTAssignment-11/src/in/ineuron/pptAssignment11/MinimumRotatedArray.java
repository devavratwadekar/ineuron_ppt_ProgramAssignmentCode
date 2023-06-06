package in.ineuron.pptAssignment11;

public class MinimumRotatedArray {
	public static int findMin(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] > nums[right]) {
				// Minimum element is on the right side of mid
				left = mid + 1;
			} else {
				// Minimum element is on the left side of or equal to mid
				right = mid;
			}
		}

		return nums[left];
	}

	public static void main(String[] args) {
		int[] nums = { 11, 13, 15, 17 };
		int minElement = findMin(nums);
		System.out.println(minElement);
	}
}
