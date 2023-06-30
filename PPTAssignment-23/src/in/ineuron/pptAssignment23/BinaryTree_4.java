package in.ineuron.pptAssignment23;

import java.util.*;

//Binary Tree node
class Node04 {
	int data;
	int hd; // horizontal distance
	Node04 left, right;

	public Node04(int item) {
		data = item;
		hd = Integer.MAX_VALUE;
		left = right = null;
	}
}

public class BinaryTree_4 {
	Node04 root;

	// Recursive function to calculate the horizontal distance of nodes
	// and print the bottom view of the binary tree
	void bottomViewUtil(Node04 node, int hd, int level, TreeMap<Integer, Pair> map) {
		if (node == null)
			return;

		// If the current node is the BOTTOMMOST node at its horizontal distance,
		// update the map with the current node's data and level
		if (!map.containsKey(hd) || level >= map.get(hd).level) {
			map.put(hd, new Pair(node.data, level));
		}

		// Recur for the left and right subtrees with updated horizontal distance and
		// level
		bottomViewUtil(node.left, hd - 1, level + 1, map);
		bottomViewUtil(node.right, hd + 1, level + 1, map);
	}

	// Function to print the bottom view of the binary tree
	void bottomView() {
		if (root == null)
			return;

		// Map to store the horizontal distance and corresponding node data
		TreeMap<Integer, Pair> map = new TreeMap<>();

		// Calculate the horizontal distance and level of each node
		// and update the map with the BOTTOMMOST node at each horizontal distance
		bottomViewUtil(root, 0, 0, map);

		// Print the bottom view nodes from left to right
		for (Map.Entry<Integer, Pair> entry : map.entrySet()) {
			System.out.print(entry.getValue().data + " ");
		}
	}

	// Pair class to store the node data and level
	class Pair {
		int data;
		int level;

		public Pair(int data, int level) {
			this.data = data;
			this.level = level;
		}
	}

	// Driver code
	public static void main(String args[]) {
		/*
		 * Constructed binary tree is: 20 / \ 8 22 / \ \ 5 3 25 / \ 10 14
		 */
		BinaryTree_4 tree = new BinaryTree_4();
		tree.root = new Node04(20);
		tree.root.left = new Node04(8);
		tree.root.right = new Node04(22);
		tree.root.left.left = new Node04(5);
		tree.root.left.right = new Node04(3);
		tree.root.right.right = new Node04(25);
		tree.root.left.right.left = new Node04(10);
		tree.root.left.right.right = new Node04(14);

		System.out.println("Bottom view of the binary tree:");
		tree.bottomView();
	}
}
