package in.ineuron.pptAssignment15;

import java.util.Stack;

public class ReverseStackUsingRecursion_4 {
	public static void reverseStack(Stack<Integer> St) {
		if (St.isEmpty() || St.size() == 1) {
			return;
		}

		int topElement = St.pop();
		reverseStack(St);
		insertAtBottom(St, topElement);
	}

	public static void insertAtBottom(Stack<Integer> St, int element) {
		if (St.isEmpty()) {
			St.push(element);
			return;
		}

		int top = St.pop();
		insertAtBottom(St, element);
		St.push(top);
	}

	public static void main(String[] args) {
		Stack<Integer> St = new Stack<>();
		St.push(3);
		St.push(2);
		St.push(1);
		St.push(7);
		St.push(6);

		System.out.println("Original Stack: " + St);

		reverseStack(St);

		System.out.println("Reversed Stack: " + St);
	}
}
