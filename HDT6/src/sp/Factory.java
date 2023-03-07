package sp;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author Andre Marroquin
 * HDT 6
 * Algoritmos y estructuras de datos
 */
public class Factory<K, V> {
    public Map<K, V> getMap (int option) throws Exception {
        if (option == 1) {
            return new HashMap<K, V>();

        } else if (option == 2) {
            return new TreeMap<K,V>();

        } else if (option == 3) {
            return new LinkedHashMap<K,V>();

        } else {
            throw new Exception("Opcion invalida.");
        }
    }

}
