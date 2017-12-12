package Chapter3;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Напишите программу сортировки стека, в результате которой наименьший элемент оказывается на вершине стека. Вы можете
 * использовать дополнительный временный стек, но элементы не должны копироваться в другие структуры данных (например, в
 * массив). Стек должен поддерживать следующие операции: push, pop, peek, isEmpty.
 */
@SuppressWarnings("WeakerAccess")
public class Task3_5 {

    public Stack<Integer> sortStack(Stack<Integer> initialStack) {
        int initSize = initialStack.size();
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> result = new Stack<>();
        if (!initialStack.isEmpty()) {

            while (result.size() < initSize) {
                int maxInit = initialStack.pop();
                while (!initialStack.isEmpty()) {

                    int value = initialStack.pop();
                    if (value > maxInit) {
                        tempStack.push(maxInit);
                        maxInit = value;
                    } else {
                        tempStack.push(value);
                    }
                }
                result.push(maxInit);

                int maxTemp = tempStack.pop();
                while (!tempStack.isEmpty()) {

                    int value = tempStack.pop();
                    if (value > maxTemp) {
                        initialStack.push(maxTemp);
                        maxTemp = value;
                    } else {
                        initialStack.push(value);
                    }
                }
                result.push(maxTemp);
            }
        } else {
            throw new EmptyStackException();
        }
        return result;
    }
}
