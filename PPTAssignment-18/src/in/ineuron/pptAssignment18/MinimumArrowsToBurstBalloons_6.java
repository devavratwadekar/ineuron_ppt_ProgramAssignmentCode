package in.ineuron.pptAssignment18;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumArrowsToBurstBalloons_6 {
	public static int findMinArrowShots(int[][] points) {
		if (points.length == 0) {
			return 0;
		}

		// Sort the balloons based on their end coordinates in ascending order
		Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

		int arrows = 1; // At least one arrow is needed
		int end = points[0][1]; // End coordinate of the first balloon

		// Iterate through the remaining balloons
		for (int i = 1; i < points.length; i++) {
			// If the current balloon's start coordinate is after the previous balloon's end
			// coordinate,
			// we need to shoot another arrow since the balloons are not overlapping
			// anymore.
			if (points[i][0] > end) {
				arrows++;
				end = points[i][1]; // Update the end coordinate to the current balloon's end coordinate
			}
		}

		return arrows;
	}

	public static void main(String[] args) {
		int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
		int minArrows = findMinArrowShots(points);
		System.out.println("Minimum Arrows: " + minArrows);
	}
}
