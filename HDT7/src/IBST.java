import java.util.ArrayList;

/**
 *@Author: Andre Marroquin and MAAG
 * Estructuras de datos Hoja de trabajo 7
 */
public interface IBST<K,V> {

    /**
     * Metodo que inserta un valor en el arbol
     * @param key
     * @param value
     */
    void insert(K key, V value);

    /**
     * Metodo que busca un valor en el arbol
     * @param key
     * @return
     */
    V find(K key);

    /**
     * Metodo que elimina un valor en el arbol
     * @param key
     * @return
     */
    V delete(K key);

    /**
     * Metodo que retorna el numero de elementos en el arbol
     * @return
     */
    int count();

    /**
     * Metodo que retorna si el arbol esta vacio
     * @return
     */

    boolean isEmpty();

    /**
     * Metodo que retorna los elementos del arbol
     * @return
     */
    ArrayList<V> getElements();

}
