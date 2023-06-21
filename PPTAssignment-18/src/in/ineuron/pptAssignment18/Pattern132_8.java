package in.ineuron.pptAssignment18;

import java.util.Stack;

public class Pattern132_8 {
	public static boolean find132pattern(int[] nums) {
		int n = nums.length;
		Stack<Integer> stack = new Stack<>();
		int numK = Integer.MIN_VALUE; // Initialize numK to the minimum value

		for (int i = n - 1; i >= 0; i--) {
			// Check if the current element is greater than numK
			if (nums[i] < numK) {
				return true; // Found a 132 pattern
			}

			// Keep updating numK by popping elements from the stack that are less than the
			// current element
			while (!stack.isEmpty() && nums[i] > stack.peek()) {
				numK = stack.pop();
			}

			// Push the current element to the stack
			stack.push(nums[i]);
		}

		return false; // No 132 pattern found
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		boolean has132Pattern = find132pattern(nums);
		System.out.println("Has 132 Pattern: " + has132Pattern);
	}
}
