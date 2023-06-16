package in.ineuron.pptAssignment15;

import java.util.Stack;

public class ReverseStringUsingStack_5 {
	public static String reverseString(String S) {
		Stack<Character> stack = new Stack<>();
		int n = S.length();

		// Push characters onto the stack
		for (int i = 0; i < n; i++) {
			stack.push(S.charAt(i));
		}

		StringBuilder reversedStr = new StringBuilder();

		// Pop characters from the stack and append to reversedStr
		while (!stack.isEmpty()) {
			reversedStr.append(stack.pop());
		}

		return reversedStr.toString();
	}

	public static void main(String[] args) {
		String S = "GeeksforGeeks";
		String reversedString = reverseString(S);
		System.out.println(reversedString);
	}
}
