package sp;
/**
 * Andre marroquin
 * @param <T>
 */
public class StackSingleLinkedList<T> extends AbstractStack<T> {

    /**
     * lista enlazada simple
     */
    private SingleLinkedList<T> listaInterna;

    /**
     * constructor
     */
    public StackSingleLinkedList() {
        listaInterna = new SingleLinkedList<T>();
    }

    /**
     * cuenta los elementos
     * @return
     */
    public int count() {
        return listaInterna.count();
    }

    /**
     * verifica si esta vacia
     * @return
     */
    public boolean isEmpty() {
        return listaInterna.isEmpty();
    }

    /**
     * anade al inicio
     * @param item
     */
    public void push(T item) {
        listaInterna.addStart(item);
    }

    /**
     * elimina el primero
     * @return
     */
    public T pull() {
        return listaInterna.removeStart();
    }

    /**
     * muestra el primero
     * @return
     */
    public T peek() {
        return listaInterna.getValue(0);
    }




}