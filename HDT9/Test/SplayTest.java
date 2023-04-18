import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplayTest {

    /**
     * caso de prueba para el metodo add del splay
     */
    @Test
    void add() {
        Splay<Integer, String> tree = new Splay<>();

        tree.add(1, "A");
        tree.add(2, "B");
        tree.add(3, "C");
        assertTrue(tree.find(1));
        assertEquals("A", tree.get(1));
        assertTrue(tree.find(2));
        assertEquals("B", tree.get(2));
        assertTrue(tree.find(3));
        assertEquals("C", tree.get(3));
        tree.add(2, "D");
        assertTrue(tree.find(2));
        assertEquals("D", tree.get(2));
    }

    /**
     * caso de prueba para el metodo find del splay
     */
    @Test
    void find() {
        Splay<Integer, String> tree = new Splay<>();

        tree.add(1, "A");
        tree.add(2, "B");
        tree.add(3, "C");
        assertTrue(tree.find(1));
        assertTrue(tree.find(2));
        assertTrue(tree.find(3));

        assertFalse(tree.find(4));
    }
}