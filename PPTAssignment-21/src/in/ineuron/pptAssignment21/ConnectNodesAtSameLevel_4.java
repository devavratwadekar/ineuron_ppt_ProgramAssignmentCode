package in.ineuron.pptAssignment21;

class TreeNode04 {
	int val;
	TreeNode04 left;
	TreeNode04 right;
	TreeNode04 next; // This will be used to establish the connection

	TreeNode04(int val) {
		this.val = val;
		left = null;
		right = null;
		next = null;
	}
}

public class ConnectNodesAtSameLevel_4 {

	// Perform a level-order traversal and connect nodes at the same level
	public static void connectNodes(TreeNode04 root) {
		if (root == null)
			return;

		// Start with the root node
		TreeNode04 levelStart = root;

		while (levelStart != null) {
			TreeNode04 current = levelStart;
			TreeNode04 prev = null;
			levelStart = null; // Reset levelStart for the next level

			// Traverse the current level and establish the next pointers
			while (current != null) {
				if (current.left != null) {
					if (prev != null) {
						prev.next = current.left;
					} else {
						levelStart = current.left;
					}
					prev = current.left;
				}

				if (current.right != null) {
					if (prev != null) {
						prev.next = current.right;
					} else {
						levelStart = current.right;
					}
					prev = current.right;
				}

				current = current.next;
			}
		}
	}

	// Utility function to print the connected nodes
	private static void printConnectedNodes(TreeNode04 root) {
		TreeNode04 current = root;
		while (current != null) {
			System.out.print(current.val + " → ");
			current = current.next;
		}
		System.out.println("-1");
	}

	public static void main(String[] args) {
		// Construct the binary tree
		TreeNode04 root = new TreeNode04(1);
		root.left = new TreeNode04(2);
		root.right = new TreeNode04(3);
		root.left.left = new TreeNode04(4);
		root.left.right = new TreeNode04(5);
		root.right.left = new TreeNode04(6);
		root.right.right = new TreeNode04(7);

		// Connect nodes at the same level
		connectNodes(root);

		// Print the connections
		System.out.println("Output:");
		System.out.print("1 → ");
		printConnectedNodes(root.left);
		System.out.print("2 → ");
		printConnectedNodes(root.right.left);
		System.out.print("3 → ");
		printConnectedNodes(null); // No nodes to the right of 3
		System.out.print("4 → ");
		printConnectedNodes(root.left.right);
		System.out.print("5 → ");
		printConnectedNodes(root.right.left.right);
		System.out.print("6 → ");
		printConnectedNodes(root.right.right);
		System.out.print("7 → ");
		printConnectedNodes(null); // No nodes to the right of 7
	}
}
