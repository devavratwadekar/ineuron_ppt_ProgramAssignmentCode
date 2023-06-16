package in.ineuron.pptAssignment14;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class DetectAndRemoveLoop_1 {
	Node head;

	void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}

	void detectAndRemoveLoop() {
		if (head == null || head.next == null) {
			return;
		}

		Node slow = head;
		Node fast = head;

		// Detect the loop using Floyd's cycle detection algorithm
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		// If loop exists, find the start of the loop
		if (slow == fast) {
			slow = head;
			while (slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			// Remove the loop by setting the next of the last node to null
			fast.next = null;
		}
	}

	void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DetectAndRemoveLoop_1 list = new DetectAndRemoveLoop_1();
		list.addNode(1);
		list.addNode(8);
		list.addNode(3);
		list.addNode(4);

		// Creating a loop by connecting the last node to the node at position X
		// (1-based index)
		list.head.next.next.next = list.head.next;

		// Detect and remove the loop
		list.detectAndRemoveLoop();

		// Print the modified linked list
		list.printList();
	}
}
