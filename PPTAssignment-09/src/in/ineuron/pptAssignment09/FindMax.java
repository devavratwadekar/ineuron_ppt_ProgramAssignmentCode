package in.ineuron.pptAssignment09;

public class FindMax {
	public static int findMax(int[] arr, int start, int end) {
		if (start == end) {
			return arr[start]; // Base case: when there is only one element
		} else {
			int mid = (start + end) / 2;
			int max1 = findMax(arr, start, mid); // Maximum element in the first half of the array
			int max2 = findMax(arr, mid + 1, end); // Maximum element in the second half of the array
			return Math.max(max1, max2); // Return the maximum of the two halves
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, -5, -4, 8, 6 };
		int max = findMax(arr, 0, arr.length - 1);
		System.out.println(max);
	}
}
