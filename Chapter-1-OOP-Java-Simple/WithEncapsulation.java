class WithEncapsulation_EncapsulatedStudent {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

public class WithEncapsulation {
    public static void main(String[] args) {
        WithEncapsulation_EncapsulatedStudent ahmed = new WithEncapsulation_EncapsulatedStudent();
        ahmed.setName("Ahmed");
        ahmed.setAge(20);
        ahmed.setAge(-5); // The invalid age is not accepted.

        System.out.println("Name: " + ahmed.getName());
        System.out.println("Age: " + ahmed.getAge());
    }
}
