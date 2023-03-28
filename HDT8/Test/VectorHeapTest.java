import static org.junit.jupiter.api.Assertions.*;

class VectorHeapTest {

    /**
     * metodo de prueba para el metodo remove del VectorHeap
     */
    @org.junit.jupiter.api.Test
    void remove() {
        VectorHeap<Integer> heap = new VectorHeap<Integer>();
        heap.add(5);
        heap.add(3);
        heap.add(8);
        heap.add(2);
        heap.add(6);
        assertEquals(2,heap.remove());
        assertEquals(3, heap.getFirst());
        assertEquals(4, heap.size());

    }

    /**
     * metodo de prueba para el metodo ADD del VectorHeap
     */
    @org.junit.jupiter.api.Test
    void add() {
        VectorHeap<Integer> heap = new VectorHeap<Integer>();
        heap.add(5);
        heap.add(3);
        heap.add(8);
        heap.add(2);
        heap.add(6);
        assertEquals(5, heap.size());
        assertEquals(2, heap.getFirst());

    }
}