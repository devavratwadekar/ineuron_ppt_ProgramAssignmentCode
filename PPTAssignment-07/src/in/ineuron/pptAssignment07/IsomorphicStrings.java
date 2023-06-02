package in.ineuron.pptAssignment07;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] sCharMap = new int[256];
		int[] tCharMap = new int[256];

		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);

			if (sCharMap[sChar] != tCharMap[tChar]) {
				return false;
			}

			sCharMap[sChar] = i + 1;
			tCharMap[tChar] = i + 1;
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		boolean isIsomorphic = isIsomorphic(s, t);
		System.out.println(isIsomorphic); // Output: true
	}
}
