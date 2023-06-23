package in.ineuron.pptAssignment20;

//Definition of a binary tree node
class TreeNode02 {
	int val;
	TreeNode02 left;
	TreeNode02 right;

	TreeNode02(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

class BSTConstruction {
	TreeNode02 constructBST(int[] arr) {
		if (arr == null || arr.length == 0)
			return null;

		TreeNode02 root = new TreeNode02(arr[0]);
		for (int i = 1; i < arr.length; i++)
			insertNode(root, arr[i]);

		return root;
	}

	void insertNode(TreeNode02 root, int value) {
		if (value < root.val) {
			if (root.left == null)
				root.left = new TreeNode02(value);
			else
				insertNode(root.left, value);
		} else {
			if (root.right == null)
				root.right = new TreeNode02(value);
			else
				insertNode(root.right, value);
		}
	}

	void printBST(TreeNode02 root) {
		if (root == null)
			return;

		printBST(root.left);
		System.out.print(root.val + " ");
		printBST(root.right);
	}
}

public class BinarySearchTreeContr_2 {
	public static void main(String[] args) {
		int[] arr = { 7, 4, 12, 3, 6, 8, 1, 5, 10 };

		BSTConstruction bst = new BSTConstruction();
		TreeNode02 root = bst.constructBST(arr);

		System.out.println("BST:");
		bst.printBST(root);
	}
}
