import java.util.Stack;

public class BrowserHistory {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        history.push("Google");
        history.push("JUST website");
        history.push("Gmail");
        history.push("GitHub");

        System.out.println("Current page: " + history.peek());
        history.pop();
        history.pop();
        System.out.println("Page after pressing Back twice: " + history.peek());
    }
}
