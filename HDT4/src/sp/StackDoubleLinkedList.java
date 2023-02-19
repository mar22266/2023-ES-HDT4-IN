package sp;

public class StackDoubleLinkedList<T> extends AbstractStack<T> {

    private DoubleLinkedList<T> listaInterna;

    public StackDoubleLinkedList() {
        listaInterna = new DoubleLinkedList<T>();
    }


    public int count() {
        return listaInterna.Count();
    }


    public boolean isEmpty() {
        return listaInterna.IsEmpty();
    }


    public void push(T value) {
        listaInterna.addStart(value);
    }



    public T pull() {
        return listaInterna.removeStart();
    }


    public T peek() {
        return listaInterna.getValue(0);
    }




}
