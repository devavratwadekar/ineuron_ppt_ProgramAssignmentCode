package in.ineuron.pptAssignment02;

import java.util.Arrays;
/**
 * 
 * @author DEVAVRAT
 *
 */
public class DistibutedCandies {

	public static void main(String[] args) {
		int[] candTypes = { 1, 1, 2, 2, 3, 3 };
		System.out.println(distributeCandies(candTypes));

	}

	public static int distributeCandies(int[] candyType) {
		int n = candyType.length;
		if (n == 0) {
			return 0;
		}
		
		int type = 1;

		Arrays.sort(candyType);
		for (int i = 1; i < n; i++) {
			if (candyType[i] != candyType[i - 1]) {
				type++;
			}
		}

		return Math.min(type, n / 2);
	}

}
