package in.ineuron.pptAssignment11;

public class FindDuplicate {
	public static int findDuplicate(int[] nums) {
		// Step 1: Find the intersection point of the two pointers
		int tortoise = nums[0];
		int hare = nums[0];

		do {
			tortoise = nums[tortoise];
			hare = nums[nums[hare]];
		} while (tortoise != hare);

		// Step 2: Find the entrance to the cycle
		tortoise = nums[0];
		while (tortoise != hare) {
			tortoise = nums[tortoise];
			hare = nums[hare];
		}

		return hare;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		int duplicateNumber = findDuplicate(nums);
		System.out.println(duplicateNumber);
	}
}
