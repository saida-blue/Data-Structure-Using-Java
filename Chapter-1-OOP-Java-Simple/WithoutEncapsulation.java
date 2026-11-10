class WithoutEncapsulation_StudentWithoutEncapsulation {
    String name;
    int age;
}

public class WithoutEncapsulation {
    public static void main(String[] args) {
        WithoutEncapsulation_StudentWithoutEncapsulation ahmed = new WithoutEncapsulation_StudentWithoutEncapsulation();
        ahmed.name = "Ahmed";
        // This value is not a valid age, but it can be assigned here.
        ahmed.age = -5;

        System.out.println("Name: " + ahmed.name);
        System.out.println("Age: " + ahmed.age);
    }
}
