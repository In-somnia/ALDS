package Chapter2;

import java.util.LinkedList;

/**
 * Два числа хранятся в виде связных списков, в которых каждый узел представляет один разряд. Все цифры хранятся в
 * обратном порядке, при этом младший разряд(единицы) хранится в начале списка. Напишите функцию, которая суммирует два
 * числа и возвращает результат в виде связного списка.
 */
@SuppressWarnings("WeakerAccess")
public class Task2_5 {
    public LinkedList<Integer> sumInvertedLists(LinkedList<Integer> firstList, LinkedList<Integer> secondList) {
        LinkedList<Integer> shortList;
        LinkedList<Integer> longList;

        if (firstList.size() >= secondList.size()) {
            longList = firstList;
            shortList = secondList;
        } else {
            longList = secondList;
            shortList = firstList;
        }

        for (int i = 0; i < longList.size(); i++) {
            if (i <= shortList.size() - 1) {
                int sum = firstList.get(i) + secondList.get(i);

                if (sum >= 10 && i != longList.size() - 1) {
                    longList.set(i, sum - 10);
                    longList.set(i + 1, longList.get(i + 1) + 1);
                } else if (sum >= 10 && i == longList.size() - 1) {
                    longList.set(i, sum - 10);
                    longList.addLast(1);
                } else {
                    longList.set(i, sum);
                }
            }
        }
        return longList;
    }
}



