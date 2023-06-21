package in.ineuron.pptAssignment19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII_8 {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] intersection = findIntersection(nums1, nums2);
		for (int num : intersection) {
			System.out.print(num + " ");
		}
		// Output: 2 2
	}

	public static int[] findIntersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> countMap1 = new HashMap<>();
		Map<Integer, Integer> countMap2 = new HashMap<>();

		// Count the occurrences of each element in nums1
		for (int num : nums1) {
			countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
		}

		// Count the occurrences of each element in nums2
		for (int num : nums2) {
			countMap2.put(num, countMap2.getOrDefault(num, 0) + 1);
		}

		// Find the intersection by comparing the counts in both maps
		List<Integer> intersection = new ArrayList<>();
		for (int num : countMap1.keySet()) {
			if (countMap2.containsKey(num)) {
				int count = Math.min(countMap1.get(num), countMap2.get(num));
				for (int i = 0; i < count; i++) {
					intersection.add(num);
				}
			}
		}

		// Convert the List<Integer> to int[]
		int[] result = new int[intersection.size()];
		for (int i = 0; i < intersection.size(); i++) {
			result[i] = intersection.get(i);
		}

		return result;
	}
}
