import java.util.Collection;
import java.util.Map;
import java.util.Set;
/**
 * @author Andre marroquin, 22266
 * HDT 9 - Estructura de datos
 */
/**
 * clase de hashingMap, contiene un hashmap creado y la implemetacion de otros metodos de java util
 * @param <K> Tipo a almacenar
 * @param <V> Tipo a almacenar
 * @param <K>
 * @param <V>
 */
public class HashMap<K,V> implements IMap<K,V>, Map {

    /**
     * instancia de hashmap
     */
    public HashMap<Object, Object> dictionary;

    /**
     * Constructor de hashmap
     */
    public HashMap() {
        dictionary = new HashMap<>();
    }

    /**
     * Agrega un valor al hashmap
     * @param key
     * @param value
     */
    @Override
    public void add(K key, V value) {
      dictionary.insert(key, value);
    }

    /**
     * inserta un valor al hashmap
     * @param key
     * @param value
     * @return
     */
    public Object insert(Object key, Object value) {
        return dictionary.insert(key,value);
    }

    /**
     * verifica si se encuentra un valor
     * @param key
     * @return
     */
    @Override
    public boolean find(K key) {
        return dictionary.containsKey(key);
    }

    /**
     * retorna el largo del hasmmapp
     * @return
     */
    @Override
    public int size() {
        return dictionary.size();
    }

    /**
     * verifica si es empty
     * @return
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * verifica si contiene una llave
     * @param key key whose presence in this map is to be tested
     * @return
     */
    @Override
    public boolean containsKey(Object key) {
        return dictionary.containsKey(key);
    }

    /**
     * verifica si contiene un valor
     * @param value value whose presence in this map is to be tested
     * @return
     */
    @Override
    public boolean containsValue(Object value) {
        return dictionary.containsValue(value);
    }

    /**
     * retorna el valor de la llave
     * @param key the key whose associated value is to be returned
     * @return
     */
    @Override
    public Object get(Object key) {
        return dictionary.get(key);
    }

    /**
     * inserta un valor al hashmap
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return
     */
    @Override
    public Object put(Object key, Object value) {
        return dictionary.put(key, value);
    }

    /**
     * remueve un valor del hashmap
     * @param key key whose mapping is to be removed from the map
     * @return
     */
    @Override
    public Object remove(Object key) {
        return dictionary.remove(key);
    }

    /**
     * inserta todos los valores del hashmap
     * @param m mappings to be stored in this map
     */
    @Override
    public void putAll(Map m) {
        dictionary.putAll(m);
    }

    /**
     * limpia el hashmap
     */
    @Override
    public void clear() {
        dictionary.clear();
    }
    /**
     * retorna las llaves del hashmap
     * @return
     */
    @Override
    public Set keySet() {
        return dictionary.keySet();
    }

    /**
     * retorna los valores del hashmap
     * @return
     */
    @Override
    public Collection values() {
        return dictionary.values();
    }

    /**
     * retorna las entradas del hashmap
     * @return
     */
    @Override
    public Set<Entry> entrySet() {
        return dictionary.entrySet();
    }
}
