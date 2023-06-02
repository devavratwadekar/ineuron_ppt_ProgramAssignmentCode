package in.ineuron.pptAssignment06;

public class SpiralMatrixGenerator {
	public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int num = 1; // Starting number
		int rowStart = 0, rowEnd = n - 1;
		int colStart = 0, colEnd = n - 1;

		while (rowStart <= rowEnd && colStart <= colEnd) {
			// Fill the top row
			for (int col = colStart; col <= colEnd; col++) {
				matrix[rowStart][col] = num++;
			}
			rowStart++;

			// Fill the right column
			for (int row = rowStart; row <= rowEnd; row++) {
				matrix[row][colEnd] = num++;
			}
			colEnd--;

			// Fill the bottom row
			if (rowStart <= rowEnd) {
				for (int col = colEnd; col >= colStart; col--) {
					matrix[rowEnd][col] = num++;
				}
				rowEnd--;
			}

			// Fill the left column
			if (colStart <= colEnd) {
				for (int row = rowEnd; row >= rowStart; row--) {
					matrix[row][colStart] = num++;
				}
				colStart++;
			}
		}

		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 3;
		int[][] matrix = generateMatrix(n);
		printMatrix(matrix);
	}
}
