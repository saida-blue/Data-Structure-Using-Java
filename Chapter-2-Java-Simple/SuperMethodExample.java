public class SuperMethodExample {
    public static void main(String[] args) {
        SuperMethodExample_Manager manager = new SuperMethodExample_Manager();
        manager.showWork();
    }
}

class SuperMethodExample_Employee {
    void work() {
        System.out.println("SuperMethodExample_Employee works");
    }
}

class SuperMethodExample_Manager extends SuperMethodExample_Employee {
    @Override
    void work() {
        System.out.println("SuperMethodExample_Manager manages the team");
    }

    void showWork() {
        super.work();
        work();
    }
}
