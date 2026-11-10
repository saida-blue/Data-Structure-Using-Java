public class ThisFieldExample {
    private String name;
    private int age;

    public ThisFieldExample(String name, int age) {
        // this.name is the field; name is the parameter.
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        ThisFieldExample student = new ThisFieldExample("Ahmed", 20);
        student.display();
    }
}
