package in.ineuron.pptAssignment01;

public class MovesZeroes {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeros(nums);
		
		System.out.println("Array after moving zeros: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}

	}

	public static void moveZeros(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}
		while (count < nums.length) {
			nums[count++] = 0;
		}
	}
}
