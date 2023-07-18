package in.ineuron.pptAssignment24;

import java.util.HashSet;

public class LongestSubstring_2 {
	public static int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		int left = 0;
		int right = 0;
		HashSet<Character> set = new HashSet<>();

		// Sliding window approach
		while (right < s.length()) {
			char currentChar = s.charAt(right);

			// If the current character is not in the set, add it to the set and expand the
			// window
			if (!set.contains(currentChar)) {
				set.add(currentChar);
				maxLength = Math.max(maxLength, set.size());
				right++;
			} else {
				// If the current character is already in the set, remove the leftmost character
				// from the set
				char leftChar = s.charAt(left);
				set.remove(leftChar);
				left++;
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String s1 = "abcabcbb";
		int result1 = lengthOfLongestSubstring(s1);
		System.out.println("Input: " + s1);
		System.out.println("Output: " + result1);

		String s2 = "bbbbb";
		int result2 = lengthOfLongestSubstring(s2);
		System.out.println("Input: " + s2);
		System.out.println("Output: " + result2);

		String s3 = "pwwkew";
		int result3 = lengthOfLongestSubstring(s3);
		System.out.println("Input: " + s3);
		System.out.println("Output: " + result3);
	}
}
