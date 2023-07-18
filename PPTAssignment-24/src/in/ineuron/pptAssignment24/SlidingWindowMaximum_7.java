package in.ineuron.pptAssignment24;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum_7 {
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		if (n == 0)
			return new int[0];

		int[] result = new int[n - k + 1];
		Deque<Integer> deque = new ArrayDeque<>();

		// Process the first k elements separately to initialize the deque
		for (int i = 0; i < k; i++) {
			while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);
		}

		// Process the remaining elements
		for (int i = k; i < n; i++) {
			result[i - k] = nums[deque.peekFirst()];

			while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
				deque.removeFirst();
			}

			while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
				deque.removeLast();
			}

			deque.addLast(i);
		}

		result[n - k] = nums[deque.peekFirst()];

		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k1 = 3;
		int[] result1 = maxSlidingWindow(nums1, k1);
		System.out.println("Input: " + Arrays.toString(nums1) + ", k = " + k1);
		System.out.println("Output: " + Arrays.toString(result1));

		int[] nums2 = { 1 };
		int k2 = 1;
		int[] result2 = maxSlidingWindow(nums2, k2);
		System.out.println("Input: " + Arrays.toString(nums2) + ", k = " + k2);
		System.out.println("Output: " + Arrays.toString(result2));
	}
}
