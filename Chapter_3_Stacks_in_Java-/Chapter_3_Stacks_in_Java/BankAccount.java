import java.util.Stack;

public class BankAccount {
    private double balance;
    private Stack<Double> history = new Stack<>();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        history.push(amount);
        System.out.println("Deposit " + amount + " -> balance " + balance);
    }

    public void undoLastDeposit() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        double last = history.pop();
        balance -= last;
        System.out.println("Undo " + last + " -> balance " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        account.deposit(20);
        account.deposit(30);
        account.undoLastDeposit();
        account.undoLastDeposit();
    }
}
