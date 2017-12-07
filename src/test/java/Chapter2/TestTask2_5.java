package Chapter2;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestTask2_5 {

    private static Task2_5 task2_5;

    @BeforeClass
    public static void init() {
        task2_5 = new Task2_5();
    }

    @Test
    public void checkSameLengthInvertedListSum() {
        LinkedList<Integer> firstNum = new LinkedList<>();
        firstNum.add(0, 5);
        firstNum.add(1, 7);
        firstNum.add(2, 0);
        firstNum.add(3, 1);

        LinkedList<Integer> secondNum = new LinkedList<>();
        secondNum.add(0, 6);
        secondNum.add(1, 9);
        secondNum.add(2, 3);
        secondNum.add(3, 4);

        LinkedList<Integer> expectedSum = task2_5.sumInvertedLists(firstNum, secondNum);

        assertEquals(1, (long) expectedSum.getFirst());
        assertEquals(7, (long) expectedSum.get(1));
        assertEquals(4, (long) expectedSum.get(2));
        assertEquals(5, (long) expectedSum.getLast());
    }

    @Test
    public void checkDiffLengthOutputInvertedListSum() {
        LinkedList<Integer> firstNum = new LinkedList<>();
        firstNum.add(0, 9);
        firstNum.add(1, 7);
        firstNum.add(2, 8);
        firstNum.add(3, 8);

        LinkedList<Integer> secondNum = new LinkedList<>();
        secondNum.add(0, 6);
        secondNum.add(1, 9);
        secondNum.add(2, 3);
        secondNum.add(3, 4);

        LinkedList<Integer> expectedSum = task2_5.sumInvertedLists(firstNum, secondNum);

        assertEquals(5, (long) expectedSum.getFirst());
        assertEquals(7, (long) expectedSum.get(1));
        assertEquals(2, (long) expectedSum.get(2));
        assertEquals(3, (long) expectedSum.get(3));
        assertEquals(1, (long) expectedSum.getLast());
    }

    @Test
    public void checkDiffLengthInvertedListSum() {
        LinkedList<Integer> firstNum = new LinkedList<>();
        firstNum.add(0, 9);
        firstNum.add(1, 7);
        firstNum.add(2, 8);

        LinkedList<Integer> secondNum = new LinkedList<>();
        secondNum.add(0, 6);
        secondNum.add(1, 9);
        secondNum.add(2, 3);
        secondNum.add(3, 4);

        LinkedList<Integer> expectedSum = task2_5.sumInvertedLists(firstNum, secondNum);

        assertEquals(5, (long) expectedSum.getFirst());
        assertEquals(7, (long) expectedSum.get(1));
        assertEquals(2, (long) expectedSum.get(2));
        assertEquals(5, (long) expectedSum.getLast());
    }
}
