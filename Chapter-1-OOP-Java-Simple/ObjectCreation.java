class ObjectCreation_StudentRecord {
    String name;
    int age;

    void changeMajor(String newMajor) {
        System.out.println(name + " changed major to " + newMajor);
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        // I create one ObjectCreation_StudentRecord object here.
        ObjectCreation_StudentRecord ahmed = new ObjectCreation_StudentRecord();

        // I give values to the object's fields.
        ahmed.name = "Ahmed";
        ahmed.age = 20;

        System.out.println(ahmed.name);
        System.out.println(ahmed.age);

        // I call the object's method.
        ahmed.changeMajor("CS");
    }
}
