package in.ineuron.pptAssignment11;

import java.util.*;

public class IntersectionArrays_8 {
	public static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> intersectionList = new ArrayList<>();

		// Count the frequency of elements in nums1
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		// Check the frequency of elements in nums2
		for (int num : nums2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				intersectionList.add(num);
				map.put(num, map.get(num) - 1);
			}
		}

		// Convert the list to an array
		int[] result = new int[intersectionList.size()];
		for (int i = 0; i < intersectionList.size(); i++) {
			result[i] = intersectionList.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] intersectionArray = intersect(nums1, nums2);

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
