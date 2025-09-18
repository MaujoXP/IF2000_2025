package IF2000_2025.Lab_03.domain;

public class SavingAccount extends Account {
    private double interest;
    private String initialDate;
    private int months;

    public SavingAccount(int id, double balance, Client client, double interest, String initialDate, int months, int sinpeMovil) {
        super(id, balance, client, sinpeMovil);
        this.interest = interest;
        this.initialDate = initialDate;
        this.months = months;
    }

    @Override
    public void deposit(Transaction transaction) {
        if (transaction.getAmount() > 0) {
            setBalance(getBalance() + transaction.getAmount());
            System.out.println("Deposit successful.\nNew balance: " + getBalance() + "\n");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(Transaction transaction) {
        if (transaction.getAmount() > 0 && transaction.getAmount() <= getBalance()) {
            setBalance(getBalance() - transaction.getAmount());
            System.out.println("Withdrawal successful.\nNew balance: " + getBalance() + "\n");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public void interestCalculation() {
        setBalance((this.months * (this.interest / 100)
                    * getBalance())
                    + getBalance());
    } 

    public double getInterest() {
        return interest;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public int getMonths() {
        return months;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    @Override
    public String toString() {
        return "Saving Account information" +
                "\nInterest = " + interest +
                "\nInitial Date = " + initialDate +
                "\nMonths = " + months +
                "\n" + super.toString();
    }
}
