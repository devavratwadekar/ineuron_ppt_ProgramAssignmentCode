package in.ineuron.pptAssignment16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueArrangeInIncreasingOrder_4 {
	public static boolean checkIncreasingOrder(Queue<Integer> queue) {
		int n = queue.size();
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> sortedQueue = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			if (!queue.isEmpty() && queue.peek() == i) {
				sortedQueue.add(queue.poll());
			} else if (!stack.isEmpty() && stack.peek() == i) {
				sortedQueue.add(stack.pop());
				i--;
			} else {
				if (queue.isEmpty()) {
					return false;
				}
				stack.push(queue.poll());
				i--;
			}
		}

		return sortedQueue.equals(queue);
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(5);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);

		boolean canArrange = checkIncreasingOrder(queue);

		if (canArrange) {
			System.out.println("Yes, the elements can be arranged in increasing order.");
		} else {
			System.out.println("No, the elements cannot be arranged in increasing order.");
		}
	}
}
