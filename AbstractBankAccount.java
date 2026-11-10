public class AbstractBankAccount {
    public static void main(String[] args) {
        AbstractBankAccount_BankAccount[] accounts = {
            new AbstractBankAccount_SavingsAccount("SA-1", 200),
            new AbstractBankAccount_CurrentAccount("CA-1", 200),
            new AbstractBankAccount_StudentAccount("ST-1", 200)
        };

        for (AbstractBankAccount_BankAccount account : accounts) {
            account.deposit(50);
            account.withdraw(120);
            account.show();
        }
    }
}

abstract class AbstractBankAccount_BankAccount {
    private String accountNumber;
    protected double balance;

    AbstractBankAccount_BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void show() {
        System.out.println(accountNumber + " balance: " + balance);
    }
}

class AbstractBankAccount_SavingsAccount extends AbstractBankAccount_BankAccount {
    AbstractBankAccount_SavingsAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 50) {
            balance -= amount;
        } else {
            System.out.println("Savings account must keep 50");
        }
    }
}

class AbstractBankAccount_CurrentAccount extends AbstractBankAccount_BankAccount {
    AbstractBankAccount_CurrentAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -200) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit reached");
        }
    }
}

class AbstractBankAccount_StudentAccount extends AbstractBankAccount_BankAccount {
    AbstractBankAccount_StudentAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 100) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Not enough balance");
            }
        } else {
            System.out.println("Maximum withdrawal is 100");
        }
    }
}
