package in.ineuron.pptAssignment08;

import java.util.ArrayList;
import java.util.List;

public class AnagramIndices {
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();

		int[] charCountP = new int[26];
		for (char c : p.toCharArray()) {
			charCountP[c - 'a']++;
		}

		int[] charCountWindow = new int[26];
		int windowSize = p.length();

		for (int i = 0; i < s.length(); i++) {
			charCountWindow[s.charAt(i) - 'a']++;

			if (i >= windowSize) {
				charCountWindow[s.charAt(i - windowSize) - 'a']--;
			}

			if (matches(charCountP, charCountWindow)) {
				result.add(i - windowSize + 1);
			}
		}

		return result;
	}

	private static boolean matches(int[] charCountP, int[] charCountWindow) {
		for (int i = 0; i < 26; i++) {
			if (charCountP[i] != charCountWindow[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> indices = findAnagrams(s, p);

		System.out.println("Start Indices of Anagrams:");
		System.out.println(indices);
	}
}
