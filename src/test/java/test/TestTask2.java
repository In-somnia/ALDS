package test;

import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTask2 {

    @Test
    public void checkTask2() {
        Task2 task2 = new Task2();
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Map<Integer, Set<Long>> factors = task2.findFactors(num);

        assertEquals(24603, factors.keySet().size());
        assertTrue(factors.get(1).contains(123456789L));
        assertTrue(factors.get(1).contains(246913578L));
    }
}
