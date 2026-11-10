import java.util.Stack;
import java.util.Scanner;

public class ReverseString {
    public static String reverse(String word) {
        Stack<Character> letters = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            letters.push(word.charAt(i));
        }

        String result = "";
        while (!letters.isEmpty()) {
            result += letters.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.println("Reversed: " + reverse(word));
        input.close();
    }
}
