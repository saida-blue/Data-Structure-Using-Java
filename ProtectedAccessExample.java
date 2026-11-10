public class ProtectedAccessExample {
    public static void main(String[] args) {
        ProtectedAccessExample_DepartmentPerson person = new ProtectedAccessExample_DepartmentPerson();
        person.showDepartment();
    }
}

class ProtectedAccessExample_DepartmentPerson {
    protected String department = "Computer Science";

    protected void announce() {
        System.out.println("From " + department);
    }

    void showDepartment() {
        announce();
    }
}
