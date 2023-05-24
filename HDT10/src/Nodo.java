import java.util.HashMap;
import java.util.Map;
/**
 * @autor: Andre Marroquin
 * HDT 10 FLOYD WARSHALL
 * ESTRUCTURA DE DATOS
 */
public class Nodo {

    /**
     * @param name: Nombre del nodo
     *            tripTimes: Mapa de tiempos de viaje
     */
    private String name;
    private Map<String, Integer[]> tripTimes;

    public Nodo(String name) {
        this.name = name;
        this.tripTimes = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    /**
     * Agrega un tiempo de viaje a un destino
     * @param destino
     * @param tiempos
     */
    public void AgregarDistancia(String destino, Integer[] tiempos) {
        this.tripTimes.put(destino, tiempos);
    }

    /**
     * Retorna el mapa de tiempos de viaje
     * @return
     */
    public Map<String, Integer[]> getTripTimes() {
        return this.tripTimes;
    }
}
