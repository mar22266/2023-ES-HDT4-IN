package sp;

public class SingleLinkedList<T> extends AbstractList<T>{
    private int cont;
    private Node<T> top;
    private Node<T> bottom;


    public void addStart(T value){

        Node<T> nuevo = new Node<T>(value);

        if (isEmpty()){
            top = nuevo;
            bottom = nuevo;
        }
        else{
            nuevo.setNext(top);
            top = nuevo;
        }
        cont++;
    }

    public void addEnd(T value){

        Node<T> nuevo = new Node<T>(value);

        if (isEmpty()){
            top = nuevo;
            bottom = nuevo;
        }
        else{
            bottom.setNext(nuevo);
            bottom = nuevo;
        }
        cont++;
    }

    public void add(T value, int pos) {

        if (isEmpty()) {
            addStart(value);
        } else if (pos == 0) {
            addStart(value);
        } else if ((pos > 0) && (pos < count())) {
            Node<T> newNode = new Node<T>(value);
            Node<T> pretemp = top;
            Node<T> temp = top.getNext();
            int i = 1;

            while ((temp != null) && (i < pos)) {
                pretemp = temp;
                temp = temp.getNext();
                i++;
            }

            //Se inserta el nodo
            newNode.setNext(temp);
            pretemp.setNext(newNode);
            cont++;

        }
    }


    public T remove(int index) {

        if (index == 0)
        {
           return removeStart();
        }
        else if (index == (count() - 1))
        {
            return removeEnd();
        }
        else if ((index > 0) && (index < (count() - 1)))
        {
            Node<T> pretemp = top;
            Node<T> temp = top.getNext();
            int i = 1;


            while ((temp != null) && (i < (count() - 1)))
            {
                pretemp = temp;
                temp = temp.getNext();
                i++;
            }


            pretemp.setNext(temp.getNext());
            cont--;
            return temp.getValue();
        }
        else
        {
            return null;
        }
    }

    public T Get(int index) {

        if (!isEmpty())
        {
            if (index == 0)
            {
                return top.getValue();
            }
            else if (index == (count() - 1))
            {
                return bottom.getValue();
            }
            else if ((index > 0) && (index < (count() - 1)))
            {
                Node<T> temp = top;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                {
                    return temp.getValue();
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }

        return null;
    }

    public T removeStart() {

        if (!isEmpty())
        {
            Node<T> temp = top;
            top = top.getNext();
            cont--;
            return temp.getValue();
        }

        return null;
    }

    public T removeEnd() {
        if (!isEmpty())
        {

            if (count() == 1)
            {
                Node<T> temp = top;
                top = null;
                bottom = null;
                cont--;
                return temp.getValue();
            }
            else
            {
                Node<T> pretemp = top;
                Node<T> temp = top.getNext();


                while (temp != null)
                {
                    pretemp = temp;
                    temp = temp.getNext();
                }


                bottom = pretemp;
                bottom.setNext(null);
                cont--;
                return temp.getValue();
            }

        }

        return null;
    }
    public T getValue(int index) {

        if (!isEmpty())
        {
            if (index == 0)
            {
                return top.getValue();
            }
            else if (index == (count() - 1))
            {
                return bottom.getValue();
            }
            else if ((index > 0) && (index < (count() - 1)))
            {
                Node<T> temp = top;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                {
                    return temp.getValue();
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }

        return null;
    }


    public int count() {
        return 0;
    }


    public boolean isEmpty() {
        return false;
    }

}
