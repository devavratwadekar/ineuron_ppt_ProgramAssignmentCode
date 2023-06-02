package in.ineuron.pptAssignment06;

import java.util.*;

public class DoubledArray {

    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            // If the length of changed is odd, it cannot be a doubled array
            return new int[0];
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : changed) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer> original = new ArrayList<>();
        Arrays.sort(changed);

        for (int num : changed) {
            if (frequency.containsKey(num) && frequency.containsKey(num * 2)) {
                original.add(num);
                int count = frequency.get(num);
                int doubleCount = frequency.get(num * 2);

                if (count == 1) {
                    frequency.remove(num);
                } else {
                    frequency.put(num, count - 1);
                }

                if (doubleCount == 1) {
                    frequency.remove(num * 2);
                } else {
                    frequency.put(num * 2, doubleCount - 1);
                }
            }
        }

        if (original.size() == changed.length / 2) {
            int[] result = new int[original.size()];
            for (int i = 0; i < original.size(); i++) {
                result[i] = original.get(i);
            }
            return result;
        } else {
            return new int[0];
        }
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }
}
