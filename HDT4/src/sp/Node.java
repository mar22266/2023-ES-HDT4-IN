package sp;

public class Node<T> {

    private T value; //Valor a guardar
    private Node<T> next; //Nodo siguiente


    public Node(T value) {
        this.setValue(value);
    }


    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }


    public Node<T> getNext() {
        return next;
    }


    public void setNext(Node<T> next) {
        this.next = next;
    }

}
