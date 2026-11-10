public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccountDemo_SavingsAccount savings = new BankAccountDemo_SavingsAccount("SA-101");
        BankAccountDemo_CurrentAccount current = new BankAccountDemo_CurrentAccount("CA-202");

        savings.deposit(100);
        current.deposit(150);

        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Current balance: " + current.getBalance());
    }
}

class BankAccountDemo_BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccountDemo_BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be positive");
            return;
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class BankAccountDemo_SavingsAccount extends BankAccountDemo_BankAccount {
    public BankAccountDemo_SavingsAccount(String accountNumber) {
        super(accountNumber);
    }
}

class BankAccountDemo_CurrentAccount extends BankAccountDemo_BankAccount {
    public BankAccountDemo_CurrentAccount(String accountNumber) {
        super(accountNumber);
    }
}
