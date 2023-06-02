package in.ineuron.pptAssignment04;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {
	public static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		List<Integer> result = new ArrayList<>();

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				result.add(arr1[i]);
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}
		}

		int[] output = new int[result.size()];
		for (int m = 0; m < result.size(); m++) {
			output[m] = result.get(m);
		}

		return output;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 5, 7, 9 };
		int[] arr3 = { 1, 3, 4, 5, 8 };

		int[] result = findCommonElements(arr1, arr2, arr3);

		System.out.print("Output: [");
		for (int i = 0; i < result.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(result[i]);
		}
		System.out.println("]");
	}
}
