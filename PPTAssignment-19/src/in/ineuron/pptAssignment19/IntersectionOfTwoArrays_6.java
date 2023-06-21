package in.ineuron.pptAssignment19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays_6 {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] intersection = findIntersection(nums1, nums2);
		for (int num : intersection) {
			System.out.print(num + " ");
		}
		// Output: 2
	}

	public static int[] findIntersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		// Add elements from nums1 to set1
		for (int num : nums1) {
			set1.add(num);
		}

		// Add elements from nums2 to set2
		for (int num : nums2) {
			set2.add(num);
		}

		// Find the intersection of set1 and set2
		List<Integer> intersection = new ArrayList<>();
		for (int num : set1) {
			if (set2.contains(num)) {
				intersection.add(num);
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
