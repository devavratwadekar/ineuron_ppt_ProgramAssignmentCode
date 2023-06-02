package in.ineuron.pptAssignment06;

import java.util.*;

public class SparseMatrixMultiplication {

	public static void main(String[] args) {
		int[][] mat1 = { { 1, 0, 0 }, { -1, 0, 3 } };
		int[][] mat2 = { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };

		SparseMatrixMultiplication matrixMultiplication = new SparseMatrixMultiplication();
		int[][] result = matrixMultiplication.multiply(mat1, mat2);

		// Print the result
		for (int[] row : result) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	public int[][] multiply(int[][] mat1, int[][] mat2) {
		int m = mat1.length;
		int k = mat1[0].length;
		int n = mat2[0].length;

		int[][] result = new int[m][n];

		// Create a map to store the non-zero elements of mat2
		Map<Integer, Map<Integer, Integer>> sparseMat2 = new HashMap<>();
		for (int j = 0; j < k; j++) {
			for (int i = 0; i < n; i++) {
				if (mat2[j][i] != 0) {
					sparseMat2.computeIfAbsent(j, HashMap::new).put(i, mat2[j][i]);
				}
			}
		}

		// Perform matrix multiplication
		for (int i = 0; i < m; i++) {
			for (int j : sparseMat2.keySet()) {
				Map<Integer, Integer> colMap = sparseMat2.get(j);
				for (int l : colMap.keySet()) {
					result[i][l] += mat1[i][j] * colMap.get(l);
				}
			}
		}

		return result;
	}
}
