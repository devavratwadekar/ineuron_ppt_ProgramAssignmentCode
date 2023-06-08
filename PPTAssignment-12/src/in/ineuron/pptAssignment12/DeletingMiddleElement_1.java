package in.ineuron.pptAssignment12;

class Node01 {
	int data;
	Node01 next;

	public Node01(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList01 {
	Node01 head;

	public void deleteMiddle() {
		if (head == null || head.next == null) {
			// Empty list or single node, nothing to delete
			return;
		}

		Node01 slowPtr = head;
		Node01 fastPtr = head;
		Node01 prevPtr = null;

		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			prevPtr = slowPtr;
			slowPtr = slowPtr.next;
		}

		// Delete the middle node(s)
		prevPtr.next = slowPtr.next;
		slowPtr.next = null;
	}

	public void display() {
		Node01 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class DeletingMiddleElement_1 {
	public static void main(String[] args) {
		LinkedList01 list = new LinkedList01();
		list.head = new Node01(1);
		list.head.next = new Node01(2);
		list.head.next.next = new Node01(3);
		list.head.next.next.next = new Node01(4);
		list.head.next.next.next.next = new Node01(5);

		System.out.print("Original Linked List: ");
		list.display();

		list.deleteMiddle();

		System.out.print("Modified Linked List: ");
		list.display();
	}
}
