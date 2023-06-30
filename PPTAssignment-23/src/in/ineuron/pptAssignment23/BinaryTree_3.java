package in.ineuron.pptAssignment23;

import java.util.*;

//Binary Tree node
class Node03 {
	int data;
	Node03 left, right;

	public Node03(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree_3 {
	Node03 root;
	static int maxLevel = 0;

	// Recursive function to print the right view of a binary tree
	void rightViewUtil(Node03 node, int level) {
		if (node == null)
			return;

		// If this is the first node of its level
		if (maxLevel < level) {
			System.out.print(node.data + " ");
			maxLevel = level;
		}

		// Recur for the right and left subtrees
		rightViewUtil(node.right, level + 1);
		rightViewUtil(node.left, level + 1);
	}

	// Main function to print the right view of a binary tree
	void rightView() {
		rightViewUtil(root, 1);
	}

	// Driver code
	public static void main(String args[]) {
		/*
		 * Constructed binary tree is: 1 / \ 2 3 / \ / \ 4 5 6 7 \ 8
		 */
		BinaryTree_3 tree = new BinaryTree_3();
		tree.root = new Node03(1);
		tree.root.left = new Node03(2);
		tree.root.right = new Node03(3);
		tree.root.left.left = new Node03(4);
		tree.root.left.right = new Node03(5);
		tree.root.right.left = new Node03(6);
		tree.root.right.right = new Node03(7);
		tree.root.right.right.right = new Node03(8);

		System.out.println("Right view of the binary tree:");
		tree.rightView();
	}
}
