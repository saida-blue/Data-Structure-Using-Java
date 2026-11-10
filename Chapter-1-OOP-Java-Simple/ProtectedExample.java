class ProtectedExample_Person {
    protected String name = "Ahmed";
}

class ProtectedExample_ProtectedStudent extends ProtectedExample_Person {
    void display() {
        // A child class ProtectedExample_can use the protected field.
        System.out.println(name);
    }
}

public class ProtectedExample {
    public static void main(String[] args) {
        ProtectedExample_ProtectedStudent student = new ProtectedExample_ProtectedStudent();
        student.display();
    }
}
