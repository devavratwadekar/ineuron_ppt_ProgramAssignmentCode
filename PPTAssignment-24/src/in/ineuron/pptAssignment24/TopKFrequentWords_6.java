package in.ineuron.pptAssignment24;

import java.util.*;

public class TopKFrequentWords_6 {
	public static List<String> topKFrequent(String[] words, int k) {
		// Count the frequency of each word using a hashmap
		HashMap<String, Integer> frequencyMap = new HashMap<>();
		for (String word : words) {
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
		}

		// Create a priority queue to store the words based on frequency and
		// lexicographical order
		PriorityQueue<String> pq = new PriorityQueue<>(new WordComparator(frequencyMap));

		// Iterate through the hashmap and add the words to the priority queue
		for (String word : frequencyMap.keySet()) {
			pq.offer(word);
			if (pq.size() > k) {
				pq.poll(); // Remove the word with the lowest frequency from the queue
			}
		}

		// Create a list to store the k most frequent words in the correct order
		List<String> result = new ArrayList<>();
		while (!pq.isEmpty()) {
			result.add(pq.poll());
		}

		// Reverse the list to get the words in descending frequency order
		Collections.reverse(result);

		return result;
	}

	// Custom comparator to compare words based on frequency and lexicographical
	// order
	static class WordComparator implements Comparator<String> {
		private final HashMap<String, Integer> frequencyMap;

		public WordComparator(HashMap<String, Integer> frequencyMap) {
			this.frequencyMap = frequencyMap;
		}

		@Override
		public int compare(String word1, String word2) {
			int freq1 = frequencyMap.get(word1);
			int freq2 = frequencyMap.get(word2);

			if (freq1 == freq2) {
				return word1.compareTo(word2); // Lexicographical order
			} else {
				return freq1 - freq2; // Descending frequency order
			}
		}
	}

	public static void main(String[] args) {
		String[] words1 = { "i", "love", "leetcode", "i", "love", "coding" };
		int k1 = 2;
		List<String> result1 = topKFrequent(words1, k1);
		System.out.println("Input: " + Arrays.toString(words1) + ", k = " + k1);
		System.out.println("Output: " + result1);

		String[] words2 = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
		int k2 = 4;
		List<String> result2 = topKFrequent(words2, k2);
		System.out.println("Input: " + Arrays.toString(words2) + ", k = " + k2);
		System.out.println("Output: " + result2);
	}
}
