// No modifier means default access in the same package.
class DefaultExample_DefaultStudent {
    String name = "Ahmed";
}

public class DefaultExample {
    public static void main(String[] args) {
        DefaultExample_DefaultStudent student = new DefaultExample_DefaultStudent();
        System.out.println(student.name);
    }
}
