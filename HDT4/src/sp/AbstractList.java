package sp;

/**
 * Andre marroquin
 * hdt4
 * @param <T>
 */
public abstract class AbstractList<T> implements IList<T> {

    
    /** agrega al principio
     * @param value
     */
    public void addStart(T value) {

    }

    
    /** agrega al final 
     * @param value
     */
    public void addEnd(T value) {

    }


    
    /** agrega al final el valor en la posicion indicada
     * @param value
     * @param index
     */
    public void add(T value, int index) {

    }

    
    /** quita el primer elemento
     * @return T
     */
    public T removeStart() {
        return null;
    }


    
    /** quita el ultimo elemento
     * @return T
     */
    public T removeEnd() {
        return null;
    }

    /** quita el elemento en la posicion indicada
     * @param index
     * @return T
     */
    public T remove(int index) {
        return null;
    }

    /** retorna el valor en la posicion indicada
     * @param index
     * @return T
     */
    public T getValue(int index) {
        return null;
    }

    /** retorna true si la lista esta vacia
     * @return boolean
     */
    public int count() {
        return 0;
    }


}