import static org.junit.jupiter.api.Assertions.*;

class HashMapaTest {

    /**
     * caso de prueba para el metodo add del hashmapa
     */
    @org.junit.jupiter.api.Test
    void add() {
        HashMapa<Integer, String> map = new HashMapa<>();
        map.add(1, "A");
        assertTrue(map.containsKey(1));
        assertEquals("A", map.get(1));
        map.add(2, "B");
        assertTrue(map.containsKey(2));
        assertEquals("B", map.get(2));
    }


    /**
     * caso de prueba para el metodo find del hashmapa
     */
    @org.junit.jupiter.api.Test
    void find() {
        HashMapa<Integer, String> map = new HashMapa<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        assertTrue(map.find(1));
        assertTrue(map.find(2));
        assertTrue(map.find(3));
        assertFalse(map.find(4));
    }
}