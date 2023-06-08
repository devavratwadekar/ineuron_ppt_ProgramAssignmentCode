package in.ineuron.pptAssignment12;

public class TraverseLinkedList_6 {

	public static void main(String[] args) {
		// Create a linked list
		Node06 head = new Node06(1);
		head.next = new Node06(2);
		head.next.next = new Node06(3);
		head.next.next.next = new Node06(4);
		head.next.next.next.next = new Node06(5);
		head.next.next.next.next.next = new Node06(6);
		head.next.next.next.next.next.next = new Node06(7);
		head.next.next.next.next.next.next.next = new Node06(8);

		// Traverse the linked list with M = 2 and N = 2
		traverseLinkedList(head, 2, 2);

		// Print the linked list
		printLinkedList(head);
	}

	private static void traverseLinkedList(Node06 head, int m, int n) {
		Node06 current = head;
		Node06 prev = null;

		while (current != null) {
			// Retain M nodes
			for (int i = 0; i < m; i++) {
				prev = current;
				current = current.next;
			}

			// Delete N nodes
			for (int i = 0; i < n; i++) {
				prev.next = current.next;
				current = current.next;
			}
		}
	}

	private static void printLinkedList(Node06 head) {
		Node06 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

class Node06 {

	int data;
	Node06 next;

	public Node06(int data) {
		this.data = data;
		this.next = null;
	}
}
