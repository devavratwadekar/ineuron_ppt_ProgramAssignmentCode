package in.ineuron.pptAssignment10;

public class StringPermutations {
	public static void printPermutations(String str) {
		printPermutationsHelper(str, "");
	}

	private static void printPermutationsHelper(String str, String permutation) {
		if (str.isEmpty()) {
			System.out.println(permutation);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			String remainingChars = str.substring(0, i) + str.substring(i + 1);
			printPermutationsHelper(remainingChars, permutation + currentChar);
		}
	}

	public static void main(String[] args) {
		String str = "cd";
		printPermutations(str);
	}
}
