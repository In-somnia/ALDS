package test;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("WeakerAccess")
public class Task2 {
    private static List<Integer> permutations = new LinkedList<>();

    public Map<Integer, List<Integer>> findFactors(int[] num) {
        prmt(num, 0);

        List<Integer> distinctNumbers = removeDoubles(permutations);
        Integer[] numbers = distinctNumbers.toArray(new Integer[distinctNumbers.size()]);
        Integer[] sortedNums = sortNums(numbers, 0, numbers.length - 1);
        List<Integer> integers = Arrays.asList(sortedNums);

        Map<Integer, List<Integer>> numPairs = new HashMap<>();
        int firstNum;
        int secondNum;
        int counter = 1;
        for (int i = 1; i < integers.size(); i++) {
            for (int j = 0; j < i - 1; j++) {
                firstNum = integers.get(i);
                secondNum = integers.get(j);
                if (firstNum >= secondNum / 2) {
                    if (divide(firstNum, secondNum)) {
                        List<Integer> pair = new ArrayList<>();
                        pair.add(firstNum);
                        pair.add(secondNum);
                        numPairs.put(counter, pair);
                        counter++;
                    }
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
        permutations.add(Integer.parseInt(sb.toString()));
    }

    private static boolean divide(int firstNum, int secondNum) {
        return firstNum % secondNum == 0;
    }

    private List<Integer> removeDoubles(List<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }

    private static Integer[] sortNums(Integer[] numSequence, int firstElem, int lastElem) {
        if (numSequence == null || numSequence.length == 0) {
            throw new IllegalArgumentException();
        }

        int i = firstElem, j = lastElem;
        int middle = numSequence[firstElem + (lastElem - firstElem) / 2];

        while (i <= j) {
            while (numSequence[i] < middle) {
                i++;
            }
            while (numSequence[j] > middle) {
                j--;
            }
            if (i <= j) {
                swapElems(numSequence, i, j);
                i++;
                j--;
            }
        }

        if (firstElem < j)
            sortNums(numSequence, firstElem, j);
        if (i < lastElem)
            sortNums(numSequence, i, lastElem);

        return numSequence;
    }

    private static void swapElems(Integer[] numSequence, int firstElem, int lastElem) {
        int temp = numSequence[firstElem];
        numSequence[firstElem] = numSequence[lastElem];
        numSequence[lastElem] = temp;
    }
}
