package in.ineuron.pptAssignment18;

public class SortColors_2 {
	public static void sortColors(int[] nums) {
		int low = 0; // Pointer for the red color (0)
		int mid = 0; // Pointer for the white color (1)
		int high = nums.length - 1; // Pointer for the blue color (2)

		while (mid <= high) {
			if (nums[mid] == 0) {
				// Swap nums[mid] and nums[low] and move both pointers to the right
				swap(nums, low, mid);
				low++;
				mid++;
			} else if (nums[mid] == 1) {
				// Element is already in the correct position, move the mid pointer to the right
				mid++;
			} else {
				// Swap nums[mid] and nums[high] and move the high pointer to the left
				swap(nums, mid, high);
				high--;
			}
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);

		// Print the sorted array
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
