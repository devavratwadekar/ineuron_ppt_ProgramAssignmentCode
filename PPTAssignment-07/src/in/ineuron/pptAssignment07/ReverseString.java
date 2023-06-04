package in.ineuron.pptAssignment07;

public class ReverseString {
	public static String reverseStr(String s, int k) {
		char[] arr = s.toCharArray();
		int n = arr.length;

		for (int i = 0; i < n; i += 2 * k) {
			int start = i;
			int end = Math.min(i + k - 1, n - 1);

			while (start < end) {
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}

		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		String reversed = reverseStr(s, k);
		System.out.println("Reversed string: " + reversed);
	}
}
