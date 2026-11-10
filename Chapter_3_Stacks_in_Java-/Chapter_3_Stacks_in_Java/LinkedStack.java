public class LinkedStack<T> {
    private int count;
    private Node<T> top;

    public LinkedStack() {
        count = 0;
        top = null;
    }

    public void push(T element) {
        Node<T> temp = new Node<>(element);
        temp.setNext(top);
        top = temp;
        count++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        return top.getElement();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public String toString() {
        String result = "[";
        Node<T> current = top;
        boolean first = true;

        while (current != null) {
            if (!first) {
                result += ", ";
            }
            result += current.getElement();
            first = false;
            current = current.getNext();
        }

        return result + "]";
    }
}
