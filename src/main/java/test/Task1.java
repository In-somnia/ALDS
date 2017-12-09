package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@SuppressWarnings("WeakerAccess")
public class Task1 {

    List<Integer> fibNumbers = new ArrayList<>();
    private int fibLimit;
    private boolean isFib = true;

    public boolean fibonacciFinder(String str) {
        int length = str.length();
        fibNumbers.add(0);
        fibNumbers.add(1);
        fibLimit = length / 2;
        fib(0, 1);
        List<Integer> firstNums = findFirstNum(str);

        for (int j = 0; j < firstNums.size(); j++) {
            if (firstNums.size() != 0 && firstNums.get(0) != null) {
                int indexStep = 0;
                int index = fibNumbers.indexOf(firstNums.get(j));
                int step = String.valueOf(firstNums.get(j)).length();

                for (int i = 0; i <= str.length() - 1; i = i + step) {
                    int num = 0;

                    if (step + step < str.length()) {
                        num = Integer.parseInt(str.substring(i, i + step));
                    }
                    if (fibNumbers.get(index + indexStep).equals(num)) {
                        step = String.valueOf(num).length();
                    } else {
                        int numPlusOneMoreDigit = 0;

                        if (step + step + 1 < str.length()) {
                            numPlusOneMoreDigit = Integer.parseInt(str.substring(step, step + step + 1));
                        }
                        if (fibNumbers.get(index + i).equals(numPlusOneMoreDigit)) {
                            step = String.valueOf(numPlusOneMoreDigit).length();
                        } else {
                            isFib = false;
                            break;
                        }
                    }
                    isFib = true;
                    indexStep++;
                }
            } else {
                isFib = false;
            }
        }
        return isFib;
    }

    private void fib(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        fibNumbers.add(sum);
        if (String.valueOf(sum).length() < fibLimit + 1) {
            fib(secondNum, sum);
        }
    }

    private List<Integer> findFirstNum(String str) {
        List<Integer> possibleFirstNums = new ArrayList<>();
        int firstNum;
        for (int i = 0; i <= fibLimit; i++) {
            firstNum = Integer.parseInt(str.substring(0, i + 1));
            if (fibNumbers.contains(firstNum)) {
                possibleFirstNums.add(firstNum);
            }
        }
        return possibleFirstNums;
    }
}
