public class ConstructorChaining {
    public static void main(String[] args) {
        new ConstructorChaining_Postgrad();
        ConstructorChaining_Car car = new ConstructorChaining_Car("Toyota", 2022, 4);
        System.out.println(car.getMake() + " " + car.getDoors());
    }
}

class ConstructorChaining_Person {
    ConstructorChaining_Person() {
        System.out.println("ConstructorChaining_Person");
    }
}

class ConstructorChaining_Student extends ConstructorChaining_Person {
    ConstructorChaining_Student() {
        super();
        System.out.println("ConstructorChaining_Student");
    }
}

class ConstructorChaining_Postgrad extends ConstructorChaining_Student {
    ConstructorChaining_Postgrad() {
        super();
        System.out.println("ConstructorChaining_Postgrad");
    }
}

class ConstructorChaining_Vehicle {
    private String make;
    private int year;

    ConstructorChaining_Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }
}

class ConstructorChaining_Car extends ConstructorChaining_Vehicle {
    private int doors;

    ConstructorChaining_Car(String make, int year, int doors) {
        super(make, year);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}
