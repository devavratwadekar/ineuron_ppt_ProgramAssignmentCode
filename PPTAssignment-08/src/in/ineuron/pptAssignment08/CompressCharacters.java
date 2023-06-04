package in.ineuron.pptAssignment08;

public class CompressCharacters {
	public static int compress(char[] chars) {
		if (chars.length == 0) {
			return 0;
		}

		int index = 0;
		int count = 1;

		for (int i = 1; i <= chars.length; i++) {
			if (i < chars.length && chars[i] == chars[i - 1]) {
				count++;
			} else {
				chars[index++] = chars[i - 1];
				if (count > 1) {
					String countStr = String.valueOf(count);
					for (char c : countStr.toCharArray()) {
						chars[index++] = c;
					}
				}
				count = 1;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
		int newLength = compress(chars);

		System.out.println("New Length: " + newLength);
		System.out.print("Compressed Array: ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(chars[i] + " ");
		}
	}
}
