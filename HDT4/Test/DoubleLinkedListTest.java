import org.junit.jupiter.api.Test;
import sp.DoubleLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    @Test
    void addStart() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addStart(1);
        list.addStart(2);
        list.addStart(3);
        list.addStart(4);
        list.addStart(5);
        assertEquals(5,list.getValue(0));
    }

    @Test
    void removeStart() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addStart(1);
        list.addStart(2);
        list.addStart(3);
        list.addStart(4);
        list.addStart(5);
        list.removeStart();
        assertEquals(4,list.getValue(0));
    }

    @Test
    void count() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addStart(1);
        list.addStart(2);
        list.addStart(3);
        list.addStart(4);
        list.addStart(5);
        assertEquals(0,list.count());
    }
}