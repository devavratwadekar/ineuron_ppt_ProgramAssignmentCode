package in.ineuron.pptAssignment09;

import java.util.ArrayList;
import java.util.List;

public class FindPermutations {
    public static List<String> findPermutations(String s) {
        List<String> permutations = new ArrayList<>();
        backtrack(permutations, s.toCharArray(), 0, s.length() - 1);
        return permutations;
    }

    public static void backtrack(List<String> permutations, char[] sArr, int start, int end) {
        if (start == end) {
            permutations.add(new String(sArr));
        } else {
            for (int i = start; i <= end; i++) {
                swap(sArr, start, i);
                backtrack(permutations, sArr, start + 1, end);
                swap(sArr, start, i);
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String S = "ABC";
        List<String> permutations = findPermutations(S);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
