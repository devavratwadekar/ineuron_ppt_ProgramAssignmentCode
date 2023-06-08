package in.ineuron.pptAssignment13;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList {
	Node head;

	void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	static LinkedList createNewList(LinkedList list1, LinkedList list2) {
		LinkedList newList = new LinkedList();
		Node current1 = list1.head;
		Node current2 = list2.head;

		while (current1 != null && current2 != null) {
			int data1 = current1.data;
			int data2 = current2.data;

			if (data1 >= data2) {
				newList.add(data1);
			} else {
				newList.add(data2);
			}

			current1 = current1.next;
			current2 = current2.next;
		}

		return newList;
	}

	void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

class CreateNewList_1 {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(5);
		list1.add(2);
		list1.add(3);
		list1.add(8);

		LinkedList list2 = new LinkedList();
		list2.add(1);
		list2.add(7);
		list2.add(4);
		list2.add(5);

		LinkedList newList = LinkedList.createNewList(list1, list2);

		System.out.print("New list = ");
		newList.display();
	}
}
