package sp;

public interface IList<T> {

    public void addStart(T data);

    public void addEnd(T data);

    public void add(T data, int index);

    public void removeStart();

    public void removeEnd();

    public void remove(int index);

    public T get(int index);

    public int count();

    public boolean isEmpty();
}
