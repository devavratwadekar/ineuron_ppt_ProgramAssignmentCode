package in.ineuron.pptAssignment01;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		// Create a hash table to store the elements of the array.
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		// Iterate over the array, and for each element, check if its complement exists
		// in the hash table.
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}

		// If no two elements add up to the target, return null.
		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] numSum = twoSum(nums, target);
		if (numSum != null) {
			System.out.println("Indices of the two numbers that add up to the target: " + numSum[0] + ", " + numSum[1]);
		} else {
			System.out.println("No solution found.");
		}
	}
}
