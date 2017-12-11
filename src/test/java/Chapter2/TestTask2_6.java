package Chapter2;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask2_6 {

    private static Task2_6 task2_6;

    @BeforeClass
    public static void init() {
        task2_6 = new Task2_6();
    }

    @Test
    public void checkIfPalindromeViaInversion() {
        assertEquals(true, task2_6.PalindromChecker("madam"));
        assertEquals(false, task2_6.PalindromChecker("example"));
        assertEquals(false, task2_6.PalindromChecker("even"));
    }

    @Test
    public void checkEvenNumberViaInversion() {
        assertEquals(false, task2_6.PalindromChecker("even"));
    }

    @Test
    public void checkIfPalindromeViaRecursion() {
        assertEquals(true, task2_6.PalindromCheckerRecursion("madam"));
        assertEquals(false, task2_6.PalindromCheckerRecursion("example"));
        assertEquals(false, task2_6.PalindromCheckerRecursion("even"));
    }

    @Test
    public void checkEvenNumberViaRecursion() {
        assertEquals(false, task2_6.PalindromCheckerRecursion("even"));
    }

}
