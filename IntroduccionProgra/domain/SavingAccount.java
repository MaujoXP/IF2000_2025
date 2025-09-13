package IF2000_2025.IntroduccionProgra.domain;

public class SavingAccount extends Account {
    private String initialDate;
    private int months;
    private float interest;

    public SavingAccount(String initialDate, int months, float interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingAccount(String accountNumber, double balance, Person client, String initialDate, int months, float interest) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(this.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if(super.getBalance() >= amount)
            super.setBalance(this.getBalance() - amount);
        else {
            System.out.println("Not enough money on the account");
        }
    }

    @Override
    public double interestCalculation() {
        double total;
        total = this.getMonths() *
                super.getBalance() *
                this.getInterest();

        return super.getBalance() + total;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public int getMonths() {
        return months;
    }

    public float getInterest() {
        return interest;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        String result = "\nAccoutType: Saving Account"
                        + "\n------------------------"
                        + "\nInitial date of account: " + this.getInitialDate()
                        + "\nMonths of saving: " + this.getMonths()
                        + "\nInterest: " + this.getInterest()
                        + "\nGained interest: " + ((this.getMonths() * 
                                                     super.getBalance() / 100) +
                                                     this.getInterest())
                        + "\nBalance after interest: " + this.interestCalculation();
        return super.toString() + result;
    }
}
