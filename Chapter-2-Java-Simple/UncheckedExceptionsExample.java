public class UncheckedExceptionsExample {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        try {
            String[] names = {"Ali", "Asha"};
            System.out.println(third(names));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no third name");
        }

        try {
            System.out.println(length(null));
        } catch (NullPointerException e) {
            System.out.println("The text is null");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static String third(String[] list) {
        return list[2];
    }

    static int length(String value) {
        return value.length();
    }
}
