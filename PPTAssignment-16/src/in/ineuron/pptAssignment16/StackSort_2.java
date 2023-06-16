package in.ineuron.pptAssignment16;

import java.util.Stack;

public class StackSort_2 {
	public static Stack<Integer> sortStack(Stack<Integer> stack) {
		Stack<Integer> tempStack = new Stack<>();

		while (!stack.isEmpty()) {
			int temp = stack.pop();

			while (!tempStack.isEmpty() && tempStack.peek() > temp) {
				stack.push(tempStack.pop());
			}

			tempStack.push(temp);
		}

		return tempStack;
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(34);
		stack.push(3);
		stack.push(31);
		stack.push(98);
		stack.push(92);
		stack.push(23);

		Stack<Integer> sortedStack = sortStack(stack);

		System.out.println("Sorted Stack:");
		while (!sortedStack.isEmpty()) {
			System.out.print(sortedStack.pop() + " ");
		}
	}
}
