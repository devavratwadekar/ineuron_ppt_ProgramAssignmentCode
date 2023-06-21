package in.ineuron.pptAssignment17;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class CardRevealOrder_6 {
	public static int[] deckRevealedIncreasing(int[] deck) {
		int n = deck.length;
		Arrays.sort(deck); // Sort the deck in increasing order
		Deque<Integer> indices = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			indices.offer(i); // Add indices to a deque
		}

		int[] result = new int[n];
		for (int card : deck) {
			result[indices.poll()] = card; // Reveal the cards at the deque indices
			if (!indices.isEmpty()) {
				indices.offer(indices.poll()); // Move the next top index to the bottom
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] deck = { 17, 13, 11, 2, 3, 5, 7 };
		int[] order = deckRevealedIncreasing(deck);
		System.out.println("Revealed Card Order: " + Arrays.toString(order));
	}
}
