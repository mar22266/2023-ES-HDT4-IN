package sp;

public abstract class AbstractList<T> implements IList<T> {

    public abstract class List<E> {

        private SingleLinkedList<T> listaInterna;
        public void AbstractList() {
            listaInterna = new SingleLinkedList<T>();
        }

        public int count() {
            return listaInterna.Count();
        }


        public boolean isEmpty() {
            return listaInterna.IsEmpty();
        }


        public void push(T value) {
            listaInterna.InsertAtStart(value);
        }


        public T pull() {
            return listaInterna.Delete(0);
        }


        public T peek() {
            return listaInterna.Get(0);
        }

    }
}