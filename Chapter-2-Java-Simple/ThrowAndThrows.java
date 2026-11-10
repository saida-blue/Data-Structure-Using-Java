import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.EmptyStackException;

public class ThrowAndThrows {
    public static void main(String[] args) {
        try {
            checkAge(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            List<String> lines = loadFile("notes.txt");
            System.out.println(lines);
        } catch (IOException e) {
            System.out.println("Could not load the file");
        }

        ThrowAndThrows_SimpleStack stack = new ThrowAndThrows_SimpleStack();
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("The stack is empty");
        }
    }

    static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    static List<String> loadFile(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }
}

class ThrowAndThrows_SimpleStack {
    private Object[] items = new Object[5];
    private int size = 0;

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object top = items[size - 1];
        items[size - 1] = null;
        size--;
        return top;
    }
}
