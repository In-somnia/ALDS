package test;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestTask2 {

    @Test
    public void checkTask2() {
        Task2 task2 = new Task2();
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Map<Integer, List<Integer>> factors = task2.findFactors(num);

        assertEquals(246913578, (long)factors.get(1).get(0));
        assertEquals(123456789, (long)factors.get(1).get(0));
    }
}
