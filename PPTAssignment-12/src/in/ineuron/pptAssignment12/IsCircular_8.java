package in.ineuron.pptAssignment12;

class Node08 {
	int data;
	Node08 next;

	public Node08(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList {
	Node08 head;

	public void addNode(int data) {
		Node08 newNode = new Node08(data);
		if (head == null) {
			head = newNode;
		} else {
			Node08 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public boolean isCircular() {
		if (head == null) {
			// Empty list
			return false;
		}

		Node08 slowPtr = head;
		Node08 fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;

			if (slowPtr == fastPtr) {
				// Cycle detected
				return true;
			}
		}

		// No cycle found
		return false;
	}
}

public class IsCircular_8 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);

		// Create a cycle by connecting the tail to the second node
		list.head.next.next.next.next.next = list.head.next;

		if (list.isCircular()) {
			System.out.println("The linked list is circular.");
		} else {
			System.out.println("The linked list is not circular.");
		}
	}
}
