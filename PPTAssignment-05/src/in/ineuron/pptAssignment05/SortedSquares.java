package in.ineuron.pptAssignment05;

import java.util.Arrays;

public class SortedSquares {
	public static int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		int left = 0;
		int right = nums.length - 1;
		int index = nums.length - 1;

		while (left <= right) {
			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];

			if (leftSquare > rightSquare) {
				result[index] = leftSquare;
				left++;
			} else {
				result[index] = rightSquare;
				right--;
			}
			index--;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		int[] result = sortedSquares(nums);
		System.out.println(Arrays.toString(result));
	}
}
