public class ThisConstructorExample {
    String name;
    int age;

    public ThisConstructorExample() {
        // This constructor calls the other constructor.
        this("ali", 10);
    }

    public ThisConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        ThisConstructorExample student = new ThisConstructorExample();
        student.display();
    }
}
