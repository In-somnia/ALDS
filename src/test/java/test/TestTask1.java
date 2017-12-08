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
        assertEquals(false, task1.FibonacciDetector("1761258"));
    }

    @Test
    public void checkFibonacci() {
        assertEquals(true, task1.FibonacciDetector("0123518"));
    }

}
