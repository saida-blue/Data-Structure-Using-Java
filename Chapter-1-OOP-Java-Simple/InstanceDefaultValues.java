class InstanceDefaultValues_DefaultStudent {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
    double gpa;
    float score;
}

public class InstanceDefaultValues {
    public static void main(String[] args) {
        // Java gives default values to these fields.
        InstanceDefaultValues_DefaultStudent student = new InstanceDefaultValues_DefaultStudent();

        System.out.println("name = " + student.name);
        System.out.println("age = " + student.age);
        System.out.println("isScienceMajor = " + student.isScienceMajor);
        System.out.println("gender = " + (int) student.gender);
        System.out.println("gpa = " + student.gpa);
        System.out.println("score = " + student.score);
    }
}
