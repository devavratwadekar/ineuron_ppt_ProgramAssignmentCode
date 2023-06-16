package in.ineuron.pptAssignment14;

import java.util.*;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

class Solution {
	public int[] nextLargerNodes(ListNode head) {
		List<Integer> values = new ArrayList<>();
		ListNode curr = head;

		// Extract the values from the linked list
		while (curr != null) {
			values.add(curr.val);
			curr = curr.next;
		}

		int[] result = new int[values.size()];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < values.size(); i++) {
			int currValue = values.get(i);

			// Process nodes with larger values
			while (!stack.isEmpty() && currValue > values.get(stack.peek())) {
				int index = stack.pop();
				result[index] = currValue;
			}

			stack.push(i);
		}

		return result;
	}
}

public class NextLargerNodes_7 {
	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		head.next = new ListNode(1);
		head.next.next = new ListNode(5);

		Solution solution = new Solution();
		int[] result = solution.nextLargerNodes(head);

		// Print the result
		for (int val : result) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
