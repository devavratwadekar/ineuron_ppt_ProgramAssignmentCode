package in.ineuron.pptAssignment02;

/**
 * 
 * @author DEVAVRAT
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int nums[] = { -1, 0, 3, 5, 9, 12 };
		int target = 9;
		System.out.println(" 9 exists in nums and its index is :: " + search(nums, target));

	}

	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}
}
