package in.ineuron.pptAssignment04;

public class MatrixTranspose {
	public static int[][] transpose(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;

		int[][] transposedMatrix = new int[columns][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				transposedMatrix[j][i] = matrix[i][j];
			}
		}

		return transposedMatrix;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] transposedMatrix = transpose(matrix);

		// Print the transposed matrix
		for (int i = 0; i < transposedMatrix.length; i++) {
			for (int j = 0; j < transposedMatrix[0].length; j++) {
				System.out.print(transposedMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
