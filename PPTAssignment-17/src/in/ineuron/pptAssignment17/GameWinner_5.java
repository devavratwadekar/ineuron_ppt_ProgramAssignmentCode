package in.ineuron.pptAssignment17;

public class GameWinner_5 {
	public static int findWinner(int n, int k) {
		int winner = 0;
		for (int i = 1; i <= n; i++) {
			winner = (winner + k) % i;
		}
		return winner + 1;
	}

	public static void main(String[] args) {
		int n = 5;
		int k = 2;
		int winner = findWinner(n, k);
		System.out.println("Winner: " + winner);
	}
}
