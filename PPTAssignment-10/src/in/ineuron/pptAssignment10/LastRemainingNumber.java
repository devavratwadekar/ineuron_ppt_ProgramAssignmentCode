package in.ineuron.pptAssignment10;

import java.util.ArrayList;
import java.util.List;

public class LastRemainingNumber {
	public static int lastRemaining(int n) {
		List<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			arr.add(i);
		}

		boolean leftToRight = true;
		while (arr.size() > 1) {
			if (leftToRight) {
				for (int i = 0; i < arr.size(); i += 2) {
					arr.remove(i);
				}
			} else {
				for (int i = arr.size() - 1; i >= 0; i -= 2) {
					arr.remove(i);
				}
			}
			leftToRight = !leftToRight;
		}

		return arr.get(0);
	}

	public static void main(String[] args) {
		int n = 9;
		int lastNumber = lastRemaining(n);
		System.out.println(lastNumber);
	}
}
