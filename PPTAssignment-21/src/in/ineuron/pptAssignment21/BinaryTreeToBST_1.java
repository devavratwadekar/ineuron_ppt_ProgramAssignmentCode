package in.ineuron.pptAssignment21;

import java.util.*;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

public class BinaryTreeToBST_1 {
	// Perform an INORDER traversal of the binary tree
	private static void inorderTraversal(TreeNode root, List<Integer> list) {
		if (root == null)
			return;

		inorderTraversal(root.left, list);
		list.add(root.val);
		inorderTraversal(root.right, list);
	}

	// Build a binary search tree using the sorted values
	private static TreeNode buildBST(List<Integer> sortedValues, int start, int end) {
		if (start > end)
			return null;

		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(sortedValues.get(mid));

		node.left = buildBST(sortedValues, start, mid - 1);
		node.right = buildBST(sortedValues, mid + 1, end);

		return node;
	}

	// Convert binary tree to binary search tree
	public static TreeNode convertBinaryTreeToBST(TreeNode root) {
		// Step 1: Perform an INORDER traversal to obtain sorted values
		List<Integer> sortedValues = new ArrayList<>();
		inorderTraversal(root, sortedValues);

		// Step 2: Build a new binary search tree using the sorted values
		int n = sortedValues.size();
		return buildBST(sortedValues, 0, n - 1);
	}

	// Utility function to print the INORDER traversal of a binary tree
	private static void printInorder(TreeNode root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.val + " ");
		printInorder(root.right);
	}

	public static void main(String[] args) {
		// Construct the binary tree
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(4);

		// Convert binary tree to binary search tree
		TreeNode bstRoot = convertBinaryTreeToBST(root);

		// Print the INORDER traversal of the binary search tree
		System.out.print("Inorder traversal of the converted BST: ");
		printInorder(bstRoot);
	}
}
