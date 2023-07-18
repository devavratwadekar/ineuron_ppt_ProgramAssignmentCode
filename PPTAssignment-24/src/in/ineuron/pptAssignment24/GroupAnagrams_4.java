package in.ineuron.pptAssignment24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams_4 {
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();

		// Iterate through each string in the input array
		for (String str : strs) {
			// Convert the string to a character array, sort it, and convert it back to a
			// string
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = String.valueOf(charArray);

			// Check if the sorted string exists as a key in the map
			// If it does not exist, create a new key-value pair with the sorted string as
			// the key and an empty list as the value
			if (!map.containsKey(sortedStr)) {
				map.put(sortedStr, new ArrayList<>());
			}

			// Add the original string to the list corresponding to the sorted string key
			map.get(sortedStr).add(str);
		}

		// Convert the values of the map to a list and return it
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result1 = groupAnagrams(strs1);
		System.out.println("Input: " + Arrays.toString(strs1));
		System.out.println("Output: " + result1);

		String[] strs2 = { "" };
		List<List<String>> result2 = groupAnagrams(strs2);
		System.out.println("Input: " + Arrays.toString(strs2));
		System.out.println("Output: " + result2);

		String[] strs3 = { "a" };
		List<List<String>> result3 = groupAnagrams(strs3);
		System.out.println("Input: " + Arrays.toString(strs3));
		System.out.println("Output: " + result3);
	}
}
