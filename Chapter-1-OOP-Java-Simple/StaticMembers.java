public class StaticMembers {
    String name;
    static String university = "JUST";

    static void displayUniv() {
        System.out.println(university);
    }

    public static void main(String[] args) {
        StaticMembers s1 = new StaticMembers();
        StaticMembers s2 = new StaticMembers();

        s1.name = "Ahmed";
        s2.name = "Ali";

        System.out.println(s1.name);
        System.out.println(s2.name);

        // The university name is shared by the class.
        StaticMembers.displayUniv();
        System.out.println(Math.sqrt(25));
    }
}
