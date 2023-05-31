package in.ineuron.pptAssignment02;

import java.util.HashMap;
import java.util.Map;

//Longest Harmonious Subsequence
/**
 * 
 * @author DEVAVRAT
 *
 */
public class FindLHS {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
		System.out.println("Longest Harmonious Subsequence :: " + findLHS(nums));

	}

	private static int findLHS(int[] nums) {
		int result = 0;
		Map<Integer, Integer> count = new HashMap<>();
		for (int i : nums) {
			count.put(i, count.getOrDefault(i, 0) + 1);
		}
		for (int i : count.keySet()) {
			if (count.containsKey(i + 1)) {
				result = Math.max(result, count.get(i) + count.get(i + 1));
			}
		}
		return result;
	}

}
//TC:O(n)
//SC:O(n)
