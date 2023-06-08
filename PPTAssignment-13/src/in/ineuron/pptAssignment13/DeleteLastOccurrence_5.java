package in.ineuron.pptAssignment13;

class Node5 {
	int data;
	Node5 next;

	Node5(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList5 {
	Node5 head;

	void add(int data) {
		Node5 newNode = new Node5(data);
		if (head == null) {
			head = newNode;
		} else {
			Node5 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	void deleteLastOccurrence(int key) {
		if (head == null) {
			return;
		}

		Node5 lastOccurrence = null;
		Node5 current = head;
		Node5 prev = null;
		Node5 lastPrev = null;

		while (current != null) {
			if (current.data == key) {
				lastOccurrence = current;
				lastPrev = prev;
			}
			prev = current;
			current = current.next;
		}

		if (lastOccurrence != null) {
			if (lastPrev != null) {
				lastPrev.next = lastOccurrence.next;
			} else {
				head = lastOccurrence.next;
			}
		}
	}

	void display() {
		Node5 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class DeleteLastOccurrence_5 {
	public static void main(String[] args) {
		LinkedList5 list = new LinkedList5();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(10);

		int key = 2;

		System.out.print("Input: ");
		list.display();

		list.deleteLastOccurrence(key);

		System.out.print("Output: ");
		list.display();
	}
}
