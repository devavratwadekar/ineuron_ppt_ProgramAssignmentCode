package in.ineuron.pptAssignment11;

import java.util.*;

public class IntersectionArrays {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> intersectionSet = new HashSet<>();

		// Add unique elements from nums1 to the set
		for (int num : nums1) {
			set.add(num);
		}

		// Check if elements from nums2 are present in the set
		for (int num : nums2) {
			if (set.contains(num)) {
				intersectionSet.add(num);
			}
		}

		// Convert the set to an array
		int[] result = new int[intersectionSet.size()];
		int index = 0;
		for (int num : intersectionSet) {
			result[index++] = num;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] intersectionArray = intersection(nums1, nums2);

		System.out.print("[");
		for (int i = 0; i < intersectionArray.length; i++) {
			System.out.print(intersectionArray[i]);
			if (i < intersectionArray.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
