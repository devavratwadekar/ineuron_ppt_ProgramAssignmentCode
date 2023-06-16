package in.ineuron.pptAssignment16;

import java.util.*;

public class NearestGreaterFrequency_1 {
	public static int[] findNearestGreaterFrequency(int[] arr) {
		int[] result = new int[arr.length];
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		Map<Integer, Integer> nextGreaterFrequency = new HashMap<>();
		TreeMap<Integer, Integer> sortedMap = new TreeMap<>();

		for (int i = arr.length - 1; i >= 0; i--) {
			frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
			sortedMap.put(arr[i], i);
			Integer higherKey = sortedMap.higherKey(arr[i]);

			if (higherKey != null && frequencyMap.get(higherKey) > frequencyMap.get(arr[i])) {
				nextGreaterFrequency.put(arr[i], higherKey);
			} else {
				nextGreaterFrequency.put(arr[i], -1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			result[i] = nextGreaterFrequency.get(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 2, 2, 11, 3, 3 };
		int[] result = findNearestGreaterFrequency(arr);

		System.out.println(Arrays.toString(result));
	}
}
