package IF2000_2025.Lab_03.domain;

import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime date;
    private String type;
    private double amount;
    private Account account;
    private static int transactionCounter = 1;
    private int transactionId;

    public Transaction(String type, double amount, Account account) {
        this.date = LocalDateTime.now();
        this.type = type.toUpperCase();
        this.amount = amount;
        this.account = account;
        this.transactionId = transactionCounter++;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public Account getAccount() {
        return account;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setType(String type) {
        this.type = type.toUpperCase();
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction information" +
                "\nTransaction ID = " + transactionId +
                "\nDate = " + date +
                "\nType = '" + type + '\'' +
                "\nAmount = " + amount +
                "\nAccount ID: " + account.getId() + 
                "\nClient: " + account.getClient().getId() + "\n";
    }
}
