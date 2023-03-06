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
    public Map<K, V> getMap(String option) throws Exception {
        if (option.equalsIgnoreCase("HashMap")) {
            return new HashMap<K, V>();
        } else if (option.equalsIgnoreCase("TreeMap")) {
            return new TreeMap<K,V>();
        } else if(option.equalsIgnoreCase("LinkedHashMap")) {
            return new LinkedHashMap<K,V>();
        } else {
            throw new Exception("Option no valida.");
        }
    }

}
