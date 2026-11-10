import java.util.Arrays;

public class ArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }

        top = 0;
        stack = (T[]) new Object[initialCapacity];
    }

    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }

        stack[top] = element;
        top++;
    }

    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public int size() {
        return top;
    }

    public int capacity() {
        return stack.length;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        return stack[top - 1];
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < top; i++) {
            result += stack[i];
            if (i < top - 1) {
                result += ", ";
            }
        }
        return result + "]";
    }
}
