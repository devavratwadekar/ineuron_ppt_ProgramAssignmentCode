package in.ineuron.pptAssignment14;

class Node03 {
	int data;
	Node03 next;

	Node03(int data) {
		this.data = data;
		next = null;
	}
}

class AddOneLinkedList_2 {
	Node03 head;

	void addNode(int data) {
		Node03 newNode = new Node03(data);
		if (head == null) {
			head = newNode;
		} else {
			Node03 curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}

	Node03 reverseList(Node03 node) {
		Node03 prev = null;
		Node03 curr = node;
		Node03 next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	void addOne() {
		head = reverseList(head);
		Node03 curr = head;
		int carry = 1;

		while (curr != null) {
			int sum = curr.data + carry;
			curr.data = sum % 10;
			carry = sum / 10;
			curr = curr.next;
		}

		if (carry > 0) {
			Node03 newNode = new Node03(carry);
			newNode.next = head;
			head = newNode;
		}

		head = reverseList(head);
	}

	void printList() {
		Node03 curr = head;
		while (curr != null) {
			System.out.print(curr.data);
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		AddOneLinkedList_2 list = new AddOneLinkedList_2();
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);

		// Add 1 to the linked list
		list.addOne();

		// Print the modified linked list
		list.printList();
	}
}
