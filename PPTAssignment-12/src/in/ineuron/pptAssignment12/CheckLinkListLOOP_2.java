package in.ineuron.pptAssignment12;

class Node02 {
	int data;
	Node02 next;

	public Node02(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList02 {
	Node02 head;

	public void addNode(int data) {
		Node02 newNode = new Node02(data);
		if (head == null) {
			head = newNode;
		} else {
			Node02 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public boolean detectLoop() {
		if (head == null || head.next == null) {
			// Empty list or single node, no loop
			return false;
		}

		Node02 slowPtr = head;
		Node02 fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;

			if (slowPtr == fastPtr) {
				// Loop detected
				return true;
			}
		}

		// No loop found
		return false;
	}
}

public class CheckLinkListLOOP_2 {
	public static void main(String[] args) {
		LinkedList02 list = new LinkedList02();
		list.addNode(1);
		list.addNode(3);
		list.addNode(4);

		// Creating a loop by connecting the tail to the second node
		list.head.next.next.next = list.head.next;

		boolean hasLoop = list.detectLoop();
		System.out.println("Does the linked list have a loop? :: " + hasLoop);
	}
}
