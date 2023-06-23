package in.ineuron.pptAssignment20;

//Definition of a binary tree node
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

class Result {
	int maxSum;

	Result(int maxSum) {
		this.maxSum = maxSum;
	}
}

class BinaryTree {
	private TreeNode root;

	BinaryTree(TreeNode root) {
		this.root = root;
	}

	private int findMaxSubtreeSum(TreeNode node, Result result) {
		if (node == null)
			return 0;

		// Recursively calculate sum of left and right subtrees
		int leftSum = findMaxSubtreeSum(node.left, result);
		int rightSum = findMaxSubtreeSum(node.right, result);

		// Update the maximum sum if the current subtree's sum is greater
		int currentSum = node.val + leftSum + rightSum;
		result.maxSum = Math.max(result.maxSum, currentSum);

		// Return the sum of the current subtree
		return currentSum;
	}

	int findMaxSubtreeSum() {
		Result result = new Result(Integer.MIN_VALUE);
		findMaxSubtreeSum(root, result);
		return result.maxSum;
	}
}

public class MaxSubtreeSum_1 {
	public static void main(String[] args) {
		// Create the binary tree
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		// Create an instance of BinaryTree and find the maximum subtree sum
		BinaryTree tree = new BinaryTree(root);
		int maxSum = tree.findMaxSubtreeSum();
		System.out.println("Maximum subtree sum: " + maxSum);
	}
}
