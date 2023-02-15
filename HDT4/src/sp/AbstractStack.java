package sp;

import java.util.ArrayList;

public abstract class AbstractStack<T> implements IStack<T> {

    private ArrayList<T> data;

    public AbstractStack() {
        data = new ArrayList<T>();
    }

    public void push(T item) {
        data.add(item);
    }

    public T pull() {
        if(data.isEmpty()) {
            return null;
        }
        return data.remove(data.size() - 1);
    }

    public T peek() {
        if(data.isEmpty()) {
            return null;
        }
        return data.get(0);
    }

    public int count() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

}
