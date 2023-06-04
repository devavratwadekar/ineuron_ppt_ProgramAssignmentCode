package in.ineuron.pptAssignment08;

public class LowestASCIIDeletedSum {

	public static void main(String[] args) {
		String s1 = "sea", s2 = "eat";
		System.out.println(minimumDeleteSum(s1, s2));
	}

	public static int minimumDeleteSum(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		// Create a 2D array to store the minimum ASCII sum of deleted characters
		int[][] dp = new int[m + 1][n + 1];

		// Initialize the first row and column
		for (int i = 1; i <= m; i++) {
			dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
		}

		for (int j = 1; j <= n; j++) {
			dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
		}

		// Fill the remaining cells of the dp array
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
				}
			}
		}

		// The lowest ASCII sum of deleted characters is stored in the bottom-right cell
		// of the dp array
		return dp[m][n];
	}
}
