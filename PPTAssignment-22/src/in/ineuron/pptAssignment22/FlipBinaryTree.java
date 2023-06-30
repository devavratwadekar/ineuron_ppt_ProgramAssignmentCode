package in.ineuron.pptAssignment22;

class Node02 {
	int data;
	Node02 left, right;

	public Node02(int item) {
		data = item;
		left = right = null;
	}
}

class FlipBinaryTree {
	Node02 root;

	// Helper function to flip the binary tree
	Node02 flipBinaryTree(Node02 node) {
		// Base case
		if (node == null || (node.left == null && node.right == null)) {
			return node;
		}

		// Recursively flip the left and right subtrees
		Node02 flippedRoot = flipBinaryTree(node.left);

		// Set the left child of the flipped root as the right child of the original
		// node
		node.left.left = node.right;
		node.left.right = node;

		// Set the original node's left and right pointers to null
		node.left = node.right = null;

		// Return the flipped root
		return flippedRoot;
	}

	// Helper function to print the binary tree in inorder traversal
	void printInorder(Node02 node) {
		if (node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

	// Driver method
	public static void main(String[] args) {
		FlipBinaryTree tree = new FlipBinaryTree();
		tree.root = new Node02(1);
		tree.root.left = new Node02(2);
		tree.root.right = new Node02(3);
		tree.root.left.left = new Node02(4);
		tree.root.left.right = new Node02(5);

		// Print the original binary tree
		System.out.println("Original Binary Tree:");
		tree.printInorder(tree.root);

		// Flip the binary tree
		tree.root = tree.flipBinaryTree(tree.root);

		// Print the flipped binary tree
		System.out.println("\nFlipped Binary Tree:");
		tree.printInorder(tree.root);
	}
}
