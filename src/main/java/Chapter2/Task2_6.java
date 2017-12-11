package Chapter2;

/**
 * Реализуйте функцию, проверяющую, является ли связный список палиндромом.
 */
@SuppressWarnings("WeakerAccess")
public class Task2_6 {

    public boolean PalindromChecker(String str) {
        boolean isPalindrome = false;
        if (str.equals(revert(str))) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    private String revert(String str) {
        char[] revertedLetters = new char[str.length()];
        char[] letters = str.toCharArray();
        int length = letters.length - 1;
        for (int i = 0; i <= length; i++) {
            revertedLetters[i] = letters[length - i];
        }
        return new String(revertedLetters);
    }

    public boolean PalindromCheckerRecursion(String str) {
        boolean isPalindrome;
        int middle;
        char[] letters = str.toCharArray();
        if (str.length() % 2 == 0) {
            return false;
        } else {
            middle = letters.length / 2;
        }


        for (int i = 1; i <= middle; i++) {

            isPalindrome = compareChars(letters[middle - i], letters[middle + i]);
            if (!isPalindrome) {
                return false;
            }
        }
        return true;
    }

    private boolean compareChars(char firstChar, char secondChar) {
        return String.valueOf(firstChar).equals(String.valueOf(secondChar));
    }
}
