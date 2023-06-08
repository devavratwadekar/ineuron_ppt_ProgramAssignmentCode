package in.ineuron.pptAssignment13;

class Node8 {
	int data;
	Node8 prev;
	Node8 next;

	Node8(int data) {
		this.data = data;
		prev = null;
		next = null;
	}
}

class DoublyLinkedList {
	Node8 head;

	void add(int data) {
		Node8 newNode = new Node8(data);
		if (head == null) {
			head = newNode;
		} else {
			Node8 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}

	void deleteNode(int position) {
		if (head == null) {
			return;
		}

		Node8 current = head;
		int count = 1;

		// Traverse to the node to be deleted
		while (current != null && count < position) {
			current = current.next;
			count++;
		}

		// If position exceeds the number of nodes
		if (current == null) {
			return;
		}

		// If the node to be deleted is the head node
		if (current == head) {
			head = head.next;
			if (head != null) {
				head.prev = null;
			}
			return;
		}

		// Update the prev and next pointers of adjacent nodes
		if (current.prev != null) {
			current.prev.next = current.next;
		}
		if (current.next != null) {
			current.next.prev = current.prev;
		}
	}

	void display() {
		Node8 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class DeleteNode_8 {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(1);
		list.add(3);
		list.add(4);

		System.out.print("Input: ");
		list.display();

		int position = 3;
		list.deleteNode(position);

		System.out.print("Output: ");
		list.display();
	}
}
