/**
 *@Author: Andre Marroquin
 * Estructuras de datos Hoja de trabajo 7
 */
public class Association<K,V> {

    /**
     * Atributos de la clase Association
     */
    private K key;
    private V value;
    private Association<K,V> izquierda;
    private Association<K,V> derecha;
    private Association<K,V> padre;

    /**
     * Constructor de la clase Association
     * @param key llave
     * @param value valor
     */
    public Association(K key, V value){
        this.key = key;
        this.value = value;
        izquierda = derecha= padre = null;
    }

    /**
     * Metodo que retorna la llave
     * @return
     */
    public K getKey() {
        return key;
    }

    /**
     * Metodo que cambia la llave
     * @param key
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * Metodo que retorna el valor
     * @return
     */
    public V getValue() {
        return value;
    }

    /**
     * Metodo que cambia el valor
     * @param value
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    public Association<K, V> getIzquierda() {
        return izquierda;
    }

    /**
     *  Metodo que cambia el hijo izquierdo
     * @param izquierda
     */
    public void setIzquierda(Association<K, V> izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * Metodo que retorna el hijo derecho
     * @return
     */
    public Association<K, V> getDerecha() {
        return derecha;
    }

    /**
     * Metodo que cambia el hijo derecho
     * @param derecha
     */
    public void setDerecha(Association<K, V> derecha) {
        this.derecha = derecha;
    }

    /**
     * Metodo que retorna el padre
     * @return
     */
    public Association<K, V> getPadre() {
        return padre;
    }

    /**
     * Metodo que cambia el padre
     * @param padre
     */
    public void setPadre(Association<K, V> padre) {
        this.padre = padre;
    }
}
