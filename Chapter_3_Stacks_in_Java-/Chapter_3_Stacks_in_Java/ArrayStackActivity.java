public class ArrayStackActivity {
    public static void main(String[] args) {
        ArrayStack<String> names = new ArrayStack<>();

        names.push("A");
        names.push("B");
        System.out.println("After A and B: size " + names.size()
                + ", capacity " + names.capacity());

        names.push("C");
        System.out.println("After C: size " + names.size()
                + ", capacity " + names.capacity());

        System.out.println("peek: " + names.peek());
        System.out.println("pop: " + names.pop());
        System.out.println("pop: " + names.pop());
        System.out.println("pop: " + names.pop());

        try {
            System.out.println("pop: " + names.pop());
        } catch (EmptyCollectionException error) {
            System.out.println(error.getMessage());
        }
    }
}
