package in.ineuron.pptAssignment10;

public class ContiguousSubstringCounter {
	public static int countContiguousSubstrings(String s) {
		int count = 0;
		int n = s.length();

		// Iterate over all characters
		for (int i = 0; i < n; i++) {
			char startChar = s.charAt(i);
			count++;

			// Count all substrings starting from the current character
			for (int j = i + 1; j < n; j++) {
				char endChar = s.charAt(j);
				if (startChar == endChar) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String s = "abcab";
		int count = countContiguousSubstrings(s);
		System.out.println(count);
	}
}
