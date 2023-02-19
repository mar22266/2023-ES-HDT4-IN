package sp;

import java.util.Vector;
/**
 * Andre marroquin
 * @param <T>
 */
public class StackVector<T> extends AbstractStack<T> {
    /**
     * vector
     */
    private T[] VECTOR;

    /**
     * constructor
     */
    public StackVector() {
        VECTOR = (T[]) new Object[2];
    }

    /**
     * alarga el vector
     */
    private void alarga(){
        T[] aux = (T[]) new Object[VECTOR.length*2];
        System.arraycopy(VECTOR, 0, aux, 0, VECTOR.length);
        VECTOR = aux;
    }

    /**
     * devuelve el ultimo dato
     * @return
     */
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

    /**
     * anade al inicio
     * @param valor
     */
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

    /**
     * muestra el primero
     * @return
     */
    public T peek(){
        return VECTOR[0];
    }

    /**
     * cuenta los elementos
     * @return
     */
    public int count(){
        return IultimoDato()+1;
    }

    /**
     * verifica si esta vacia
     * @return
     */
    public boolean isEmpty(){
        return VECTOR[0] == null;
    }



    /**
     * elimina el primero
     * @return
     */
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
