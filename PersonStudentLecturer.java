public class PersonStudentLecturer {
    public static void main(String[] args) {
        PersonStudentLecturer_Student student = new PersonStudentLecturer_Student("Amina", "S101", 3.7);
        PersonStudentLecturer_Lecturer lecturer = new PersonStudentLecturer_Lecturer("Hassan", "L201", 1200);

        System.out.println(student.getName());
        System.out.println(lecturer.getName());
        student.study();
        lecturer.teach();
    }
}

class PersonStudentLecturer_Person {
    private String name;
    private String id;

    public PersonStudentLecturer_Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class PersonStudentLecturer_Student extends PersonStudentLecturer_Person {
    private double gpa;

    public PersonStudentLecturer_Student(String name, String id, double gpa) {
        super(name, id);
        this.gpa = gpa;
    }

    public void study() {
        System.out.println(getName() + " is studying. GPA: " + gpa);
    }
}

class PersonStudentLecturer_Lecturer extends PersonStudentLecturer_Person {
    private double salary;

    public PersonStudentLecturer_Lecturer(String name, String id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    public void teach() {
        System.out.println(getName() + " is teaching. Salary: " + salary);
    }
}
