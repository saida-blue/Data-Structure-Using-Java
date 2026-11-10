public class LinkedStackActivity {
    public static void main(String[] args) {
        LinkedStack<String> letters = new LinkedStack<>();

        letters.push("A");
        letters.push("B");
        letters.push("C");
        letters.push("D");

        System.out.println("Stack: " + letters);
        System.out.println("Top element: " + letters.peek());
        System.out.println("Removed: " + letters.pop());
        System.out.println("After pop: " + letters);
        System.out.println("Size: " + letters.size());
    }
}
