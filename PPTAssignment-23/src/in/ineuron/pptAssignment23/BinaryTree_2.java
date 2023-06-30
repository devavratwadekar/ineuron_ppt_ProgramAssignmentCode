package in.ineuron.pptAssignment23;

import java.util.*;

//Binary Tree node
class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree_2 {
	Node root;
	static int maxLevel = 0;

	// Recursive function to print the left view of a binary tree
	void leftViewUtil(Node node, int level) {
		if (node == null)
			return;

		// If this is the first node of its level
		if (maxLevel < level) {
			System.out.print(node.data + " ");
			maxLevel = level;
		}

		// Recur for the left and right subtrees
		leftViewUtil(node.left, level + 1);
		leftViewUtil(node.right, level + 1);
	}

	// Main function to print the left view of a binary tree
	void leftView() {
		leftViewUtil(root, 1);
	}

	// Driver code
	public static void main(String args[]) {
		/*
		 * Constructed binary tree is: 4 / \ 5 2 / \ 3 1 / \ 6 7
		 */
		BinaryTree_2 tree = new BinaryTree_2();
		tree.root = new Node(4);
		tree.root.left = new Node(5);
		tree.root.right = new Node(2);
		tree.root.right.left = new Node(3);
		tree.root.right.right = new Node(1);
		tree.root.right.left.left = new Node(6);
		tree.root.right.left.right = new Node(7);

		System.out.println("Left view of the binary tree:");
		tree.leftView();
	}
}
