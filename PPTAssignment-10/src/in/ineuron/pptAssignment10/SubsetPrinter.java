package in.ineuron.pptAssignment10;

public class SubsetPrinter {
	public static void printSubsets(String set) {
		printSubsetsHelper(set, "", 0);
	}

	private static void printSubsetsHelper(String set, String subset, int index) {
		if (index == set.length()) {
			System.out.println(subset);
			return;
		}

		// Exclude the current character
		printSubsetsHelper(set, subset, index + 1);

		// Include the current character
		printSubsetsHelper(set, subset + set.charAt(index), index + 1);
	}

	public static void main(String[] args) {
		String set = "abc";
		printSubsets(set);
	}
}
