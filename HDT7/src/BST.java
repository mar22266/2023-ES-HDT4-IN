import java.util.ArrayList;
import java.util.Comparator;

/**
 *@Author: Andre Marroquin and MAAG, Internet
 * Estructuras de datos Hoja de trabajo 7
 */
public class BST<K,V> implements IBST<K,V>{

    /**
     * Atributos del binary search tree
     */
    private Association<K,V> raiz;
    private Comparator<K> comparador;
    private int contador;

    /**
     * Constructor del binary search tree
     * @param comparador comparadora de llaves
     */
    public BST(Comparator<K> comparador){
        this.comparador = comparador;
        contador = 0;
        raiz = null;
    }

    /**
     * Metodo que inserta un valor en el arbol
     * @param key
     * @param value
     */
    @Override
    public void insert(K key, V value) {
        if (isEmpty()){
            raiz = new Association<K,V>(key,value);
            contador++;
        }
        else{
            internalInsert(raiz,key,value);
        }

    }

    /**
     * Metodo que inserta un valor adentro en el arbol
     * @param actual valor actual
     * @param key llave
     * @param value valor
     */
    private void internalInsert(Association<K, V> actual, K key, V value) {
        int result = comparador.compare(actual.getKey(),key);
        /**
         * Si el resultado es mayor a 0, se inserta a la izquierda
         */
        if (result > 0) {
            if (actual.getIzquierda() == null) {
                Association<K, V> newNode = new Association<K, V>(key, value);
                actual.setIzquierda(newNode);
                newNode.setPadre(actual);
                 contador++;
            }
            else {
                internalInsert(actual.getIzquierda(), key, value);
            }
            /**
             * Si el resultado es menor a 0, se inserta a la derecha
             */
        } else if (result < 0) {
            if (actual.getDerecha() == null) {
                Association<K, V> newNode = new Association<K, V>(key, value);
                actual.setDerecha(newNode);
                newNode.setPadre(actual);
                contador++;
            } else {
                internalInsert(actual.getDerecha(), key, value);
            }
        }

    }

    /**
     * Metodo que realiza la busqueda de un valor en el arbol
     * @param key
     * @return
     */
    public V find(K key) {
        return internalFind(raiz,key);
    }

    /**
     * Metodo que realiza la busqueda de un valor en el arbol
     * @param actual
     * @param key
     * @return
     */
    private V internalFind(Association<K, V> actual, K key) {
        if (actual != null) {
            int result = comparador.compare(actual.getKey(), key);

            if (result > 0) {
                return internalFind(actual.getIzquierda(), key);
            } else if (result < 0) {
                return internalFind(actual.getDerecha(), key);
            } else {
                return actual.getValue();
            }

        } else {
            return null;
        }
    }


    /**
     * Metodo que retorna el numero de elementos del arbol
     * @return
     */
    public int count() {
        return contador;
    }

    /**
     * Metodo que verifica si el arbol esta vacio
     * @return
     */
    public boolean isEmpty() {
        return contador == 0;
    }


    /**
     * Metodo que retorna los elementos del arbol
     * @return lista de elementos
     */
    public ArrayList<V> getElements() {
        ArrayList<V> list = new ArrayList<V>();

        internalGetElements(list, raiz);

        return list;
    }

    /**
     * Metodo que retorna los elementos del arbol
     * @param list lista de elementos
     * @param actual valor actual
     */
    private void internalGetElements(ArrayList<V> list, Association<K, V> actual) {
        if (actual != null) {
            internalGetElements(list, actual.getIzquierda());

            list.add((V)(actual.getKey() + "=" + actual.getValue()));

            internalGetElements(list, actual.getDerecha());
        }
    }
}
