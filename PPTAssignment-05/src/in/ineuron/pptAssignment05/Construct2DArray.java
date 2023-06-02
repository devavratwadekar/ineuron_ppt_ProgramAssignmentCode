package in.ineuron.pptAssignment05;

public class Construct2DArray {
	public static int[][] construct2DArray(int[] original, int m, int n) {
		int totalElements = original.length;
		if (totalElements != m * n) {
			return new int[0][0]; // Return an empty 2D array
		}

		int[][] newArray = new int[m][n];
		for (int i = 0; i < totalElements; i++) {
			int row = i / n;
			int column = i % n;
			newArray[row][column] = original[i];
		}

		return newArray;
	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4 };
		int m = 2;
		int n = 2;
		int[][] result = construct2DArray(original, m, n);

		// Print the result
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
