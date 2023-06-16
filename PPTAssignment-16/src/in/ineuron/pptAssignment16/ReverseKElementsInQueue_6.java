package in.ineuron.pptAssignment16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementsInQueue_6 {
	public static void reverseFirstKElements(Queue<Integer> queue, int k) {
		if (queue.isEmpty() || k <= 0 || k > queue.size()) {
			return; // Invalid input, no reversal needed
		}

		Stack<Integer> stack = new Stack<>();

		// Push the first k elements into the stack
		for (int i = 0; i < k; i++) {
			stack.push(queue.poll());
		}

		// Enqueue the elements from the stack back into the queue
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

		// Rotate the remaining elements by k positions
		for (int i = 0; i < queue.size() - k; i++) {
			queue.add(queue.poll());
		}
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);

		int k = 4;
		reverseFirstKElements(queue, k);

		System.out.println("Reversed Queue:");
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
	}
}
