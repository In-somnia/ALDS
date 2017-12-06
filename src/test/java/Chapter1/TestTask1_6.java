package Chapter1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask1_6 {

    private static Task1_6 task1_6;

    @BeforeClass
    public static void init() {
        task1_6 = new Task1_6();
    }

    @Test
    public void checkCompressedIsLonger() {
        String compressable = "subconscious";
        String result = task1_6.compressString(compressable);
        assertEquals("subconscious", result);
    }
    @Test
    public void checkCompressedIsShorter() {
        String compressable = "ssssbbbbbcdd";
        String result = task1_6.compressString(compressable);
        assertEquals("s4b5c1d2", result);
    }
}
