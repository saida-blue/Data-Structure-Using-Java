class Example1_Student {
    int id;
    String name;
    String major;

    Example1_Student(int sId, String sName, String sMajor) {
        id = sId;
        name = sName;
        major = sMajor;
    }

    void printInfo() {
        System.out.println(id + " - " + name + " (" + major + ")");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Example1_Student first = new Example1_Student(1001, "Hawa", "Computer Science");
        Example1_Student second = new Example1_Student(1002, "Ali", "Information Technology");

        first.printInfo();
        second.printInfo();

        // I change the major of Ali only.
        second.major = "Computer Science";
        second.printInfo();
    }
}
