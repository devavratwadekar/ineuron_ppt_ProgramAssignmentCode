package in.ineuron.pptAssignment19;

public class MoveAllZeroesToEndOfArray_4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
		moveZeroes(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		// Output: 1 2 4 3 5 0 0 0
	}

	public static void moveZeroes(int[] arr) {
		int n = arr.length;
		int count = 0; // Count of non-zero elements

		// Traverse the array and move non-zero elements to the beginning
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}

		// Fill the remaining elements with zeroes
		while (count < n) {
			arr[count++] = 0;
		}
	}
}
