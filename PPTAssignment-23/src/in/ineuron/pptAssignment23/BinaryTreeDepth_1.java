package in.ineuron.pptAssignment23;

public class BinaryTreeDepth_1 {

	private static int findDepth(String preorder) {
		int depth = 0;
		int n = preorder.length();

		for (int i = 0; i < n; i++) {
			if (preorder.charAt(i) == 'n') {
				depth++;
			}
		}

		return depth;
	}

	public static void main(String[] args) {
		String preorder = "nlnll";
		int depth = findDepth(preorder);

		System.out.println("Depth of the binary tree: " + depth);
	}
}
