package in.ineuron.pptAssignment19;

public class SortByArray_3 {
	public static void main(String[] args) {
		int[] nums = { 5, 1, 1, 2, 0, 0 };
		sortArray(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
		// Output: 1 2 3 5
	}

	public static void sortArray(int[] nums) {
		mergeSort(nums, 0, nums.length - 1);
	}

	private static void mergeSort(int[] nums, int left, int right) {
		if (left >= right) {
			return;
		}

		int mid = left + (right - left) / 2;
		mergeSort(nums, left, mid);
		mergeSort(nums, mid + 1, right);
		merge(nums, left, mid, right);
	}

	private static void merge(int[] nums, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= right) {
			if (nums[i] <= nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = nums[i++];
		}

		while (j <= right) {
			temp[k++] = nums[j++];
		}

		for (i = left; i <= right; i++) {
			nums[i] = temp[i - left];
		}
	}
}
