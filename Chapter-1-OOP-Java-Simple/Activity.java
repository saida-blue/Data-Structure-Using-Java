class Activity_Course {
    String code;
    String title;
    int credits;

    Activity_Course(String c, String t, int cr) {
        code = c;
        title = t;
        credits = cr;
    }

    void printCourse() {
        System.out.println(code + " - " + title + " (" + credits + " cr)");
    }
}

public class Activity {
    public static void main(String[] args) {
        // I make two course objects.
        Activity_Course c1 = new Activity_Course("CA314", "Data Structures", 3);
        Activity_Course c2 = new Activity_Course("MA201", "Discrete Mathematics", 3);

        c1.printCourse();
        c2.printCourse();
    }
}
