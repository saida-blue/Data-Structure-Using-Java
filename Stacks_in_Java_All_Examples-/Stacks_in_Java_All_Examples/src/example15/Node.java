package example15;
public class Node<T> {
 private T element; private Node<T> next;
 public Node(T element) { this.element = element; next = null; }
 public Node<T> getNext() { return next; }
 public void setNext(Node<T> next) { this.next = next; }
 public T getElement() { return element; }
}
