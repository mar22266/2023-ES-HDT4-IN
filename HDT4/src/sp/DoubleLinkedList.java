package sp;

public class DoubleLinkedList<T> implements IList<T> {
    private DoubleNode<T> start;
    private DoubleNode<T> end;
    private int count;



    public DoubleLinkedList() {
        start = null;
        end = null;
        count = 0;
    }


    public void addStart(T value) {
        DoubleNode<T> newNode = new DoubleNode<T>(value);

        if (IsEmpty()) {

            start = newNode;
            end = newNode;
            start.setNext(start);
            start.setPrevious(start);
        } else {

            newNode.setNext(start);
            start.setPrevious(newNode);
            newNode.setPrevious(end);
            end.setNext(newNode);
            start = newNode;
        }

        count++;
    }


    public void addEnd(T value) {

        DoubleNode<T> newNode = new DoubleNode<T>(value);

        if (IsEmpty()) {

            start = newNode;
            end = newNode;
            start.setNext(start);
            start.setPrevious(start);
        } else {

            newNode.setPrevious(end);
            newNode.setNext(start);
            start.setPrevious(newNode);
            end.setNext(newNode);
            end = newNode;
        }

        count++;

    }


    public void add(T value, int index) {

        if (IsEmpty())
        {
            addStart(value);
        }
        else
        {
            if (index >= Count())
            {
                addEnd(value);
            }
            else if (index == 0)
            {
                addStart(value);
            }
            else if ((index > 0) && (index < Count()))
            {
                DoubleNode<T> newNode = new DoubleNode<T>(value);
                DoubleNode<T> temp = start;
                int i = 0;


                while ((temp != null) && (i < index)) {
                    temp = temp.getNext();
                    i++;
                }


                newNode.setNext(temp);
                newNode.setPrevious(temp.getPrevious());
                temp.setPrevious(newNode);
                newNode.getPrevious().setNext(newNode);
                count++;
            }
        }

    }





    public T removeStart() {
        if (!IsEmpty()) {

            if (Count() == 1) {
                DoubleNode<T> temp = start;
                start = null;
                end = null;
                count--;
                return temp.getValue();
            } else {
                DoubleNode<T> temp = start;
                end.setNext(temp.getNext());
                temp.getNext().setPrevious(end);
                start = temp.getNext();
                count--;
                return temp.getValue();
            }

        } else {
            return null;
        }


    }


    public T getValue(int index) {
        if (!IsEmpty())
        {
            if (index == 0)
            {
                return start.getValue();
            }
            else if (index == (Count() - 1))
            {
                return end.getValue();
            }
            else if ((index > 0) && (index < (Count() - 1)))
            {
                DoubleNode<T> temp = start;
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

    public boolean IsEmpty() {
        return count == 0;
    }

    public T remove(int index) {
        return null;
    }
    public int Count() {
        return count;
    }

    public T removeEnd() {
        return null;
    }
}
