import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NodoTest {

    /**
     * test de la clase nodo y sus metodos
     */
    @Test
    void TestMetodos() {
        Nodo ciudad = new Nodo("NY");
        assertEquals("NY", ciudad.getName());

        Integer[] times = new Integer[]{10, 15, 20, 50};
        ciudad.AgregarDistancia("LA", times);

        Map<String, Integer[]> tiemposViaje = ciudad.getTripTimes();
        assertArrayEquals(times, tiemposViaje.get("LA"));
}
}