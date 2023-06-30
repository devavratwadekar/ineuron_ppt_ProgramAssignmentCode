package in.ineuron.pptAssignment22;

import java.util.Stack;

class Node03 {
	int data;
	Node03 left, right;

	public Node03(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTreePaths_3 {
	Node03 root;

	// Helper class to store node and its corresponding path
	class NodeWithPath {
		Node03 node;
		String path;

		public NodeWithPath(Node03 node, String path) {
			this.node = node;
			this.path = path;
		}
	}

	// Function to print all root-to-leaf paths without recursion
	void printRootToLeafPaths() {
		if (root == null)
			return;

		Stack<NodeWithPath> stack = new Stack<>();
		stack.push(new NodeWithPath(root, ""));

		while (!stack.isEmpty()) {
			NodeWithPath current = stack.pop();
			Node03 currentNode = current.node;
			String currentPath = current.path;

			if (currentNode.left == null && currentNode.right == null) {
				// Leaf node reached, print the path
				System.out.println(currentPath + currentNode.data);
			}

			if (currentNode.right != null) {
				// Push the right child with updated path
				stack.push(new NodeWithPath(currentNode.right, currentPath + currentNode.data + "->"));
			}

			if (currentNode.left != null) {
				// Push the left child with updated path
				stack.push(new NodeWithPath(currentNode.left, currentPath + currentNode.data + "->"));
			}
		}
	}

	// Driver method
	public static void main(String[] args) {
		BinaryTreePaths_3 tree = new BinaryTreePaths_3();
		tree.root = new Node03(6);
		tree.root.left = new Node03(3);
		tree.root.right = new Node03(5);
		tree.root.left.left = new Node03(2);
		tree.root.left.right = new Node03(5);
		tree.root.right.right = new Node03(4);
		tree.root.left.right.left = new Node03(7);
		tree.root.left.right.right = new Node03(4);

		// Print all root-to-leaf paths
		tree.printRootToLeafPaths();
	}
}
