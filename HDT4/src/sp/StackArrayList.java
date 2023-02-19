package sp;

import java.util.ArrayList;

public class StackArrayList<T> extends AbstractStack<T>{

    private ArrayList<T> data;

    public StackArrayList() {
        data = new ArrayList<T>();
    }

    public void push(T item) {
        data.add(item);
    }

    public T pull() {
        if(data.isEmpty()) {
            return null;
        }
        return data.remove(0);
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
