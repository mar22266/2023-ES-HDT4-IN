import org.junit.jupiter.api.Test;
import sp.IStack;
import sp.StackVector;

import static org.junit.jupiter.api.Assertions.*;

class StackVectorTest {

    @Test
    void push() {
        IStack<Integer> stack = new StackVector<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.peek());
    }

    @Test
    void peek() {
        IStack<Integer> stack = new StackVector<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.peek());
    }

    @Test
    void count() {
        IStack<Integer> stack = new StackVector<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(0,stack.count());
    }
}