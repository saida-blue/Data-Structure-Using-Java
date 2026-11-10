public class DefaultAccessExample {
    public static void main(String[] args) {
        DefaultAccessExample_PackagePerson person = new DefaultAccessExample_PackagePerson();
        person.show();
    }
}

class DefaultAccessExample_PackagePerson {
    String name = "Student";

    void show() {
        System.out.println(name);
    }
}
