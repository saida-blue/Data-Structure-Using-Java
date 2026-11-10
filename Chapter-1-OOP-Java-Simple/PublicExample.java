public class PublicExample {
    public String name;

    public void displayInfo() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        PublicExample student = new PublicExample();
        student.name = "Ahmed";
        student.displayInfo();
    }
}
