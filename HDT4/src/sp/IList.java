package sp;

/**
 * andre marroquin
 * @param <T>
 */
public interface IList<T> {

    /**
     * anade data al incio de la lista
     * @param data
     */
    void addStart(T data);

    /**
     * anade data al final de la lista
     * @param data
     */
    void addEnd(T data);

    /**
     * anade data en la posicion index
     * @param data
     * @param index
     */
    void add(T data, int index);

    /**
     * remueve el primer elemento de la lista
     * @return
     */

    T removeStart();

    /**
     * remueve el ultimo elemento de la lista
     * @return
     */
    T removeEnd();

    /**
     * remueve el elemento en la posicion index
     * @param index
     * @return
     */
    T remove(int index);

    /**
     * retorna el elemento en la posicion index
     * @param index
     * @return
     */
    T getValue(int index);

    /**
     * retorna el indice del elemento data
     * @param
     * @return
     */

    int count();
    /**
     * retorna el numero de elementos en la lista
     * @return
     */
    boolean isEmpty();
}
