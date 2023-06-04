package in.ineuron.pptAssignment07;

public class StringShift {
	public static boolean canShift(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}

		String doubleS = s + s;
		return doubleS.contains(goal);
	}

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdeab";
		boolean result = canShift(s, goal);
		System.out.println("Can shift: " + result);
	}
}
