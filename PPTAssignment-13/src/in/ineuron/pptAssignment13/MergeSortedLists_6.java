package in.ineuron.pptAssignment13;

class Node6 {
	int data;
	Node6 next;

	Node6(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList6 {
	Node6 head;

	void add(int data) {
		Node6 newNode = new Node6(data);
		if (head == null) {
			head = newNode;
		} else {
			Node6 current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	Node6 mergeSortedLists(Node6 a, Node6 b) {
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}

		Node6 result;
		if (a.data <= b.data) {
			result = a;
			result.next = mergeSortedLists(a.next, b);
		} else {
			result = b;
			result.next = mergeSortedLists(a, b.next);
		}
		return result;
	}

	void display() {
		Node6 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class MergeSortedLists_6 {
	public static void main(String[] args) {
		LinkedList6 list1 = new LinkedList6();
		list1.add(5);
		list1.add(10);
		list1.add(15);

		LinkedList6 list2 = new LinkedList6();
		list2.add(2);
		list2.add(3);
		list2.add(20);

		System.out.print("Input 1: ");
		list1.display();
		System.out.print("Input 2: ");
		list2.display();

		LinkedList6 mergedList = new LinkedList6();
		mergedList.head = mergedList.mergeSortedLists(list1.head, list2.head);

		System.out.print("Merged List: ");
		mergedList.display();
	}
}
