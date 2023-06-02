package in.ineuron.pptAssignment06;

public class SearchMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		System.out.println(searchMatrix(matrix, target));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int left = 0;
		int right = rows * cols - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int midValue = matrix[mid / cols][mid % cols];

			if (midValue == target) {
				return true;
			} else if (midValue < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return false;
	}
}
