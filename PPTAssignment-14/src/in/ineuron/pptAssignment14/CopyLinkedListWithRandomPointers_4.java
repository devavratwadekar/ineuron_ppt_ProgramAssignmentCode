package in.ineuron.pptAssignment14;

//Java code to implement the approach

import java.util.HashMap;

class Node04 {
	int val;
	Node04 next;
	Node04 arbit;

//Constructor
	Node04(int x) {
		this.val = x;
		this.next = null;
		this.arbit = null;
	}
}

public class CopyLinkedListWithRandomPointers_4 {

	static Node04 cloneLinkedList(Node04 head) {
		// Map to store the mapping of
		// old nodes with new ones
		HashMap<Node04, Node04> mp = new HashMap<>();
		Node04 temp, nhead;

		// Duplicate of the first node
		temp = head;
		nhead = new Node04(temp.val);
		mp.put(temp, nhead);

		// Loop to create duplicates of nodes
		// with only next pointer
		while (temp.next != null) {
			nhead.next = new Node04(temp.next.val);
			temp = temp.next;
			nhead = nhead.next;
			mp.put(temp, nhead);
		}
		temp = head;

		// Loop to clone the arbit pointers
		while (temp != null) {
			mp.get(temp).arbit = mp.get(temp.arbit);
			temp = temp.next;
		}

		// Return the head of the clone
		return mp.get(head);
	}

	static void printList(Node04 head) {
		System.out.print(head.val + "(" + head.arbit.val + ")");
		head = head.next;
		while (head != null) {
			System.out.print(" -> " + head.val + "(" + head.arbit.val + ")");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Creating a linked list with random pointer
		Node04 head = new Node04(1);
		head.next = new Node04(2);
		head.next.next = new Node04(3);
		head.next.next.next = new Node04(4);
		head.next.next.next.next = new Node04(5);
		head.arbit = head.next.next;
		head.next.arbit = head;
		head.next.next.arbit = head.next.next.next.next;
		head.next.next.next.arbit = head.next.next;
		head.next.next.next.next.arbit = head.next;

		// Print the original list
		System.out.println("The original linked list:");
		printList(head);

		// Function call
		Node04 sol = cloneLinkedList(head);

		System.out.println("The cloned linked list:");
		printList(sol);
	}
}

//https://www.geeksforgeeks.org/a-linked-list-with-next-and-arbit-pointer/
