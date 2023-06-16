package in.ineuron.pptAssignment15;

import java.util.Stack;

public class MinStack_7 {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public MinStack_7() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		if (minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
		}
	}

	public void pop() {
		if (stack.isEmpty()) {
			return;
		}
		int popped = stack.pop();
		if (popped == minStack.peek()) {
			minStack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}

	public static void main(String[] args) {
		MinStack_7 minStack = new MinStack_7();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin()); // Output: -3
		minStack.pop();
		System.out.println(minStack.top()); // Output: 0
		System.out.println(minStack.getMin()); // Output: -2
	}
}
