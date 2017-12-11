package Chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask3_2 {

    @Test
    public void findMin() {
        MyStack_Task3_2 stack = new MyStack_Task3_2();
        stack.push(14);
        stack.push(9);
        stack.push(8);
        stack.push(10);

        assertEquals(8, stack.getMin());
        stack.push(7);
        assertEquals(7, stack.getMin());
        stack.pop();
        assertEquals(8, stack.getMin());
    }
}
