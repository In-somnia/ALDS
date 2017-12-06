package Chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Напишите функцию, которая проверяет, является ли заданная строка перестановкой палиндрома.
 * Палиндром не ограничивается словами из словаря.
 */
@SuppressWarnings("WeakerAccess")
public class Task1_4 {
    public boolean checkIfPalindromeAnagram(String str) {
        boolean singleOddLetter = false;
        Map<String, Integer> letters = new HashMap<>();
        Pattern pattern = Pattern.compile("[a-zа-я]");
        String key;
        char[] keys = str.toLowerCase().replace(" ", "").toCharArray();

        for (char letter : keys) {
            key = String.valueOf(letter);
            if (pattern.matcher(key).find()) {
                for (Map.Entry<String, Integer> pair : letters.entrySet()) {
                    if (pair.getKey().contains(key)) {
                        letters.put(key, pair.getValue() + 1);
                    } else {
                        letters.put(key, 1);
                    }
                }
            }
        }

        for (Integer value : letters.values()) {
            if (value % 2 != 0) {
                if (singleOddLetter) {
                    return false;
                }
                singleOddLetter = true;
            }
        }
        return true;
    }
}
