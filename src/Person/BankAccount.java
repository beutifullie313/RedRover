package Person;

public class BankAccount {

    private String accountNumber;

    private double balance = 0;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        this.balance = balance;
        return(balance);
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        double newBalance = balance -= amount;
        if (newBalance < 0) {
            System.out.println("Cannot");
        } else {
            this.balance -= amount;
        }
    }
}
