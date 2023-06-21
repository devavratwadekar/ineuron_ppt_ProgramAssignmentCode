package in.ineuron.pptAssignment17;

public class FrontMiddleBackQueue_7 {
	private class Node {
		int val;
		Node prev;
		Node next;

		public Node(int val) {
			this.val = val;
			this.prev = null;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public FrontMiddleBackQueue_7() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void pushFront(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	public void pushMiddle(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else if (size % 2 == 0) {
			Node middle = getNodeAtIndex(size / 2 - 1);
			newNode.prev = middle;
			newNode.next = middle.next;
			if (middle.next != null) {
				middle.next.prev = newNode;
			}
			middle.next = newNode;
		} else {
			Node middle = getNodeAtIndex(size / 2);
			newNode.prev = middle.prev;
			newNode.next = middle;
			if (middle.prev != null) {
				middle.prev.next = newNode;
			}
			middle.prev = newNode;
		}
		size++;
	}

	public void pushBack(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public int popFront() {
		if (isEmpty()) {
			return -1;
		}

		int front = head.val;
		head = head.next;
		if (head == null) {
			tail = null;
		} else {
			head.prev = null;
		}
		size--;

		return front;
	}

	public int popMiddle() {
		if (isEmpty()) {
			return -1;
		}

		int middle;
		if (size % 2 == 0) {
			Node middleNode = getNodeAtIndex(size / 2 - 1);
			middle = middleNode.next.val;
			middleNode.next = middleNode.next.next;
			if (middleNode.next != null) {
				middleNode.next.prev = middleNode;
			} else {
				tail = middleNode;
			}
		} else {
			Node middleNode = getNodeAtIndex(size / 2);
			middle = middleNode.val;
			if (middleNode.prev != null) {
				middleNode.prev.next = middleNode.next;
			}
			if (middleNode.next != null) {
				middleNode.next.prev = middleNode.prev;
			}
			if (middleNode == head) {
				head = head.next;
			}
			if (middleNode == tail) {
				tail = tail.prev;
			}
		}
		size--;

		return middle;
	}

	public int popBack() {
		if (isEmpty()) {
			return -1;
		}

		int back = tail.val;
		tail = tail.prev;
		if (tail == null) {
			head = null;
		} else {
			tail.next = null;
		}
		size--;

		return back;
	}

	private boolean isEmpty() {
		return size == 0;
	}

	private Node getNodeAtIndex(int index) {
		if (index < 0 || index >= size) {
			return null;
		}

		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

	public static void main(String[] args) {
		FrontMiddleBackQueue_7 queue = new FrontMiddleBackQueue_7();
		queue.pushFront(1);
		queue.pushBack(2);
		queue.pushMiddle(3);
		queue.pushMiddle(4);

		System.out.println(queue.popFront()); // 1
		System.out.println(queue.popMiddle()); // 3
		System.out.println(queue.popMiddle()); // 4
		System.out.println(queue.popBack()); // 2
		System.out.println(queue.popFront()); // -1
	}
}
