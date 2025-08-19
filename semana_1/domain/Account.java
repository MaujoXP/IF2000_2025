package IF2000_2025.semana_1.domain;

public abstract class Account {
  private String accountNumber;
  private double balance;
  private Person client;

  public Account() {

  }

  public Account(String accountNumber, double balance, Person client) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.client = client;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public Person getClient() {
    return client;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  } 

  public void setClient(Person client) {
    this.client = client;
  }

  //Methods for polimorfism

  public abstract void deposit();
  public abstract void withdraw();
  public abstract double interestCalculation();

  public String toString() {
    return "Bank account information\n" +
            "\nAccount number = " + this.getAccountNumber() +
            "\nBalance = " + this.getBalance() +
            "\nClient info = " + this.getClient().toString();
  }
}
