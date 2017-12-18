package test;

import java.util.*;

@SuppressWarnings("WeakerAccess")
public class Task2 {
    private static List<Long> permutations = new LinkedList<>();

    public Map<Integer, Set<Long>> findFactors(int[] num) {
        prmt(num, 0);

        Map<Integer, Set<Long>> numPairs = new HashMap<>();
        TreeSet<Long> numbers = new TreeSet<>(permutations);
        int counter = 1;
        for (Long number : numbers) {
            for (int i = 2; i <= numbers.last() / number; i++) {
                Long div = number * i;
                Set<Long> factors = new HashSet<>();
                if (numbers.contains(div)) {
                    factors.add(div);
                    factors.add(number);
                    numPairs.put(counter, factors);
                    counter++;
                }
            }
        }
        return numPairs;
    }

    private void prmt(int[] num, int i) {
        if (i == num.length - 1) {
            write(num);
        } else {
            for (int j = i; j < num.length; j++) {
                swap(num, i, j);
                prmt(num, i + 1);
                swap(num, i, j);
            }
        }
    }

    private void swap(int[] pa, int i, int j) {
        int k = pa[i];
        pa[i] = pa[j];
        pa[j] = k;
    }

    private void write(int[] num) {
        StringBuilder sb = new StringBuilder();
        for (int n : num) {
            sb.append(n);
        }
        permutations.add(Long.valueOf(sb.toString()));
    }
}
