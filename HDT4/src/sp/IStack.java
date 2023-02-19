package sp;

/**
 * Andre marroquin
 * @param <T>
 */
public interface IStack<T> {
    /**
     * Pushes an item onto the top of this stack.
     * @param data
     */
    void push(T data);

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * @return
     */
    T peek();

    /**
     * Tests if this stack is empty.
     * @return
     */
    boolean isEmpty();

    /**
     * Returns the 1-based position where an object is on this stack.
     * @param
     * @return
     */
    int count();

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @return
     */
    T pull();

}
