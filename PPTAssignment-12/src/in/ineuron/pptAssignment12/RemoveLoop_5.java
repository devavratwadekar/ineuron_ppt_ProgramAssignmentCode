package in.ineuron.pptAssignment12;

public class RemoveLoop_5 {

	public static void main(String[] args) {
		// Create a linked list with a loop
		int[] value = { 1, 2, 3, 4 };
		Node05 head = new Node05(value[0]);
		Node05 current = head;
		for (int i = 1; i < value.length; i++) {
			current.next = new Node05(value[i]);
			current = current.next;
		}
		current.next = head;

		// Remove the loop
		removeLoop(head);

		// Print the linked list
		printList(head);
	}

	private static void removeLoop(Node05 head) {
		// Find the first node in the loop
		Node05 slow = head;
		Node05 fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		// If there is no loop, return
		if (fast == null) {
			return;
		}

		// Find the node that is connected to the first node in the loop
		Node05 runner = slow;
		while (runner != fast) {
			runner = runner.next;
			fast = fast.next;
		}

		// Break the loop by unlinking the node that is connected to the first node in
		// the loop
		runner.next = null;
	}

	private static void printList(Node05 head) {
		Node05 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

}

class Node05 {

	int data;
	Node05 next;

	public Node05(int data) {
		this.data = data;
	}

}
