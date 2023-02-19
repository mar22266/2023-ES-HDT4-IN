package sp;

import java.util.ArrayList;
/**
 * Andre marroquin
 * @param <T>
 */
public class StackArrayList<T> extends AbstractStack<T>{

    /**
     * arraylist data
     */
    private ArrayList<T> data;

    /**
     * constructor
     */
    public StackArrayList() {
        data = new ArrayList<T>();
    }

    /**
     * anade al inicio
     * @param item
     */
    public void push(T item) {
        data.add(item);
    }

    /**
     * elimina el primero
     * @return
     */
    public T pull() {
        if(data.isEmpty()) {
            return null;
        }
        return data.remove(0);
    }

    /**
     * muestra el primero
     * @return
     */
    public T peek() {
        if(data.isEmpty()) {
            return null;
        }
        return data.get(0);
    }

    /**
     * muestra el ultimo
     * @return
     */
    public int count() {
        return data.size();
    }

    /**
     * verifica si esta vacio
     * @return
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }
 
}
