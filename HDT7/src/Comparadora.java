/**
 *@Author: Andre Marroquin
 * Estructuras de datos Hoja de trabajo 7
 */
import java.util.Comparator;
public class Comparadora<K> implements Comparator<K> {

    @Override
    public int compare(K o1, K o2) {
        String x = o1.toString();
        String y = o2.toString();
        return x.compareTo(y);
    }
}
