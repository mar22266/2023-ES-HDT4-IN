package sp;

public abstract class AbstractList<T> implements IList<T> {

    public abstract class List<E> {

        private SingleLinkedList<T> listaInterna;
        public void AbstractList() {
            listaInterna = new SingleLinkedList<T>();
        }

        public int count() {
            return listaInterna.count();
        }


        public boolean isEmpty() {
            return listaInterna.isEmpty();
        }


        public void push(T value) {
            listaInterna.addStart(value);
        }


        public T pull() {
            return listaInterna.remove(0);
        }


        public T peek() {
            return listaInterna.getValue(0);
        }

        public void addStart(T data) {
            listaInterna.addStart(data);
        }





    }
}