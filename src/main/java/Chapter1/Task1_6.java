package Chapter1;


/**
 * Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика повторяющихся символов.
 * Если "сжатая" строка не становится короче исходной, то метод возвращает исходную строку.
 * Предполагается, что метод состоит только из букв верхнего и нижнего регистра (a-z).
 */
@SuppressWarnings("WeakerAccess")
public class Task1_6 {

    public String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        char[] letters = str.toCharArray();
        int counter;
        int j = 1;

        if (str.equals("")) {
            throw new IllegalArgumentException("The string is missing");
        }

        for (int i = 0; i < letters.length; ) {
            counter = 1;
            while (j <= letters.length - 1 && letters[i] == letters[j]) {
                counter++;
                j++;
            }
            sb.append(letters[i]).append(counter);
            i = j;
            j = i + 1;
        }

        String compressedString = sb.toString();
        if (compressedString.length() < str.length()) {
            return compressedString;
        } else {
            return str;
        }
    }
}

