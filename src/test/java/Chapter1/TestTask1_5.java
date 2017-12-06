package Chapter1;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class TestTask1_5 {

    @Test
    public void checkMoreThanOneChange() {
        Task1_5 task1_5 = new Task1_5();
        String result = task1_5.checkNumberOfChanges("rain", "reign");
        assertThat(result,
                CoreMatchers.is("Строки различаются более чем на одну модификацию"));
    }
    @Test
    public void checkOneChange() {
        Task1_5 task1_5 = new Task1_5();
        String result = task1_5.checkNumberOfChanges("drain", "rain");
        assertThat(result,
                CoreMatchers.is("Строки различаются на одну модификацию"));
    }
    @Test
    public void checkSameWords() {
        Task1_5 task1_5 = new Task1_5();
        String result = task1_5.checkNumberOfChanges("rain", "rain");
        assertThat(result,
                CoreMatchers.is("Строки не отличаются"));
    }
}
