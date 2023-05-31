package in.ineuron.pptAssignment02;
/**
 * 
 * @author DEVAVRAT
 *
 */
public class MinScore {

	public static void main(String[] args) {
		int[] nums = { 1};
		int k = 0;
		System.out.println("Min Score :: " + minScore(nums, k));

	}

	public static int minScore(int[] nums, int k) {
		// Find the minimum and maximum elements in the array.
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int num : nums) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		// Find the minimum score that can be achieved.
		int minScore = max - min;

		// For each index i, try to increase nums[i] by x, where x is an integer from the range [-k, k].
		// If the score of nums after increasing nums[i] is less than minScore, then update minScore.
		for (int i = 0; i < nums.length; i++) {
			for (int x = -k; x <= k; x++) {
				int newNum = nums[i] + x;
				int newScore = max - newNum;

				if (newScore < minScore) {
					minScore = newScore;
				}
			}
		}

		// Return the minimum score.
		return minScore;
	}

}
