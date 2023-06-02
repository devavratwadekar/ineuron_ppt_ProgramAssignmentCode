package in.ineuron.pptAssignment06;

import java.util.*;

public class PermutationReconstruction {
	
	public int[] findPermutation(String s) {
		int n = s.length();
		int[] perm = new int[n + 1];
		int left = 0;
		int right = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'I') {
				perm[i] = left++;
			} else {
				perm[i] = right--;
			}
		}

		perm[n] = left;

		for (int i = 0; i < n + 1; i++) {
			perm[i] -= right;
		}

		return perm;
	}

	public static void main(String[] args) {
		PermutationReconstruction pr = new PermutationReconstruction();
		String s = "IDID";
		int[] permutation = pr.findPermutation(s);
		System.out.println(Arrays.toString(permutation));
	}
}
