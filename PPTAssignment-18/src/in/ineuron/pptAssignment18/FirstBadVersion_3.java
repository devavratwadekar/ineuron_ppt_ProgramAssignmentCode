package in.ineuron.pptAssignment18;

public class FirstBadVersion_3 {
	private static boolean isBadVersion(int version) {
		// API function that checks if the version is bad
		// Replace this with the actual API function provided
		return version >= 4;
	}

	public static int firstBadVersion(int n) {
		int left = 1;
		int right = n;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (isBadVersion(mid)) {
				right = mid; // The bad version is in the left half or is the current mid
			} else {
				left = mid + 1; // The bad version is in the right half
			}
		}

		return left; // The left pointer points to the first bad version
	}

	public static void main(String[] args) {
		int n = 5;
		int firstBad = firstBadVersion(n);
		System.out.println("The first bad version is: " + firstBad);
	}
}
