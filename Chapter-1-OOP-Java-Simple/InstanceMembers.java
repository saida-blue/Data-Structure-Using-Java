public class InstanceMembers {
    String name;
    int age;

    public void displayInfo() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        // Each object has its own name and age.
        InstanceMembers s1 = new InstanceMembers();
        InstanceMembers s2 = new InstanceMembers();

        s1.name = "Ahmed";
        s1.age = 20;
        s2.name = "Ali";
        s2.age = 22;

        s1.displayInfo();
        s2.displayInfo();
    }
}
