package IF2000_2025.Lab_03.domain;

public class CheckingAccount extends Account {
    private double interest;

    public CheckingAccount(int id, double balance, Client client, double interest, int sinpeMovil) {
        super(id, balance, client, sinpeMovil);
        this.interest = interest;
    }

    @Override
    public void deposit(Transaction transaction) {
        if (transaction.getAmount() > 0) {
            setBalance(getBalance() + transaction.getAmount());
            addTransaction(transaction);
            System.out.println("Deposit successful.\nNew balance: " + getBalance() + "\n");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(Transaction transaction) {
        if (transaction.getAmount() > 0 && transaction.getAmount() <= getBalance()) {
            setBalance(getBalance() - transaction.getAmount());
            addTransaction(transaction);
            System.out.println("Withdrawal successful.\nNew balance: " + getBalance() + "\n");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public void interestCalculation() {
        setBalance((((this.interest / 100) * getBalance())
                    / 100)
                    + getBalance());
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Checking Account information" +
                "\nInterest = " + interest +
                "\n" + super.toString();
    }
}
