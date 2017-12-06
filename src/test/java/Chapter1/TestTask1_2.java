package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTask1_2 {

    @Test
    public void checkTask1_2() {
        String firstWord = "Single";
        String secondWord = "Sleign";
        Task1_2 task1_2 = new Task1_2();
        assertTrue(task1_2.anagramChecker(firstWord, secondWord));
    }
}
