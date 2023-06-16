package in.ineuron.pptAssignment16;

import java.util.Stack;

public class MaxAbsoluteDifference_8 {
	public static int maxAbsoluteDifference(int[] arr) {
		int n = arr.length;
		int[] leftSmaller = new int[n]; // Stores the nearest smaller element on the left side
		int[] rightSmaller = new int[n]; // Stores the nearest smaller element on the right side

		// Find the nearest smaller element on the left side for each element
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			leftSmaller[i] = stack.isEmpty() ? 0 : stack.peek();
			stack.push(arr[i]);
		}

		stack.clear();

		// Find the nearest smaller element on the right side for each element
		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			rightSmaller[i] = stack.isEmpty() ? 0 : stack.peek();
			stack.push(arr[i]);
		}

		int maxDiff = 0;

		// Find the maximum absolute difference between the nearest left and right
		// smaller elements
		for (int i = 0; i < n; i++) {
			int diff = Math.abs(leftSmaller[i] - rightSmaller[i]);
			maxDiff = Math.max(maxDiff, diff);
		}

		return maxDiff;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 8 };
		int maxDiff = maxAbsoluteDifference(arr);

		System.out.println("Maximum Absolute Difference: " + maxDiff);
	}
}
