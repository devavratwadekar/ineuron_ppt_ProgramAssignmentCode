package in.ineuron.pptAssignment17;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter_4 {
	private Queue<Integer> requests;

	public RecentCounter_4() {
		requests = new LinkedList<>();
	}

	public int ping(int t) {
		requests.offer(t); // Add the new request

		while (requests.peek() < t - 3000) {
			requests.poll(); // Remove requests older than t - 3000
		}

		return requests.size();
	}

	public static void main(String[] args) {
		RecentCounter_4 counter = new RecentCounter_4();
		System.out.println(counter.ping(1)); // Output: 1
		System.out.println(counter.ping(100)); // Output: 2
		System.out.println(counter.ping(3001)); // Output: 3
		System.out.println(counter.ping(3002)); // Output: 3
	}
}
