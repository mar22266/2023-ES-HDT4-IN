package sp;

import java.util.Scanner;
/**
 * Andre marroquin
 * @param <T>
 */
public class StackFactroy<T> {
    /**
     * Stack crada
     */
    private IStack<T> stack;

    /**
     * Da la opcion de crear una pila distinto patron factory
     * @param im
     */
    public StackFactroy(int im) {
        if (im ==1) {
            stack = new StackVector<>();
        } else if (im ==2) {
            stack = new StackArrayList<>();
        } else if (im ==3) {
            stack = new StackSingleLinkedList<>();
        } else if (im ==4) {
            stack = new StackDoubleLinkedList<>();
        } else {
            System.out.println("Opcion no valida");

        }
    }

    /**
     * retorna la pila creada
     * @return
     */
    public IStack<T> getInstance() {
        return stack;
    }
}
