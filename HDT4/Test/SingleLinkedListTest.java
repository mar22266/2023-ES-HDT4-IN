import org.junit.jupiter.api.Test;
import sp.SingleLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SingleLinkedListTest {

    @Test
    void addStart() {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addStart(1);
        list.addStart(2);
        list.addStart(3);
        list.addStart(4);
        list.addStart(5);
        assertEquals(5,list.getValue(0));

    }



    @Test
    void remove() {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addStart(1);
        list.addStart(2);
        list.addStart(3);
        list.addStart(4);
        list.addStart(5);
        list.remove(0);
        assertEquals(4,list.getValue(0));
    }
}