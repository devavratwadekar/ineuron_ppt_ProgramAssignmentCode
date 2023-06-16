package in.ineuron.pptAssignment14;

//Java program to rotate a linked list

class Node06 {
	int data;
	Node06 next;

	Node06(int data) {
		this.data = data;
		next = null;
	}
}

public class RotateLinkedList_6 {
	Node06 head;

	void addNode(int data) {
		Node06 newNode = new Node06(data);
		if (head == null) {
			head = newNode;
		} else {
			Node06 curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}

	void leftShift(int k) {
		if (head == null || k <= 0) {
			return;
		}

		int length = getLength();
		k = k % length; // Adjust k if it is greater than the length of the linked list

		if (k == 0) {
			return; // No need to shift
		}

		Node06 curr = head;
		Node06 newHead = null;
		Node06 tail = null;

		// Traverse to the kth node from the beginning
		for (int i = 1; i < k && curr != null; i++) {
			curr = curr.next;
		}

		if (curr == null) {
			return; // Invalid k value
		}

		newHead = curr.next;
		curr.next = null;
		tail = newHead;

		// Traverse to the last node
		while (tail.next != null) {
			tail = tail.next;
		}

		// Connect the last node to the original head
		tail.next = head;
		head = newHead;
	}

	int getLength() {
		int length = 0;
		Node06 curr = head;
		while (curr != null) {
			length++;
			curr = curr.next;
		}
		return length;
	}

	void printList() {
		Node06 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RotateLinkedList_6 list = new RotateLinkedList_6();
		list.addNode(2);
		list.addNode(4);
		list.addNode(7);
		list.addNode(8);
		list.addNode(9);

		int k = 3;

		// Left-shift the linked list by k nodes
		list.leftShift(k);

		// Print the modified linked list
		list.printList();
	}
}
