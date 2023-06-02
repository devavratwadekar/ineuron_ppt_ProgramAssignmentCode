package in.ineuron.pptAssignment06;

import java.util.HashMap;
import java.util.Map;

public class ContiguousSubarray {

	public static int findMaxLength(int[] nums) {
		// Create a map to store the cumulative count and its corresponding index
		Map<Integer, Integer> countMap = new HashMap<>();
		countMap.put(0, -1); // Initialize the map with count 0 at index -1
		int maxLen = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			// Increment count by 1 for 1 and decrement by 1 for 0
			count += nums[i] == 1 ? 1 : -1;

			// If the count is already present in the map, update the maximum length
			if (countMap.containsKey(count)) {
				int prevIndex = countMap.get(count);
				maxLen = Math.max(maxLen, i - prevIndex);
			} else {
				// If the count is not present, add it to the map
				countMap.put(count, i);
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1 };
		int maxLength = findMaxLength(nums);
		System.out.println("Maximum length of contiguous subarray: " + maxLength);
	}
}
