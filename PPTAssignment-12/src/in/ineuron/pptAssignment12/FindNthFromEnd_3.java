package in.ineuron.pptAssignment12;

class Node03 {
	int data;
	Node03 next;

	public Node03(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList03 {
	Node03 head;

	public void addNode(int data) {
		Node03 newNode = new Node03(data);
		if (head == null) {
			head = newNode;
		} else {
			Node03 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public int findNthFromEnd(int n) {
		if (head == null) {
			// Empty list
			return -1;
		}

		Node03 slowPtr = head;
		Node03 fastPtr = head;

		// Move the fast pointer n positions ahead
		for (int i = 0; i < n; i++) {
			if (fastPtr == null) {
				// n is greater than the number of nodes
				return -1;
			}
			fastPtr = fastPtr.next;
		}

		// Move both pointers until the fast pointer reaches the end
		while (fastPtr != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}

		// The slow pointer is now at the Nth node from the end
		return slowPtr.data;
	}
}

public class FindNthFromEnd_3 {
	public static void main(String[] args) {
		LinkedList03 list = new LinkedList03();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(7);
		list.addNode(8);
		list.addNode(9);

		int n = 2;
		int result = list.findNthFromEnd(n);
		System.out.println("Nth node from the end: " + result);
	}
}
