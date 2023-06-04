package in.ineuron.pptAssignment08;

import java.util.Stack;

public class DecodeString {
	public static String decodeString(String s) {
		Stack<Integer> countStack = new Stack<>();
		Stack<String> stringStack = new Stack<>();

		String currentString = "";
		int currentCount = 0;

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				currentCount = currentCount * 10 + (c - '0');
			} else if (c == '[') {
				countStack.push(currentCount);
				stringStack.push(currentString);
				currentCount = 0;
				currentString = "";
			} else if (c == ']') {
				StringBuilder sb = new StringBuilder(stringStack.pop());
				int count = countStack.pop();
				for (int i = 0; i < count; i++) {
					sb.append(currentString);
				}
				currentString = sb.toString();
			} else {
				currentString += c;
			}
		}

		return currentString;
	}

	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		String decodedString = decodeString(s);

		System.out.println("Decoded String: " + decodedString);
	}
}
