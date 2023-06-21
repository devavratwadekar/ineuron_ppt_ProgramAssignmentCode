package in.ineuron.pptAssignment18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_1 {
	public static int[][] merge(int[][] intervals) {
		// Sort the intervals based on the start time
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

		List<int[]> merged = new ArrayList<>();
		int[] currentInterval = intervals[0];

		for (int i = 1; i < intervals.length; i++) {
			int[] interval = intervals[i];

			if (interval[0] <= currentInterval[1]) {
				// Overlapping intervals, update the end time
				currentInterval[1] = Math.max(currentInterval[1], interval[1]);
			} else {
				// Non-overlapping interval, add the current interval to the result
				merged.add(currentInterval);
				currentInterval = interval;
			}
		}

		// Add the last interval to the result
		merged.add(currentInterval);

		return merged.toArray(new int[merged.size()][]);
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] mergedIntervals = merge(intervals);

		// Print the merged intervals
		for (int[] interval : mergedIntervals) {
			System.out.println(Arrays.toString(interval));
		}
	}
}
