package in.ineuron.pptAssignment13;

class Node7 {
	int data;
	Node7 prev;
	Node7 next;

	Node7(int data) {
		this.data = data;
		prev = null;
		next = null;
	}
}

class DoublyLinkedList7 {
	Node7 head;

	void add(int data) {
		Node7 newNode = new Node7(data);
		if (head == null) {
			head = newNode;
		} else {
			Node7 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}

	void reverse() {
		Node7 current = head;
		Node7 temp = null;

		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}

		if (temp != null) {
			head = temp.prev;
		}
	}

	void display() {
		Node7 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class ReverseLinkedList_7 {
	public static void main(String[] args) {
		DoublyLinkedList7 list = new DoublyLinkedList7();
		list.add(10);
		list.add(8);
		list.add(4);
		list.add(2);

		System.out.print("Original Linked List: ");
		list.display();

		list.reverse();

		System.out.print("Reversed Linked List: ");
		list.display();
	}
}
