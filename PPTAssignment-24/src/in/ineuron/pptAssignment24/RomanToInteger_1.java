package in.ineuron.pptAssignment24;

import java.util.HashMap;

public class RomanToInteger_1 {
	public static int romanToInt(String s) {
		// Create a HASHMAP to store the values of Roman numerals
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		int prevValue = 0;

		// Traverse the Roman numeral string from right to left
		for (int i = s.length() - 1; i >= 0; i--) {
			char currentChar = s.charAt(i);
			int currentValue = map.get(currentChar);

			// Check if we need to subtract the current value
			if (currentValue < prevValue) {
				result -= currentValue;
			} else {
				result += currentValue;
			}

			// Update the previous value for the next iteration
			prevValue = currentValue;
		}

		return result;
	}

	public static void main(String[] args) {
		String s = "III";
		int result = romanToInt(s);
		System.out.println("Roman numeral: " + s);
		System.out.println("Integer value: " + result);
	}
}
