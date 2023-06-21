package in.ineuron.pptAssignment17;

public class FirstNonRepeatingCharacter_1 {

	public static int firstUniqChar(String s) {
		int[] charCounts = new int[26];
		// Assuming only LOWERCASE English letters

		for (char c : s.toCharArray()) {
			charCounts[c - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (charCounts[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "loveleetcode"; // eg:leetcode,aabb.
		int index = firstUniqChar(s);
		System.out.println("Index of the first non-repeating character: " + index);
	}
}
