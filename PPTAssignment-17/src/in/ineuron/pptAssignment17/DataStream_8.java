package in.ineuron.pptAssignment17;

import java.util.LinkedList;
import java.util.Queue;

public class DataStream_8 {
	private int value;
	private int k;
	private Queue<Integer> stream;

	public DataStream_8(int value, int k) {
		this.value = value;
		this.k = k;
		this.stream = new LinkedList<>();
	}

	public boolean consec(int num) {
		stream.offer(num);
		if (stream.size() > k) {
			stream.poll();
		}
		return isConsecutive();
	}

	private boolean isConsecutive() {
		if (stream.size() != k) {
			return false;
		}
		for (int num : stream) {
			if (num != value) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		DataStream_8 dataStream = new DataStream_8(4, 3);
		System.out.println(dataStream.consec(4)); // false
		System.out.println(dataStream.consec(4)); // false
		System.out.println(dataStream.consec(4)); // true
		System.out.println(dataStream.consec(3)); // false
	}
}
