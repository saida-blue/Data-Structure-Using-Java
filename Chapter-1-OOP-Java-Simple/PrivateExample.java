public class PrivateExample {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        PrivateExample student = new PrivateExample();
        student.setAge(20);
        System.out.println(student.getAge());
    }
}
