package in.ineuron.pptAssignment05;

public class DistanceValue {
	public static int distanceValue(int[] arr1, int[] arr2, int d) {
		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			boolean isValid = true;

			for (int j = 0; j < arr2.length; j++) {
				if (Math.abs(arr1[i] - arr2[j]) <= d) {
					isValid = false;
					break;
				}
			}

			if (isValid) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 8 };
		int[] arr2 = { 10, 9, 1, 8 };
		int d = 2;

		int result = distanceValue(arr1, arr2, d);
		System.out.println("Distance value: " + result);
	}
}
