package sp;
/**
 * Andre marroquin
 * @param <T>
 */
public class StackDoubleLinkedList<T> extends AbstractStack<T> {

    /**
     * lista doblemente enlazada
     */
    private DoubleLinkedList<T> listaInterna;

    /**
     * constructor
     */
    public StackDoubleLinkedList() {
        listaInterna = new DoubleLinkedList<T>();
    }


    /**
     * cuenta los elementos
     * @return
     */
    public int count() {
        return listaInterna.Count();
    }


    /**
     * verifica si esta vacia
     * @return
     */
    public boolean isEmpty() {
        return listaInterna.IsEmpty();
    }

    /**
     * anade al inicio
     * @param value
     */
    public void push(T value) {
        listaInterna.addStart(value);
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
