package sp;

import java.util.ArrayList;
/**
 * Andre marroquin
 * hdt4
 * @param <T>
 */
public abstract class AbstractStack<T> implements IStack<T> {

        /**
         * agrega al principio
         * @param value
         */
        public void push(T item) {

        }
        /**
         * quita el primer elemento
         * @return T
         */
        public T pull() {
                return null;
        }

        /**
         * quita el ultimo elemento
         * @return T
         */
        public T peek() {
                return null;
        }

        /**
         * quita el elemento en la posicion indicada
         * @param index
         * @return T
         */
        public int count() {
                return 0;
        }

        /**
         * retorna si esta vacia
         * @return boolean
         */
        public boolean isEmpty() {
                return false;
        }


}
