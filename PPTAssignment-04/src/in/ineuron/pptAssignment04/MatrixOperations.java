package in.ineuron.pptAssignment04;

public class MatrixOperations {
	public static void main(String[] args) {
		int[][] ops = { { 2, 2 }, { 3, 3 } };
		int m = 3, n = 3;
		System.out.println("Matrix Operations :: "+maxCount(m, n, ops));
	}

	public static int maxCount(int m, int n, int[][] ops) {
		if (ops == null || ops.length == 0) {
			return m * n;
		}

		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;

		for (int[] op : ops) {
			minX = Math.min(minX, op[0]);
			minY = Math.min(minY, op[1]);
		}

		return minX * minY;
	}
}
