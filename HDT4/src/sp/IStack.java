package sp;

public interface IStack<T> {

    void push(T data);

    T peek();

    boolean isEmpty();

    int count();

    T pull();

}
