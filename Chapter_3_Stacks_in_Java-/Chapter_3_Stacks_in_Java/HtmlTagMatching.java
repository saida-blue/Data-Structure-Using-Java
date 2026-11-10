import java.util.Stack;

public class HtmlTagMatching {
    public static void main(String[] args) {
        Stack<String> openTags = new Stack<>();
        openTags.push("html");
        openTags.push("head");
        openTags.push("title");

        System.out.println("The next tag to close is: </" + openTags.pop() + ">");
        System.out.println("After closing title: </" + openTags.peek() + ">");
    }
}
