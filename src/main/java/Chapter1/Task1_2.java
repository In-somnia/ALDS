package Chapter1;

import java.util.Arrays;

/**
 * Для двух строк напишите метод, определяющий, является ли одна строка перестановкой другой
 */
@SuppressWarnings("WeakerAccess")
public class Task1_2 {
    public boolean anagramChecker(String str1, String str2) {
        char[] firstSequence = str1.toLowerCase().trim().replace(" ", "").toCharArray();
        char[] secondSequence = str2.toLowerCase().trim().replace(" ", "").toCharArray();
        char[] firstSortedSequence = sortChars(firstSequence, 0, firstSequence.length - 1);
        char[] secondSortedSequence = sortChars(secondSequence, 0, secondSequence.length - 1);

        return Arrays.equals(firstSortedSequence, secondSortedSequence);
    }
    private static char[] sortChars(char[] charSequence, int firstElem, int lastElem) {
        if (charSequence == null || charSequence.length == 0){
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
