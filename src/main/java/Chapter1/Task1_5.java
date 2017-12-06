package Chapter1;

/**
 * Напишите функцию, которая проверяет, находятся ли две строки на расстоянии одной модификации(или нуля модификаций)
 */
@SuppressWarnings("WeakerAccess")
public class Task1_5 {

    public String checkNumberOfChanges(String firstString, String secondString) {

        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();

        if (isLengthEqual(firstString, secondString)) {
            return checkSameLengthWordChanges(firstCharArray, secondCharArray);
        } else {
            if (Math.abs(firstString.length() - secondString.length()) == 1) {
                return checkDiffLengthWordChanges(firstCharArray, secondCharArray);
            } else {
                return "Строки различаются более чем на одну модификацию";
            }
        }
    }

    private boolean isLengthEqual(String first, String second) {
        return first.length() == second.length();
    }

    private String checkDiffLengthWordChanges(char[] firstCharArray, char[] secondCharArray) {
        String result = "";
        char[] longArray;
        char[] shortArray;
        if (firstCharArray.length > secondCharArray.length) {
            longArray = firstCharArray;
            shortArray = secondCharArray;
        } else {
            longArray = secondCharArray;
            shortArray = firstCharArray;
        }

        for (int i = 0; i < shortArray.length; i++) {
            if (longArray[i] != shortArray[i]) {
                if (longArray[i + 1] != shortArray[i]) {
                    result = "Строки различаются более чем на одну модификацию";
                    return result;
                } else {
                    result = "Строки различаются на одну модификацию";
                }
            }
        }
        return result;
    }

    private String checkSameLengthWordChanges(char[] firstCharArray, char[] secondCharArray) {
        boolean isAChange = false;
        String result = "Строки не отличаются";
        for (int i = 0; i < firstCharArray.length; i++) {
            if (firstCharArray[i] != secondCharArray[i]) {
                if (isAChange) {
                    result = "Строки различаются более чем на одну модификацию";
                    return result;
                }
                isAChange = true;
                result = "Строки различаются на одну модификацию";
            }
        }
        return result;
    }
}
