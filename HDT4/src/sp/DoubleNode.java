package sp;

/**
 * Andre marroquin
 * @param <T>
 */
public class DoubleNode<T> {

    private T value;
    private DoubleNode<T> next;
    private DoubleNode<T> previous;


    /**
     * Constructor
     * @param value
     */
    public DoubleNode(T value) {
        this.setValue(value);
    }

    /**
     * obtiene el valor
     * @param value
     * @param next
     */

    public T getValue() {
        return value;
    }

    /**
     * setea el valor
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }


    /**
     * obtiene el siguiente
     * @return
     */
    public DoubleNode<T> getNext() {
        return next;
    }

    /**
     * setea el siguiente
     * @param next
     */
    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    /**
     * obtiene el anterior
     * @return
     */
    public DoubleNode<T> getPrevious() {
        return previous;
    }


    /**
     * setea el anterior
     * @param previous
     */
    public void setPrevious(DoubleNode<T> previous) {
        this.previous = previous;
    }

}
