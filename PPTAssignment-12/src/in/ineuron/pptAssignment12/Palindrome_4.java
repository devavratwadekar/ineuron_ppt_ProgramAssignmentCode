package in.ineuron.pptAssignment12;

class Node04 {
	char data;
	Node04 next;

	public Node04(char data) {
		this.data = data;
		next = null;
	}
}

class LinkedList04 {
	Node04 head;

	public void addNode(char data) {
		Node04 newNode = new Node04(data);
		if (head == null) {
			head = newNode;
		} else {
			Node04 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public boolean isPalindrome() {
		if (head == null) {
			// Empty list
			return true;
		}

		Node04 slowPtr = head;
		Node04 fastPtr = head;

		// Find the middle node of the linked list
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		// Reverse the second half of the linked list
		Node04 reversedHead = reverse(slowPtr);

		// Compare the reversed second half with the first half
		Node04 firstHalf = head;
		Node04 secondHalf = reversedHead;

		while (secondHalf != null) {
			if (firstHalf.data != secondHalf.data) {
				// Not a PALINDROME
				return false;
			}
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}

		// PALINDROME
		return true;
	}

	private Node04 reverse(Node04 node) {
		Node04 prev = null;
		Node04 current = node;
		Node04 next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}
}

public class Palindrome_4 {
	public static void main(String[] args) {
		LinkedList04 list = new LinkedList04();
		list.addNode('R');
		list.addNode('A');
		list.addNode('D');
		list.addNode('A');
		list.addNode('R');

		boolean isPalindrome = list.isPalindrome();
		System.out.println("Is the linked list a palindrome? :: " + isPalindrome);
	}
}
