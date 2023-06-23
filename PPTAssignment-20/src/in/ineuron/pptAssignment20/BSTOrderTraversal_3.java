package in.ineuron.pptAssignment20;

import java.util.LinkedList;
import java.util.Queue;

class BSTLevelOrderValidation {
	boolean isLevelOrderBST(int[] arr) {
		if (arr == null || arr.length == 0)
			return true;

		int n = arr.length;
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(arr[0]);

		int i = 1;
		while (i < n) {
			int current = queue.poll();

			// Find the index where the right subtree starts
			int index = -1;
			for (int j = i; j < n; j++) {
				if (arr[j] > current) {
					index = j;
					break;
				}
			}

			// Check if the elements in the right subtree are greater than the current node
			if (index != -1) {
				for (int j = index; j < n; j++) {
					if (arr[j] < current)
						return false;
				}

				// Enqueue the right subtree elements
				for (int j = index; j < n; j++)
					queue.offer(arr[j]);

				i = index + 1;
			} else {
				// Enqueue the remaining elements
				for (int j = i; j < n; j++)
					queue.offer(arr[j]);

				break;
			}
		}

		return true;
	}
}

public class BSTOrderTraversal_3 {
	public static void main(String[] args) {
		int[] arr = { 7, 4, 12, 3, 6, 8, 1, 5, 10 };

		BSTLevelOrderValidation bst = new BSTLevelOrderValidation();
		boolean isValid = bst.isLevelOrderBST(arr);

		System.out.println("Can represent level order traversal of a BST? " + (isValid ? "Yes" : "No"));
	}
}
