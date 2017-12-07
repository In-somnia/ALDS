package Chapter2;

import java.util.LinkedList;

/**
 * Напишите код для удаления дубликатов из несортированного связного списка.
 */
@SuppressWarnings("WeakerAccess")
public class Task2_1 {

    public LinkedList<Integer> removeDoubles(LinkedList<Integer> numbers) {

        LinkedList<Integer> result = new LinkedList<>();
        numbers.forEach(
                num -> {
                    if (!result.contains(num)) {
                        result.add(num);
                    }
                }
        );
        return result;
    }
}
