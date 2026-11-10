import java.io.IOException;
import java.sql.SQLException;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            riskyWork();
        } catch (IOException | SQLException e) {
            System.out.println("Problem: " + e.getMessage());
        }
    }

    static void riskyWork() throws IOException, SQLException {
        throw new IOException("Example file problem");
    }
}
