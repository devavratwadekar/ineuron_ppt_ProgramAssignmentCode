package in.ineuron.pptAssignment13;

class Node2 {
	int data;
	Node2 next;

	Node2(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList2 {
	Node2 head;

	void add(int data) {
		Node2 newNode = new Node2(data);
		if (head == null) {
			head = newNode;
		} else {
			Node2 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	void removeDuplicates() {
		if (head == null || head.next == null) {
			return;
		}

		Node2 current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	void display() {
		Node2 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

class RemoveDuplicates_2 {
	public static void main(String[] args) {
		LinkedList2 list = new LinkedList2();
		list.add(11);
		list.add(11);
		list.add(11);
		list.add(21);
		list.add(43);
		list.add(43);
		list.add(60);

		System.out.print("Input: ");
		list.display();

		list.removeDuplicates();

		System.out.print("Output: ");
		list.display();
	}
}
