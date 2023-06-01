package in.ineuron.pptAssignment03;

import java.util.Arrays;

public class CanAttendMeetings {

	public static void main(String[] args) {
		int[][] nums = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		System.out.println(canAttendMeetings(nums));
	}

	public static boolean canAttendMeetings(int[][] intervals) {
		// Sort the intervals based on their start time
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		// Check for any overlap
		for (int i = 0; i < intervals.length - 1; i++) {
			// If the end time of the current interval is greater than or equal to the start
			// time of the next interval, there is an overlap
			if (intervals[i][1] >= intervals[i + 1][0]) {
				return false;
			}
		}

		return true; // No overlap found, person can attend all meetings
	}
}
