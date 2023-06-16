package in.ineuron.pptAssignment16;

import java.util.*;

public class PairwiseDestruction_7 {
	public static int countWordsLeft(String[] words) {
		Stack<String> stack = new Stack<>();

		for (String word : words) {
			if (!stack.isEmpty() && stack.peek().equals(word)) {
				stack.pop();
			} else {
				stack.push(word);
			}
		}

		return stack.size();
	}

	public static void main(String[] args) {
		String[] words = { "ab", "aa", "aa", "bcd", "ab" };
		int wordsLeft = countWordsLeft(words);

		System.out.println("Number of Words Left: " + wordsLeft);
	}
}
