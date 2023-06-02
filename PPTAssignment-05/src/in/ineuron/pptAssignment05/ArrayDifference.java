package in.ineuron.pptAssignment05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDifference {
	public static List<List<Integer>> findArrayDifference(int[] nums1, int[] nums2) {
		List<Integer> diff1 = new ArrayList<>();
		List<Integer> diff2 = new ArrayList<>();

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		// Add all elements of nums1 to set1
		for (int num : nums1) {
			set1.add(num);
		}

		// Add all elements of nums2 to set2
		for (int num : nums2) {
			set2.add(num);
		}

		// Find elements in nums1 that are not present in nums2
		for (int num : nums1) {
			if (!set2.contains(num)) {
				diff1.add(num);
			}
		}

		// Find elements in nums2 that are not present in nums1
		for (int num : nums2) {
			if (!set1.contains(num)) {
				diff2.add(num);
			}
		}

		List<List<Integer>> answer = new ArrayList<>();
		answer.add(diff1);
		answer.add(diff2);

		return answer;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };

		List<List<Integer>> answer = findArrayDifference(nums1, nums2);

		System.out.println(answer);
	}
}
