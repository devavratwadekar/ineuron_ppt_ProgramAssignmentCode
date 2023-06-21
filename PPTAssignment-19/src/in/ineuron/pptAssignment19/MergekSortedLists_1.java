package in.ineuron.pptAssignment19;

import java.util.PriorityQueue;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class MergekSortedLists_1 {
	public static void main(String[] args) {
		ListNode[] lists = new ListNode[3];
		lists[0] = createList(new int[] { 1, 4, 5 });
		lists[1] = createList(new int[] { 1, 3, 4 });
		lists[2] = createList(new int[] { 2, 6 });

		ListNode mergedList = mergeKLists(lists);
		printList(mergedList);
		// Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6
	}

	public static ListNode mergeKLists(ListNode[] lists) {
		// Create a min-heap to store the nodes of the linked lists
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

		// Add the head nodes of all linked lists to the min-heap
		for (ListNode list : lists) {
			if (list != null) {
				minHeap.offer(list);
			}
		}

		// Create a dummy node to build the merged list
		ListNode dummy = new ListNode(-1);
		ListNode curr = dummy;

		// Process the nodes in the min-heap until it becomes empty
		while (!minHeap.isEmpty()) {
			ListNode node = minHeap.poll(); // Extract the node with the minimum value
			curr.next = node; // Add the node to the merged list
			curr = curr.next; // Move the current pointer

			// If the extracted node has a next node, add it to the min-heap
			if (node.next != null) {
				minHeap.offer(node.next);
			}
		}

		return dummy.next; // Return the head of the merged list
	}

	// Utility method to create a linked list from an array
	public static ListNode createList(int[] nums) {
		ListNode dummy = new ListNode(-1);
		ListNode curr = dummy;
		for (int num : nums) {
			curr.next = new ListNode(num);
			curr = curr.next;
		}
		return dummy.next;
	}

	// Utility method to print the elements of a linked list
	public static void printList(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val + " -> ");
			curr = curr.next;
		}
		System.out.println("null");
	}
}
