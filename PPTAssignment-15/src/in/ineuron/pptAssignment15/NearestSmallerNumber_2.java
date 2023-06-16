package in.ineuron.pptAssignment15;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerNumber_2 {
	public static int[] findNearestSmaller(int[] a) {
		int n = a.length;
		int[] result = new int[n];
		Arrays.fill(result, -1);

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
				stack.pop();
			}

			if (!stack.isEmpty()) {
				result[i] = a[stack.peek()];
			}

			stack.push(i);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] a = { 1, 6, 2 };
		int[] result = findNearestSmaller(a);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
