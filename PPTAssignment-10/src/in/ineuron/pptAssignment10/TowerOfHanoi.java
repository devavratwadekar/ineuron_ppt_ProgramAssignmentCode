package in.ineuron.pptAssignment10;

public class TowerOfHanoi {
	public static void solveTowerOfHanoi(int n, int source, int destination, int auxiliary) {
		if (n == 1) {
			System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
			return;
		}

		solveTowerOfHanoi(n - 1, source, auxiliary, destination);
		System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
		solveTowerOfHanoi(n - 1, auxiliary, destination, source);
	}

	public static int calculateTotalMoves(int n) {
		return (int) Math.pow(2, n) - 1;
	}

	public static void main(String[] args) {
		int n = 2;
		solveTowerOfHanoi(n, 1, 3, 2);
		int totalMoves = calculateTotalMoves(n);
		System.out.println(totalMoves);
	}
}
