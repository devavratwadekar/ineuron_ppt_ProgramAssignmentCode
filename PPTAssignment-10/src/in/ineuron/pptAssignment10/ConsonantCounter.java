package in.ineuron.pptAssignment10;

public class ConsonantCounter {
	public static int countConsonants(String str) {
		int count = 0;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z' && !isVowel(ch)) {
				count++;
			}
		}

		return count;
	}

	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static void main(String[] args) {
		String str = "abc de";
		int count = countConsonants(str);
		System.out.println(count);
	}
}
