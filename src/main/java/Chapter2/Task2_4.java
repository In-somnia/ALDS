package Chapter2;

import java.util.LinkedList;

/**
 * Напишите код для разбиения связного списка вокруг значения х, так чтобы все узлы, меньшие х, предшествовали узлам,
 * большим или равным х. Если х содержится в списке, то значения должны следовать строго после элементов, меньших х.
 * Элемент разбивки х может находиться где угодно в правой части; он не обязан располагаться между правой и левой
 * частью.
 */
@SuppressWarnings("WeakerAccess")
public class Task2_4 {
    public LinkedList<Integer> breakAndSortByANumber(LinkedList<Integer> numbers, int breaker) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer num : numbers) {
            if (num == breaker) {
                result.add(numbers.indexOf(num) - 1, num);
            } else if (num < breaker) {
                if (result.size() == 0) {
                    result.add(0, num);
                } else {
                    if (result.getFirst() != breaker) {
                        result.add(0, num);
                    }
                }
            } else {
                result.addLast(num);
            }
        }
        return result;
    }
}
