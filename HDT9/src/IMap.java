/**
 * @author Andre marroquin, 22266
 * HDT 9 - Estructura de datos
 */
public interface IMap<K, V> {

    /**
     * Agrega un valor al hashmap
     * @param key
     * @param value
     */
    void add(K key, V value);

    /**
     * obtiene un valor del hashmap
     * @param key
     * @return
     */
    V get(K key);

    /**
     * verifica si se encuentra un valor
     * @param key
     * @return
     */
    boolean find(K key);
}
