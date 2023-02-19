package sp;

import java.util.Scanner;

public class StackFactroy<T> {

    private IStack<T> stack;

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

    public IStack<T> getInstance() {
        return stack;
    }
}
