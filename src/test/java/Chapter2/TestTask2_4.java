package Chapter2;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestTask2_4 {

    @Test
    public void checkListContainsBreaker() {
        Task2_4 task2_4 = new Task2_4();
        LinkedList<Integer> testNumbers = new LinkedList<>();
        testNumbers.add(0, 12);
        testNumbers.add(1, 3);
        testNumbers.add(2, 17);
        testNumbers.add(3, 18);
        testNumbers.add(4, 2);
        testNumbers.add(5, 9);
        testNumbers.add(6, 4);
        testNumbers.add(7, 9);
        testNumbers.add(8, 14);
        testNumbers.add(9, 7);
        LinkedList<Integer> expected = task2_4.breakAndSortByANumber(testNumbers, 9);

        assertEquals(7, (long)expected.getFirst());
        assertEquals(14, (long)expected.getLast());
    }
    @Test
    public void checkListWithoutBreaker() {
        Task2_4 task2_4 = new Task2_4();
        LinkedList<Integer> testNumbers = new LinkedList<>();
        testNumbers.add(0, 12);
        testNumbers.add(1, 3);
        testNumbers.add(2, 17);
        testNumbers.add(3, 18);
        testNumbers.add(4, 2);
        testNumbers.add(5, 9);
        testNumbers.add(6, 4);
        testNumbers.add(7, 9);
        testNumbers.add(8, 14);
        testNumbers.add(9, 7);
        LinkedList<Integer> expected = task2_4.breakAndSortByANumber(testNumbers, 13);

        assertEquals(7, (long)expected.getFirst());
        assertEquals(14, (long)expected.getLast());
    }
}
