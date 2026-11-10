import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CheckedExceptionThrowsExample {
    public static void main(String[] args) {
        try {
            List<String> lines = readAll("data.txt");
            System.out.println(lines);
        } catch (IOException e) {
            System.out.println("Could not read the file");
        }
    }

    public static List<String> readAll(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }
}
