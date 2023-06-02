package in.ineuron.pptAssignment04;

public class ShuffleArray {
	public static int[] shuffle(int[] nums, int n) {
		int[] result = new int[2 * n];
		int index = 0;

		// Traverse through the array elements
		for (int i = 0; i < n; i++) {
			// Add x[i] and y[i] to the result array
			result[index++] = nums[i];
			result[index++] = nums[i + n];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;

		int[] shuffledArray = shuffle(nums, n);

		// Print the shuffled array
		for (int num : shuffledArray) {
			System.out.print(num + " ");
		}
	}
}
