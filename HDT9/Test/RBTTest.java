import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RBTTest {

    /**
     * caso de prubea para metodo add del rbt
     */
    @Test
    void add() {
        RBT<Integer, String> tree = new RBT<>();

        tree.add(1, "A");
        assertEquals("A", tree.get(1));

        tree.add(0, "B");
        assertEquals("B", tree.get(0));


        tree.add(2, "C");
        assertEquals("C", tree.get(2));


        tree.add(2, "D");
        assertEquals("D", tree.get(2));

    }

    /**
     * caso de prueba para el metodo find del rbt
     */
    @Test
    void find() {

        RBT<Integer, String> tree = new RBT<>();
        assertFalse(tree.find(1));

        tree.add(2, "B");
        tree.add(1, "A");
        tree.add(4, "D");
        tree.add(3, "C");
        tree.add(5, "E");

        assertFalse(tree.find(0));
        assertTrue(tree.find(2));
        assertTrue(tree.find(1));
        assertTrue(tree.find(5));
        assertTrue(tree.find(3));
        assertTrue(tree.find(4));
    }
}