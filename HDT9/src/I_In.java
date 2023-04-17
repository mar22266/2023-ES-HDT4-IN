/**
 * @author Andre marroquin, 22266
 * HDT 9 - Estructura de datos
 */
public interface I_In<K,V> {

    /**
     * Compara si dos objetos son iguales
     * @param o
     * @return
     */
    public boolean equeals (Object o);

    /**
     * obtiene la llave
     * @return
     */
    public K getKey();

    /**
     * obtiene el valor
     * @return
     */
    public V getValue();

    /**
     * obtiene el hashcode
     * @return
     */
    public int hashCode();

    /**
     * agrega un valor al hashmap
     * @param value
     * @return
     */
    public V setValue(V value);

}
