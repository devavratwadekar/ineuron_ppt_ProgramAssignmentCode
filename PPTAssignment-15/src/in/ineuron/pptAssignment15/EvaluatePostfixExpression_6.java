package in.ineuron.pptAssignment15;

import java.util.Stack;

public class EvaluatePostfixExpression_6 {
	public static int evaluatePostfix(String S) {
		Stack<Integer> stack = new Stack<>();
		int n = S.length();

		for (int i = 0; i < n; i++) {
			char ch = S.charAt(i);

			if (Character.isDigit(ch)) {
				stack.push(ch - '0'); // Convert char to int and push onto stack
			} else {
				int operand2 = stack.pop();
				int operand1 = stack.pop();
				int result = performOperation(operand1, operand2, ch);
				stack.push(result);
			}
		}

		return stack.pop();
	}

	public static int performOperation(int operand1, int operand2, char operator) {
		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			return operand1 / operand2;
		default:
			return 0; // Handle invalid operator
		}
	}

	public static void main(String[] args) {
		String S = "123+8-";
		int result = evaluatePostfix(S);
		System.out.println(result);
	}
}
