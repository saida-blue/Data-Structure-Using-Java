import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("numbers.txt"));
            int number = Integer.parseInt(input.nextLine());
            System.out.println(number);
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is missing");
        } catch (NumberFormatException e) {
            System.out.println("The file does not contain a number");
        }
    }
}
