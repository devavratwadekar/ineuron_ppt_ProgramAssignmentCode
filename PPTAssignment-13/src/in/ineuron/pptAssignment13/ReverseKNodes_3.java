package in.ineuron.pptAssignment13;

class Node3 {
	int data;
	Node3 next;

	Node3(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList3 {
	Node3 head;

	void add(int data) {
		Node3 newNode = new Node3(data);
		if (head == null) {
			head = newNode;
		} else {
			Node3 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	Node3 reverseKNodes(Node3 head, int k) {
		Node3 current = head;
		Node3 next = null;
		Node3 prev = null;
		int count = 0;

		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		if (next != null) {
			head.next = reverseKNodes(next, k);
		}

		return prev;
	}

	void display() {
		Node3 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class ReverseKNodes_3 {
	public static void main(String[] args) {
		LinkedList3 list = new LinkedList3();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		int k = 4;

		System.out.print("Input: ");
		list.display();

		list.head = list.reverseKNodes(list.head, k);

		System.out.print("Output: ");
		list.display();
	}
}
