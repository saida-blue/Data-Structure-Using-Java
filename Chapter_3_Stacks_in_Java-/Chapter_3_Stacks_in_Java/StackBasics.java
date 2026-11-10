import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("Original stack: " + numbers);
        System.out.println("Top element: " + numbers.peek());
        System.out.println("After peek: " + numbers);
        System.out.println("Removed element: " + numbers.pop());
        System.out.println("After pop: " + numbers);
        System.out.println("Is empty: " + numbers.isEmpty());
        System.out.println("Size: " + numbers.size());
    }
}
