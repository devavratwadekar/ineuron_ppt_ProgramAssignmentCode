package in.ineuron.pptAssignment13;

class Node4 {
	int data;
	Node4 next;

	Node4(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList4 {
	Node4 head;

	void add(int data) {
		Node4 newNode = new Node4(data);
		if (head == null) {
			head = newNode;
		} else {
			Node4 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	Node4 reverseAlternateKNodes(Node4 head, int k) {
		if (head == null || head.next == null || k <= 1) {
			return head;
		}

		Node4 current = head;
		Node4 prev = null;
		Node4 next = null;
		int count = 0;

		// Reverse k nodes
		while (current != null && count < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		// Connect the reversed k nodes to the next set of k nodes
		if (head != null) {
			head.next = current;
		}

		// Skip the next k nodes
		count = 0;
		while (count < k - 1 && current != null) {
			current = current.next;
			count++;
		}

		// Recursively reverse the next set of alternate k nodes
		if (current != null) {
			current.next = reverseAlternateKNodes(current.next, k);
		}

		return prev;
	}

	void display() {
		Node4 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class ReverseAlternateKNodes_4 {
	public static void main(String[] args) {
		LinkedList4 list = new LinkedList4();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		int k = 3;

		System.out.print("Input: ");
		list.display();

		list.head = list.reverseAlternateKNodes(list.head, k);

		System.out.print("Output: ");
		list.display();
	}
}
