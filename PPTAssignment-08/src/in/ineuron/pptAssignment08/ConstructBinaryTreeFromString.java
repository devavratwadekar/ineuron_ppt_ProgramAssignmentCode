package in.ineuron.pptAssignment08;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class ConstructBinaryTreeFromString {
	
	public static void main(String[] args) {
		String s = "4(2(3)(1))(6(5))";
		TreeNode node = new TreeNode(0);
	}

	public static TreeNode str2tree(String s) {
		if (s.isEmpty()) {
			return null;
		}

		int firstParen = s.indexOf("(");

		// Create the root node
		int val = (firstParen == -1) ? Integer.parseInt(s) : Integer.parseInt(s.substring(0, firstParen));
		TreeNode root = new TreeNode(val);

		if (firstParen == -1) {
			return root;
		}

		int start = firstParen;
		int openParenCount = 0;

		// Find the substring for the left child
		for (int i = start; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				openParenCount++;
			} else if (s.charAt(i) == ')') {
				openParenCount--;
			}

			if (openParenCount == 0 && start == firstParen) {
				root.left = str2tree(s.substring(start + 1, i));
				start = i + 1;
			} else if (openParenCount == 0) {
				root.right = str2tree(s.substring(start + 1, i));
			}
		}
		return root;
	}
}
