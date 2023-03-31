// An interface for an ordered structure that allows you to remove min elts
// (c) 1998, 2001 duane a. bailey

// ideally this would extend linear, but there are problems....
/**
 * @version $Id: PriorityQueue.java 22 2006-08-21 19:27:26Z bailey $
 * @author, 2001 duane a. bailey
 * ""Clase VectorHeap utlizada del libro de estructuras de datos y algoritmos bailey""
 */
public interface PriorityQueue<E extends Comparable<E>>
{
    /**
     * obtiene el primer elemento de la cola
     * @return
     */
    public E getFirst();

    /**
     * quita un valor de el priority queue
     * @return
     */
    public E remove();

   /*
    * Agrega un valor al priority queue
    */
    public void add(E value);

    /**
     * determina si el priority queue esta vacio
     * @return
     */
    public boolean isEmpty();

    /**
     * obtiene el tamaño del priority queue
     * @return
     */
    public int size();

    /**
     * limpia el priority queue
     */
    public void clear();
}
