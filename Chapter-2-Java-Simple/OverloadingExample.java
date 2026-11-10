public class OverloadingExample {
    public static void main(String[] args) {
        OverloadingExample_Calculator calculator = new OverloadingExample_Calculator();
        System.out.println(calculator.add(4, 5));
        System.out.println(calculator.add(4.5, 5.5));
        System.out.println(calculator.add(2, 3, 4));
    }
}

class OverloadingExample_Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
