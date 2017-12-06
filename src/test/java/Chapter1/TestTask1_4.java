package Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTask1_4 {

    @Test
    public void checkTask1_4() {
        String str = "detra tra ted";
        Task1_4 task1_4 = new Task1_4();
        assertTrue(task1_4.checkIfPalindromeAnagram(str));
    }
}
