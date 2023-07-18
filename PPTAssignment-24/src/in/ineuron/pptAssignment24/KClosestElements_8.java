package in.ineuron.pptAssignment24;

import java.util.ArrayList;
import java.util.List;

public class KClosestElements_8 {
	public static List<Integer> findClosestElements(int[] arr, int k, int x) {
		int left = 0;
		int right = arr.length - 1;

		// Binary search to find the closest element to x
		while (right - left >= k) {
			int mid = left + (right - left) / 2;

			// Compare the distances of the elements at mid and mid + k to x
			if (Math.abs(arr[mid] - x) > Math.abs(arr[mid + k] - x)) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		// Create a list to store the k closest elements
		List<Integer> result = new ArrayList<>();
		for (int i = left; i < left + k; i++) {
			result.add(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int k1 = 4;
		int x1 = 3;
		List<Integer> result1 = findClosestElements(arr1, k1, x1);
		System.out.println("Input: arr = " + arrayToString(arr1) + ", k = " + k1 + ", x = " + x1);
		System.out.println("Output: " + result1);

		int[] arr2 = { 1, 2, 3, 4, 5 };
		int k2 = 4;
		int x2 = -1;
		List<Integer> result2 = findClosestElements(arr2, k2, x2);
		System.out.println("Input: arr = " + arrayToString(arr2) + ", k = " + k2 + ", x = " + x2);
		System.out.println("Output: " + result2);
	}

	private static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i < arr.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
