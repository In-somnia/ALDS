package Chapter3;


import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestTask3_5 {

    @Test
    public void sortStack() {
        Task3_5 task3_5 = new Task3_5();
        Stack<Integer> sortedStack = new Stack<>();
        sortedStack.push(7);
        sortedStack.push(6);
        sortedStack.push(5);
        sortedStack.push(8);
        sortedStack.push(3);
        sortedStack.push(4);
        Stack expected = task3_5.sortStack(sortedStack);
        assertEquals(3, expected.peek());
    }
}
