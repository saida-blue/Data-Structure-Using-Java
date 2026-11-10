public class InheritanceTypes {
    public static void main(String[] args) {
        InheritanceTypes_Manager manager = new InheritanceTypes_Manager("Ali", 35, "M10", 5);
        manager.showPerson();
        manager.manageTeam();

        InheritanceTypes_Dog dog = new InheritanceTypes_Dog();
        dog.eat();
        dog.bark();

        InheritanceTypes_SavingsAccount savings = new InheritanceTypes_SavingsAccount();
        InheritanceTypes_CurrentAccount current = new InheritanceTypes_CurrentAccount();
        savings.showType();
        current.showType();
    }
}

class InheritanceTypes_Person {
    String name;
    int age;

    InheritanceTypes_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPerson() {
        System.out.println(name + ", " + age);
    }
}

class InheritanceTypes_Employee extends InheritanceTypes_Person {
    String employeeId;

    InheritanceTypes_Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
}

class InheritanceTypes_Manager extends InheritanceTypes_Employee {
    int teamSize;

    InheritanceTypes_Manager(String name, int age, String employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    void manageTeam() {
        System.out.println("Managing " + teamSize + " people");
    }
}

class InheritanceTypes_Animal {
    void eat() {
        System.out.println("InheritanceTypes_Animal eats");
    }
}

class InheritanceTypes_Dog extends InheritanceTypes_Animal {
    void bark() {
        System.out.println("InheritanceTypes_Dog barks");
    }
}

class InheritanceTypes_Account {
    void showType() {
        System.out.println("Bank account");
    }
}

class InheritanceTypes_SavingsAccount extends InheritanceTypes_Account {
    @Override
    void showType() {
        System.out.println("Savings account");
    }
}

class InheritanceTypes_CurrentAccount extends InheritanceTypes_Account {
    @Override
    void showType() {
        System.out.println("Current account");
    }
}
