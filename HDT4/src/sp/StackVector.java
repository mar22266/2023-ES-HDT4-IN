package sp;

import java.util.Vector;

public class StackVector<T> extends AbstractStack<T> {

    private T[] VECTOR;

    public StackVector() {
        VECTOR = (T[]) new Object[2];
    }

    private void alarga(){
        T[] aux = (T[]) new Object[VECTOR.length*2];
        System.arraycopy(VECTOR, 0, aux, 0, VECTOR.length);
        VECTOR = aux;
    }

    private int IultimoDato(){
        int i = 0;
        for (int e = 0; e < VECTOR.length; e++) {
            if(VECTOR[e] == null){
                i = i-1;
                return i;

            }
        }
        return VECTOR.length-1;
    }

    public void push(T valor){
        if(!isEmpty())
            if(IultimoDato() == VECTOR.length-1) {
                alarga();
            }
            else {
                System.arraycopy(VECTOR, 0, VECTOR, 0, VECTOR.length - 1);
            }
        VECTOR[0] = valor;
    }

    @Override
    public T pop() {
        return null;
    }

    public T peek(){
        return VECTOR[0];
    }

    public int count(){
        return IultimoDato()+1;
    }

    public boolean isEmpty(){
        return VECTOR[0] == null;
    }

    @Override
    public int size() {
        return 0;
    }

    public T pull(){
        T aux = VECTOR[0];
        if (IultimoDato()==VECTOR.length-1){
            alarga();
        }
        else{
            System.arraycopy(VECTOR, 1, VECTOR, 0, VECTOR.length-1);
        }
        return aux;
    }

}
