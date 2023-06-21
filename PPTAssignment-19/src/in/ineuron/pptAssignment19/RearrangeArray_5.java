package in.ineuron.pptAssignment19;

public class RearrangeArray_5 {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -4, -1, 4 };
		rearrangeArray(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		// Output: -4 1 -1 2 3 4
	}

	public static void rearrangeArray(int[] arr) {
		int n = arr.length;

		// Find the index of the first positive number
		int posIndex = 0;
		while (posIndex < n && arr[posIndex] < 0) {
			posIndex++;
		}

		// Rearrange the array using the two-pointer approach
		int negIndex = 1;
		while (posIndex < n && negIndex < n) {
			// Swap the positive number with the negative number
			int temp = arr[posIndex];
			arr[posIndex] = arr[negIndex];
			arr[negIndex] = temp;

			// Move the pointers to the next positive and negative numbers
			posIndex += 2;
			negIndex += 2;
		}
	}
}
