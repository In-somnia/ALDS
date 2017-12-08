package test;

/**
 * Quick sort - O(n^2)
 */
@SuppressWarnings("WeakerAccess")
public class Task1 {

    public boolean FibonacciDetector(String str) {
        char[] numbers = str.toCharArray();
        char[] sortedNumbers = sortChars(numbers, 0, numbers.length - 1);

        for (int i = 2; i <= sortedNumbers.length - 1; i++) {
            int firstPrev = Character.getNumericValue(sortedNumbers[i - 2]);
            int secondPrev = Character.getNumericValue(sortedNumbers[i - 1]);
            int sum = Character.getNumericValue(sortedNumbers[i]);
                if (!(firstPrev + secondPrev == sum)) {
                    return false;
                }
            }
        return true;
    }

    private static char[] sortChars(char[] charSequence, int firstElem, int lastElem) {
        if (charSequence == null || charSequence.length == 0) {
            throw new IllegalArgumentException();
        }

        int i = firstElem, j = lastElem;
        char middle = charSequence[firstElem + (lastElem - firstElem) / 2];

        while (i <= j) {
            while (charSequence[i] < middle) {
                i++;
            }

            while (charSequence[j] > middle) {
                j--;
            }

            if (i <= j) {
                swapElems(charSequence, i, j);
                i++;
                j--;
            }
        }

        if (firstElem < j)
            sortChars(charSequence, firstElem, j);
        if (i < lastElem)
            sortChars(charSequence, i, lastElem);

        return charSequence;
    }

    private static void swapElems(char[] charSequence, int firstElem, int lastElem) {
        char temp = charSequence[firstElem];
        charSequence[firstElem] = charSequence[lastElem];
        charSequence[lastElem] = temp;
    }

}
