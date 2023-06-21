package in.ineuron.pptAssignment19;

public class MergeTwoSortedArrays_6 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 5 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] mergedArray = mergeArrays(arr1, arr2);
		for (int num : mergedArray) {
			System.out.print(num + " ");
		}
		// Output: 1 2 3 4 4 5 6 8
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] mergedArray = new int[n1 + n2];
		int i = 0; // Index for arr1
		int j = 0; // Index for arr2
		int k = 0; // Index for mergedArray

		// Compare elements from both arrays and merge them in sorted order
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				mergedArray[k++] = arr1[i++];
			} else {
				mergedArray[k++] = arr2[j++];
			}
		}

		// Copy any remaining elements from arr1
		while (i < n1) {
			mergedArray[k++] = arr1[i++];
		}

		// Copy any remaining elements from arr2
		while (j < n2) {
			mergedArray[k++] = arr2[j++];
		}

		return mergedArray;
	}
}
