package in.ineuron.pptAssignment08;

public class DeleteOperation {
	public static void main(String[] args) {
		String word1 = "sea", word2 = "eat";
		System.out.println(minDistance(word1, word2));

	}

	public static int minDistance(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();

		// Create a 2D array to store the minimum number of steps
		int[][] dp = new int[m + 1][n + 1];

		// Fill the first row and column
		for (int i = 0; i <= m; i++) {
			dp[i][0] = i;
		}

		for (int j = 0; j <= n; j++) {
			dp[0][j] = j;
		}

		// Fill the remaining cells of the dp array
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
				}
			}
		}

		// The minimum number of steps is stored in the bottom-right cell of the dp
		// array
		return dp[m][n];
	}
}
