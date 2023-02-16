package sp;

public interface IList<T> {

    public void addStart(T data);

    public void addEnd(T data);

    public void add(T data, int index);

    T removeStart();
    T removeEnd();

    T remove(int index);

    public T getValue(int index);

    public int count();

    public boolean isEmpty();
}
