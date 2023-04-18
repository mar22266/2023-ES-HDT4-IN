import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Andre marroquin, 22266
 * HDT 9 - Estructura de datos
 * clase de hashmap
 * @param <K>
 * @param <V>
 */

public class HashMapa<K,V> implements Map,IMap<K,V> {

    /**
     * Clase que crea un hashmap
     */
    public HashMap<Object,Object> map;

    public HashMapa(){
        map = new HashMap<Object,Object>();
    }

    public int size(){
        return map.size();
    }

    /**
     * Compara si el hashmap esta vacio
     * @return
     */
    public boolean isEmpty() {
        return map.isEmpty();
    }

    /**
     * Compara si el hashmap contiene una llave
     * @param key
     * @return
     */
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    /**
     * Compara si el hashmap contiene un valor
     * @param value
     * @return
     */
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }


    /**
     * obtiene un valor del hashmap
     * @param key
     * @return
     */
    public Object get(Object key) {
        return map.get(key);
    }

    /**
     * agrega un valor al hashmap
     * @param key
     * @param value
     * @return
     */
    public Object put(Object key, Object value) {
        return map.put(key,value);
    }

    /**
     * remueve un valor del hashmap
     * @param key
     * @return
     */
    public Object remove(Object key) {
        return map.remove(key);
    }

    /**
     * agrega un valor al hashmap
     * @param m
     */
    public void putAll(Map m) {
        map.putAll(m);
    }

    /**
     * limpia el hashmap
     */
    public void clear() {
        map.clear();
    }

    /**
     * obtiene las llaves del hashmap
     * @return
     */
    public Set keySet() {
        return map.keySet();
    }

    /**
     * obtiene los valores del hashmap
     * @return
     */
    public Collection values() {
        return map.values();
    }

    /**
     * obtiene las entradas del hashmap
     * @return
     */
    public Set<Entry<Object,Object>> entrySet() {
        return map.entrySet();
    }

    /**
     * agrega un valor al hashmap
     * @param key
     * @param Valor
     */
    @Override
    public void add(K key, V Valor) {
        map.put(key,Valor);
    }

    /**
     * obtiene un valor del hashmap y lo busca
     * @param key
     * @return
     */
    @Override
    public boolean find(K key) {
        return map.containsKey(key);
    }

}
