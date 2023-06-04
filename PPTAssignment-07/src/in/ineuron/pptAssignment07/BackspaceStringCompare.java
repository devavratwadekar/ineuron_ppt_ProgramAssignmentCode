package in.ineuron.pptAssignment07;

public class BackspaceStringCompare {
	public static boolean backspaceCompare(String s, String t) {
		return buildString(s).equals(buildString(t));
	}

	private static String buildString(String str) {
		StringBuilder result = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (c != '#') {
				result.append(c);
			} else if (result.length() > 0) {
				result.deleteCharAt(result.length() - 1);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		boolean result = backspaceCompare(s, t);
		System.out.println("Are equal: " + result);
	}
}
