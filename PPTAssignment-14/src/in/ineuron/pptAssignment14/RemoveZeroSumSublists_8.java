package in.ineuron.pptAssignment14;

import java.util.HashMap;
import java.util.Map;

class ListNode08 {
	int val;
	ListNode08 next;

	ListNode08(int val) {
		this.val = val;
		this.next = null;
	}
}

class Solution08 {
	public ListNode08 removeZeroSumSublists(ListNode08 head) {
		ListNode08 dummy = new ListNode08(0);
		dummy.next = head;
		ListNode08 curr = dummy;
		int sum = 0;
		Map<Integer, ListNode08> map = new HashMap<>();

		while (curr != null) {
			sum += curr.val;

			if (map.containsKey(sum)) {
				ListNode08 prev = map.get(sum).next;
				int tempSum = sum + prev.val;
				while (prev != curr) {
					map.remove(tempSum);
					prev = prev.next;
					tempSum += prev.val;
				}
				map.get(sum).next = curr.next;
			} else {
				map.put(sum, curr);
			}

			curr = curr.next;
		}

		return dummy.next;
	}
}

public class RemoveZeroSumSublists_8 {
	public static void main(String[] args) {
		ListNode08 head = new ListNode08(1);
		head.next = new ListNode08(2);
		head.next.next = new ListNode08(-3);
		head.next.next.next = new ListNode08(3);
		head.next.next.next.next = new ListNode08(1);

		Solution08 solution = new Solution08();
		ListNode08 result = solution.removeZeroSumSublists(head);

		// Print the result
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
		System.out.println();
	}
}
