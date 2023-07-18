package in.ineuron.pptAssignment24;

public class MajorityElement_3 {
	public static int majorityElement(int[] nums) {
		int majority = nums[0];
		int count = 1;

		// Moore's Voting Algorithm
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == majority) {
				count++;
			} else {
				count--;
				if (count == 0) {
					majority = nums[i];
					count = 1;
				}
			}
		}

		return majority;
	}

	public static void main(String[] args) {
		int[] nums1 = { 3, 2, 3 };
		int result1 = majorityElement(nums1);
		System.out.println("Input: [3, 2, 3]");
		System.out.println("Output: " + result1);

		int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
		int result2 = majorityElement(nums2);
		System.out.println("Input: [2, 2, 1, 1, 1, 2, 2]");
		System.out.println("Output: " + result2);
	}
}
