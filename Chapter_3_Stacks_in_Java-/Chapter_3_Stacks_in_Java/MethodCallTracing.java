public class MethodCallTracing {
    public static void main(String[] args) {
        one();
    }

    public static void one() {
        System.out.println("one starts");
        two();
        System.out.println("one finishes");
    }

    public static void two() {
        System.out.println("two starts");
        three();
        System.out.println("two finishes");
    }

    public static void three() {
        System.out.println("three starts");
        System.out.println("three finishes");
    }
}
