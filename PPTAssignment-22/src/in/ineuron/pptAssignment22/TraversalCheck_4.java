package in.ineuron.pptAssignment22;

class Node04 {
	int data;
	Node04 left, right;

	public Node04(int item) {
		data = item;
		left = right = null;
	}
}

public class TraversalCheck_4 {
	Node04 constructTree(int[] inorder, int[] preorder, int inStart, int inEnd, int preIndex) {
		if (inStart > inEnd) {
			return null;
		}

		// Create a new node with the current element from the preorder traversal
		Node04 node = new Node04(preorder[preIndex]);
		preIndex++;

		// If the current node has no children, return the node
		if (inStart == inEnd) {
			return node;
		}

		// Find the index of the current node in the inorder traversal
		int inIndex = search(inorder, inStart, inEnd, node.data);

		// Construct the left and right subtrees recursively
		node.left = constructTree(inorder, preorder, inStart, inIndex - 1, preIndex);
		node.right = constructTree(inorder, preorder, inIndex + 1, inEnd, preIndex);

		return node;
	}

	// Helper function to search for an element in the inorder traversal
	int search(int[] arr, int start, int end, int value) {
		for (int i = start; i <= end; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1; // Element not found
	}

	// Function to check if the given traversals are of the same tree
	boolean checkSameTree(int[] inorder, int[] preorder, int[] postorder) {
		int n = inorder.length;
		int preIndex = 0;

		// Construct the tree using the inorder and preorder traversals
		Node04 root = constructTree(inorder, preorder, 0, n - 1, preIndex);

		// Check if the constructed tree matches the postorder traversal
		return checkPostorder(root, postorder, n, preIndex);
	}

	// Helper function to check if the constructed tree matches the postorder
	// traversal
	boolean checkPostorder(Node04 node, int[] postorder, int n, int preIndex) {
		if (node == null) {
			return true;
		}

		// Traverse the tree in postorder and compare with the postorder traversal array
		boolean leftSubtree = checkPostorder(node.left, postorder, n, preIndex);
		boolean rightSubtree = checkPostorder(node.right, postorder, n, preIndex);

		if (leftSubtree && rightSubtree && node.data == postorder[preIndex]) {
			preIndex++;
			return true;
		}

		return false;
	}

	// Driver method
	public static void main(String[] args) {
		TraversalCheck_4 tree = new TraversalCheck_4();
		int[] inorder = { 4, 2, 5, 1, 3 };
		int[] preorder = { 1, 2, 4, 5, 3 };
		int[] postorder = { 4, 5, 2, 3, 1 };

		boolean isSameTree = tree.checkSameTree(inorder, preorder, postorder);

		if (isSameTree) {
			System.out.println("The traversals are of the same tree.");
		} else {
			System.out.println("The traversals are not of the same tree.");
		}
	}
}
