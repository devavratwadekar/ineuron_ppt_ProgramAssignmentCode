package in.ineuron.pptAssignment21;

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

public class DistanceBetweenNodesInBST_2 {

	// Find the Lowest Common Ancestor (LCA) of the two nodes
	private static TreeNode02 findLCA(TreeNode02 root, int node1, int node2) {
		if (root == null)
			return null;

		if (root.val > node1 && root.val > node2)
			return findLCA(root.left, node1, node2);
		else if (root.val < node1 && root.val < node2)
			return findLCA(root.right, node1, node2);

		return root;
	}

	// Calculate the distance from the LCA to the given node
	private static int calculateDistance(TreeNode02 root, int node) {
		if (root.val == node)
			return 0;

		if (root.val > node)
			return 1 + calculateDistance(root.left, node);
		else
			return 1 + calculateDistance(root.right, node);
	}

	// Find the distance between two nodes in BST
	public static int findDistance(TreeNode02 root, int node1, int node2) {
		// Find the Lowest Common Ancestor (LCA)
		TreeNode02 lca = findLCA(root, node1, node2);

		// Calculate the distance from LCA to each node
		int dist1 = calculateDistance(lca, node1);
		int dist2 = calculateDistance(lca, node2);

		// Return the total distance
		return dist1 + dist2;
	}

	public static void main(String[] args) {
		// Construct the BST
		TreeNode02 root = new TreeNode02(8);
		root.left = new TreeNode02(3);
		root.right = new TreeNode02(10);
		root.left.left = new TreeNode02(1);
		root.left.right = new TreeNode02(6);
		root.left.right.left = new TreeNode02(4);
		root.left.right.right = new TreeNode02(7);
		root.right.right = new TreeNode02(14);
		root.right.right.left = new TreeNode02(13);

		// Define the nodes for which to find the distance
		int node1 = 6;
		int node2 = 14;

		// Find the distance between the nodes
		int distance = findDistance(root, node1, node2);

		// Print the distance
		System.out.println("Distance between " + node1 + " and " + node2 + " is: " + distance);
	}
}
