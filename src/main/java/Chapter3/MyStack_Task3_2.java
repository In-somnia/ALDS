package Chapter3;

import java.util.EmptyStackException;


@SuppressWarnings("WeakerAccess")
public class MyStack_Task3_2 {
    private static class StackNode {
        private int data;
        private StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    private StackNode top;
    private int min;

    public int getMin() {
        return min;
    }

    public int pop() {
        if (top == null) throw new EmptyStackException();

        int item = top.data;
        if (top.data == min) {
            top = top.next;
            min = top.next.data;
            while (!isEmpty()) {
                if (top.data <= min) {
                    min = top.data;
                }
                top = top.next;
            }
        }
        return item;
    }

    public void push(int item) {
        StackNode t = new StackNode(item);
        if (top == null) {
            min = item;
        }
        if (top != null && t.data < top.data) {
            min = t.data;
        }
        t.next = top;
        top = t;
    }
     public boolean isEmpty() {
        return top == null;
     }

     public int peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
     }
}
