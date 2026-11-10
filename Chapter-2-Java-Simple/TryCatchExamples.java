import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchExamples {
    public static void main(String[] args) {
        checkedExceptionExample();
        uncheckedExceptionExample();
        multipleCatchExample();
        finallyExample();
    }

    static void checkedExceptionExample() {
        try {
            FileReader reader = new FileReader("data.txt");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Try another file.");
        } catch (IOException e) {
            System.out.println("Could not close the file.");
        }
    }

    static void uncheckedExceptionExample() {
        try {
            int answer = 10 / 0;
            System.out.println(answer);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    static void multipleCatchExample() {
        try {
            int number = Integer.parseInt("hello");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

    static void finallyExample() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("scores.txt"));
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("Scores file is missing");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Finished checking the file");
        }
    }
}
