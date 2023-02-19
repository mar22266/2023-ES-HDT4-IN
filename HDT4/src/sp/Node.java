package sp;

/**
 * @author andre maroquin
 * @param <T>
 */
public class Node<T> {

    /**valor q guarda el nodo
     * @param value
     */
    private T value;
    /**referencia al siguiente nodo
     * @param next
     */
    private Node<T> next;

    /**
     * constructor
     * @param value
     */
    public Node(T value) {
        this.setValue(value);
    }

    /**
     * obtiene vakor
     * @param
     */

    public T getValue() {
        return value;
    }

    /**
     * asigna valor
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }


    /**
     * obtiene referencia del siguiente nodo
     * @return
     */
    public Node<T> getNext() {
        return next;
    }


    /**
     * asigna referencia del siguiente nodo
     * @param next
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

}
