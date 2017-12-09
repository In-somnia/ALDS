package test;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask1 {

    private static Task1 task1;

    @BeforeClass
    public static void init() {
        task1 = new Task1();
    }

    @Test
    public void checkNotFibonacci() {
        assertEquals(false, task1.fibonacciFinder("13213413"));
    }

    @Test
    public void checkFibonacci() {
        assertEquals(true, task1.fibonacciFinder("132134"));
    }
}
