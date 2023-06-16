package in.ineuron.pptAssignment15;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues_3 {
	private Queue<Integer> q1;
	private Queue<Integer> q2;

	public StackUsingQueues_3() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}

	public void push(int x) {
		q1.add(x);
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return -1; // or throw an exception
		}

		while (q1.size() > 1) {
			q2.add(q1.remove());
		}

		int popped = q1.remove();

		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;

		return popped;
	}

	public int top() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return -1; // or throw an exception
		}

		while (q1.size() > 1) {
			q2.add(q1.remove());
		}

		int top = q1.peek();
		q2.add(q1.remove());

		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;

		return top;
	}

	public boolean isEmpty() {
		return q1.isEmpty() && q2.isEmpty();
	}

	public static void main(String[] args) {
		StackUsingQueues_3 stack = new StackUsingQueues_3();
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop()); // Output: 3
		stack.push(4);
		System.out.println(stack.pop()); // Output: 4
	}
}
