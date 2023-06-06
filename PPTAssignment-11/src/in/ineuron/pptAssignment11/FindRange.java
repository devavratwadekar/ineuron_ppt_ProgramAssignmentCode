package in.ineuron.pptAssignment11;

public class FindRange {
	public static int[] searchRange(int[] nums, int target) {
		int[] result = { -1, -1 };

		// Find the leftmost occurrence of the target
		int leftIndex = findIndex(nums, target, true);

		// If the target is not found, return [-1, -1]
		if (leftIndex == -1) {
			return result;
		}

		// Find the rightmost occurrence of the target
		int rightIndex = findIndex(nums, target, false);

		// Set the starting and ending positions of the target in the result array
		result[0] = leftIndex;
		result[1] = rightIndex;

		return result;
	}

	// Helper function to find the leftmost or rightmost occurrence of the target
	private static int findIndex(int[] nums, int target, boolean leftmost) {
		int index = -1;
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				index = mid;

				if (leftmost) {
					// Move the right pointer to search for the leftmost occurrence
					right = mid - 1;
				} else {
					// Move the left pointer to search for the rightmost occurrence
					left = mid + 1;
				}
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 6;
		int[] range = searchRange(nums, target);

		System.out.println("[" + range[0] + ", " + range[1] + "]");
	}
}
