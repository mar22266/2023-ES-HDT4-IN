import sp.StackArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayListTest {

    @org.junit.jupiter.api.Test
    void testPush() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(1,stack.peek());
    }

    @org.junit.jupiter.api.Test
    void testPull() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5,stack.pull());

    }

    @org.junit.jupiter.api.Test
    void peek() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(1);
        stack.push(2);
        assertEquals(1,stack.peek());
    }
}