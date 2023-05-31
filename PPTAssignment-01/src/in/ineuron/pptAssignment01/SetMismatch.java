package in.ineuron.pptAssignment01;

public class SetMismatch {

	public int[] findErrorNums(int[] nums) {
		int N = nums.length, sum = N * (N + 1) / 2;
		int[] ans = new int[2];
		boolean[] seen = new boolean[N + 1];
		for (int num : nums) {
			sum -= num;
			if (seen[num])
				ans[0] = num;
			seen[num] = true;
		}
		ans[1] = sum + ans[0];
		return ans;
	}

	public static void main(String[] args) {
		SetMismatch test = new SetMismatch();
		int[] nums = { 1, 2, 2, 4 }; // Example input
		int[] result = test.findErrorNums(nums);
		System.out.println("Mismatch Numbers: " + result[0] + ", " + result[1]);
	}
}
