package in.ineuron.pptAssignment21;

class TreeNode03 {
	int val;
	TreeNode03 left;
	TreeNode03 right;

	TreeNode03(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

class DoublyLinkedListNode {
	int val;
	DoublyLinkedListNode prev;
	DoublyLinkedListNode next;

	DoublyLinkedListNode(int val) {
		this.val = val;
		prev = null;
		next = null;
	}
}

public class BinaryTreeToDoublyLinkedList_3 {
	// Helper function to perform INORDER traversal and convert to DLL
	private static DoublyLinkedListNode convertToDLL(TreeNode03 root) {
		if (root == null)
			return null;

		// Recursively convert left subtree
		DoublyLinkedListNode left = convertToDLL(root.left);

		// Create a new DLL node for the current root
		DoublyLinkedListNode current = new DoublyLinkedListNode(root.val);

		// If there is a left subtree, update the references
		if (left != null) {
			left.prev = current;
			current.next = left;
		}

		// Recursively convert right subtree
		DoublyLinkedListNode right = convertToDLL(root.right);

		// If there is a right subtree, update the references
		if (right != null) {
			right.prev = current;
			current.next = right;
		}

		// Return the head of the doubly linked list
		return (left != null) ? left : current;
	}

	// Utility function to print the doubly linked list
	private static void printDLL(DoublyLinkedListNode head) {
		DoublyLinkedListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Construct the binary tree
		TreeNode03 root = new TreeNode03(10);
		root.left = new TreeNode03(5);
		root.right = new TreeNode03(20);
		root.right.left = new TreeNode03(30);
		root.right.right = new TreeNode03(35);

		// Convert binary tree to doubly linked list
		DoublyLinkedListNode head = convertToDLL(root);

		// Print the doubly linked list
		System.out.print("Doubly linked list: ");
		printDLL(head);
	}
}
