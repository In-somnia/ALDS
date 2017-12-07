package Chapter2;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestTask2_1 {

    @Test
    public void checkTask2_1() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(0, 3);
        numbers.add(1, 6);
        numbers.add(2, 3);
        numbers.add(3, 2);
        numbers.add(4, 6);
        numbers.add(5, 5);
        numbers.add(6, 9);
        numbers.add(7, 9);
        numbers.add(8, 5);
        numbers.add(9, 4);
        Task2_1 task2_1 = new Task2_1();
        LinkedList<Integer> expected = task2_1.removeDoubles(numbers);

        assertEquals(6, expected.size());
        assertEquals(3, (long) expected.getFirst());
        assertEquals(4, (long) expected.getLast());
    }
}
