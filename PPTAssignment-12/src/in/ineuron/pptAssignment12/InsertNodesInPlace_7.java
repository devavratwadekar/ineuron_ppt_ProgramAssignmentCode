package in.ineuron.pptAssignment12;

public class InsertNodesInPlace_7 {

	public static void main(String[] args) {
		// Create two linked lists
		Node head1 = new Node(5);
		head1.next = new Node(7);
		head1.next.next = new Node(17);
		head1.next.next.next = new Node(13);
		head1.next.next.next.next = new Node(11);

		Node head2 = new Node(12);
		head2.next = new Node(10);
		head2.next.next = new Node(2);
		head2.next.next.next = new Node(4);
		head2.next.next.next.next = new Node(6);

		// Insert nodes of second list into first list at alternate positions
		insertNodesInPlace(head1, head2);

		// Print the first linked list
		printLinkedList(head1);
	}

	private static void insertNodesInPlace(Node head1, Node head2) {
		Node current1 = head1;
		Node current2 = head2;

		while (current1 != null && current2 != null) {
			// Insert the node from the second list after the current node in the first list
			current1.next = current2;
			current1 = current1.next.next;
			current2 = current2.next;
		}

		// Set the next node of the last node in the first list to the last node in the
		// second list
		current1.next = current2;
	}

	private static void printLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
