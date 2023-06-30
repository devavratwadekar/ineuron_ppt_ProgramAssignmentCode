package in.ineuron.pptAssignment22;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

class BinaryTreeToDLL_1 {
	Node root;
	Node head;
	Node prev;

	// Helper function to convert binary tree to DLL
	void binaryTreeToDLL(Node root) {
		// Base case
		if (root == null)
			return;

		// Recursively convert the left subtree
		binaryTreeToDLL(root.left);

		// Process the current node
		if (head == null) {
			// If head is null, it means we are visiting the leftmost node in the inorder
			// traversal,
			// so make it the head of the DLL
			head = root;
		} else {
			// Otherwise, set the right pointer of the previous node to the current node
			prev.right = root;

			// Set the left pointer of the current node to the previous node
			root.left = prev;
		}

		// Update the previous node to the current node
		prev = root;

		// Recursively convert the right subtree
		binaryTreeToDLL(root.right);
	}

	// Helper function to print the DLL
	void printDLL(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	}

	// Driver method
	public static void main(String[] args) {
		BinaryTreeToDLL_1 tree = new BinaryTreeToDLL_1();
		tree.root = new Node(10);
		tree.root.left = new Node(12);
		tree.root.right = new Node(15);
		tree.root.left.left = new Node(25);
		tree.root.left.right = new Node(30);
		tree.root.right.left = new Node(36);

		// Convert the binary tree to DLL
		tree.binaryTreeToDLL(tree.root);

		// Print the DLL
		tree.printDLL(tree.head);
	}
}
