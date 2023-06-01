package in.ineuron.pptAssignment03;

public class SingleNumber {
	public int findSingleNumber(int[] nums) {
		int result = 0;

		// XOR all the elements in the array
		for (int num : nums) {
			result ^= num;
		}

		return result;
	}

	public static void main(String[] args) {
		SingleNumber singleNumber = new SingleNumber();
		int[] nums = { 2, 2, 1 };
		int single = singleNumber.findSingleNumber(nums);
		System.out.println("Single Number: " + single);
	}
}
