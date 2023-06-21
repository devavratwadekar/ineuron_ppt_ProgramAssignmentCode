package in.ineuron.pptAssignment18;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_5 {
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (set.contains(num)) {
				return true; // Found a duplicate element
			}
			set.add(num);
		}

		return false; // No duplicates found
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		boolean containsDup = containsDuplicate(nums);
		System.out.println("Contains Duplicate: " + containsDup);
	}
}
