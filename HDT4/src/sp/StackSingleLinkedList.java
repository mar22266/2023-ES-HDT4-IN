package sp;

public class StackSingleLinkedList<T> extends AbstractStack<T> {

    private SingleLinkedList<T> listaInterna;

    public StackSingleLinkedList() {
        listaInterna = new SingleLinkedList<T>();
    }


    public int count() {
        return listaInterna.count();
    }

    public boolean isEmpty() {
        return listaInterna.isEmpty();
    }

    public void push(T item) {
        listaInterna.addStart(item);
    }

    public T pull() {
        return listaInterna.removeStart();
    }

    public T peek() {
        return listaInterna.getValue(0);
    }




}