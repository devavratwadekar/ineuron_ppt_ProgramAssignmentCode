package in.ineuron.pptAssignment08;

public class SwapLetters {
	public static boolean canBeEqual(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}

		int diffCount = 0;
		int[] charCount = new int[26];

		for (int i = 0; i < s.length(); i++) {
			charCount[s.charAt(i) - 'a']++;
			charCount[goal.charAt(i) - 'a']--;

			if (s.charAt(i) != goal.charAt(i)) {
				diffCount++;
			}
		}

		if (diffCount == 0 || diffCount == 2) {
			for (int count : charCount) {
				if (count != 0) {
					return false;
				}
			}
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String s = "ab";
		String goal = "ba";
		boolean result = canBeEqual(s, goal);

		System.out.println("Result: " + result);
	}
}
