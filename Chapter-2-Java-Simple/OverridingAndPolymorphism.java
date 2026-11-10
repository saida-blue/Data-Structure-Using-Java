public class OverridingAndPolymorphism {
    public static void main(String[] args) {
        OverridingAndPolymorphism_Employee employee = new OverridingAndPolymorphism_Employee();
        OverridingAndPolymorphism_Employee manager = new OverridingAndPolymorphism_Manager();

        employee.work();
        manager.work();

        OverridingAndPolymorphism_BankAccount[] accounts = {
            new OverridingAndPolymorphism_SavingsAccount(200),
            new OverridingAndPolymorphism_CurrentAccount(200),
            new OverridingAndPolymorphism_StudentAccount(200)
        };

        for (OverridingAndPolymorphism_BankAccount account : accounts) {
            account.withdraw(300);
            account.showBalance();
        }
    }
}

class OverridingAndPolymorphism_Employee {
    public void work() {
        System.out.println("OverridingAndPolymorphism_Employee works");
    }
}

class OverridingAndPolymorphism_Manager extends OverridingAndPolymorphism_Employee {
    @Override
    public void work() {
        System.out.println("OverridingAndPolymorphism_Manager manages the team");
    }
}

class OverridingAndPolymorphism_BankAccount {
    protected double balance;

    OverridingAndPolymorphism_BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            refuse("not enough money");
        } else {
            balance -= amount;
        }
    }

    void refuse(String reason) {
        System.out.println("Refused: " + reason);
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class OverridingAndPolymorphism_SavingsAccount extends OverridingAndPolymorphism_BankAccount {
    OverridingAndPolymorphism_SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 50) {
            refuse("keep at least 50");
        } else {
            balance -= amount;
        }
    }
}

class OverridingAndPolymorphism_CurrentAccount extends OverridingAndPolymorphism_BankAccount {
    OverridingAndPolymorphism_CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < -200) {
            refuse("overdraft limit");
        } else {
            balance -= amount;
        }
    }
}

class OverridingAndPolymorphism_StudentAccount extends OverridingAndPolymorphism_BankAccount {
    OverridingAndPolymorphism_StudentAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 100) {
            refuse("maximum 100 per withdrawal");
        } else {
            super.withdraw(amount);
        }
    }
}
