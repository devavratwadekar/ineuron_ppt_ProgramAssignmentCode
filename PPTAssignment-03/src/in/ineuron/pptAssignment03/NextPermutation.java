package in.ineuron.pptAssignment03;

public class NextPermutation {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		nextPermutation(nums);
		System.out.println(NextPermutation.nextPermutation(nums));

	}

	public static void nextPermutation(int[] nums) {
		int i = nums.length - 2; // i=3-2=>1
		while (i >= 0 && nums[i + 1] <= nums[i]) { // 3<2
			i--;
		}
		if (i >= 0) { // i=1
			int j = nums.length - 1; // j=3-1=>2
			while (nums[j] <= nums[i]) { // 2<=1
				j--;
			}
			swap(nums, i, j);
		}
		reverse(nums, i + 1); // [1,2,3],1+1
	}

	private static void reverse(int[] nums, int start) {
		int i = start, j = nums.length - 1; // i=1,j=2
		while (i < j) {
			swap(nums, i, j); // [1,2,3],1,2
			i++;
			j--;
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i]; // t=2
		nums[i] = nums[j]; // n[1]=n[2]=>3
		nums[j] = temp; // n[2]=num[i]=>2

	}
}