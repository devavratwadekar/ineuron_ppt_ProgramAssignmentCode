package in.ineuron.pptAssignment16;

import java.util.Stack;

public class DeleteMiddleElement_3 {
	public static void deleteMiddle(Stack<Integer> stack, int k) {
		// Base case: if the stack is empty or k becomes 0, return
		if (stack.isEmpty() || k == 0) {
			stack.pop();
			return;
		}

		// Pop the top element
		int temp = stack.pop();

		// Recursive call to delete the middle element
		deleteMiddle(stack, k - 1);

		// Push the popped element back if it's not the middle element
		if (k != stack.size() / 2 + 1) {
			stack.push(temp);
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(5);

		int middleIndex = stack.size() / 2 + 1;
		deleteMiddle(stack, middleIndex);

		System.out.println("Modified Stack:");
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
