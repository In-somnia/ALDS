package Chapter3;

import java.util.EmptyStackException;


@SuppressWarnings("WeakerAccess")
public class MyStack_Task3_2 {
    private static class StackNode {
        private int data;
        private int min;
        private StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    private StackNode top;

    @SuppressWarnings("UnusedReturnValue")
    public int pop() {
        if (top == null) throw new EmptyStackException();
        int item = top.data;
        top = top.next;
        return item;
    }

    public void push(int item) {
        StackNode t = new StackNode(item);
        if (top == null) {
            t.min = item;
        }
        if (top != null && t.data < top.data) {
            t.min = t.data;
        } else if (top != null && t.data > top.data) {
            t.min = top.data;
        }
        t.next = top;
        top = t;
    }

    public int min() {
        if (top == null) throw new EmptyStackException();
        return top.min;
    }
}
