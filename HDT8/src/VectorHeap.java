// An implementation of a priority queue in a vector.
// (c) 1998, 2001, 2002 duane a. bailey

import java.util.Vector;

/**
 * @version $Id: VectorHeap.java 22 2006-08-21 19:27:26Z bailey $
 * @author, 2001 duane a. bailey
 * ""Clase VectorHeap utlizada del libro de estructuras de datos y algoritmos bailey""
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>
{
    /**
     *  crea vector de datos
     */
    protected Vector<E> data;

    /**
     * Construye un nuevo priority queue
     */
    public VectorHeap()
    {
        data = new Vector<E>();
    }

    /**
     * Construye un nuevo priority queue con un vector dado
     * @param v
     */
    public VectorHeap(Vector<E> v)
    {
        int i;
        data = new Vector<E>(v.size());
        for (i = 0; i < v.size(); i++)
        {
            add(v.get(i));
        }
    }


    /**
     * padre del priority queue
     * @param i
     * @return
     */
    protected static int parent(int i)
    {
        return (i-1)/2;
    }

    /**
     * Hijo izquierdo del priority queue
     * @param i
     * @return
     */
    protected static int left(int i)
    {
        return 2*i+1;
    }

    /**
     * Hijo derecho del priority queue
     * @param i
     * @return
     */
    protected static int right(int i)
    {
        return 2*(i+1);
    }

    /**
     * obtiene el valor hacia arriba en el priority queue
     * @return
     */
    public E getFirst()
    {
        return data.get(0);
    }

    /**
     * remueve el valor del priority queue
     * @return
     */
    public E remove()
    {
        E minVal = getFirst();
        data.set(0,data.get(data.size()-1));
        data.setSize(data.size()-1);
        if (data.size() > 1) pushDownRoot(0);
        return minVal;
    }

    /**
     *  agrega el valor al priority queue
     * @param value
     */
    public void add(E value)
    {
        data.add(value);
        percolateUp(data.size()-1);
    }

    /**
     * verifica si el priority queue esta vacio
     * @return
     */
    public boolean isEmpty()
    {
        return data.size() == 0;
    }

    /**
     * mueve el valor hacia arriba en el priority queue
     * @param leaf
     */
    protected void percolateUp(int leaf)
    {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 &&
          (value.compareTo(data.get(parent)) < 0))
        {
            data.set(leaf,data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf,value);
    }

    /**
     * mueve el valor hacia abajo en el priority queue
     * @param root
     */
    protected void pushDownRoot(int root)
    {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize)
            {
                if ((right(root) < heapSize) &&
                  ((data.get(childpos+1)).compareTo
                   (data.get(childpos)) < 0))
                {
                    childpos++;
                }

                if ((data.get(childpos)).compareTo
                    (value) < 0)
                {
                    data.set(root,data.get(childpos));
                    root = childpos;
                } else {
                    data.set(root,value);
                    return;
                }
            } else {
                data.set(root,value);
                return;
            }       
        }
    }

    /**
     * Verifica el tamano del priority queue
     * @return
     */
    public int size()
    {
        return data.size();
    }

    /**
     * Limpia el priority queue
     */
    public void clear()
    {
        data.clear();
    }

    /**
     * Convierte el priority queue a un string
     * @return
     */
    public String toString()
    {
        return "<VectorHeap: "+data+">";
    }
}
