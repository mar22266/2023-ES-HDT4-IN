package sp;

public interface IList<T> {

    void addStart(T data);

    void addEnd(T data);

    void add(T data, int index);

    T removeStart();
    T removeEnd();

    T remove(int index);

    T getValue(int index);

    int count();

    boolean isEmpty();
}
