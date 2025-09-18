package IF2000_2025.Lab_03.logic;
import IF2000_2025.Lab_03.domain.Account;
import IF2000_2025.Lab_03.domain.Transaction;

import java.util.ArrayList;

import IF2000_2025.Lab_03.domain.Bank;

public class BankSystem {
    private ArrayList<Bank> banks = new ArrayList<Bank>();

    public BankSystem() {

    }

    public void addBank(Bank bank) {
        this.banks.add(bank);
    }

    public String getBanks() {
        String msg = "Banks in the system:\n";
        
        for (Bank bank : banks) {
            msg += bank.toString();
        }
        return msg;
    }

    public void deposit(double amount, Account account) {
        Transaction transaction = new Transaction("DEPOSIT", amount, account);
        account.deposit(transaction);
        account.addTransaction(transaction);
    }

    public void withdraw(double amount, Account account) {
        Transaction transaction = new Transaction("WITHDRAW", amount, account);
        account.withdraw(transaction);
        account.addTransaction(transaction);
    }

    public void sinpeMovil(double amount, Account accountFrom, int sinpeTo) {
        for (Bank bank : banks) {
            for (Account account : bank.getAccountsList()) {
                if (account.getSinpeMovil() == sinpeTo) {
                    if(accountFrom.getBalance() >= amount) {
                        Transaction transactionFrom = new Transaction("SINPE MOVIL OUT", amount, accountFrom);
                        account.withdraw(transactionFrom);
                        Transaction transactionTo = new Transaction("SINPE MOVIL IN", amount, account);
                        account.deposit(transactionTo);
                        System.out.println("SINPE Movil transfer successful.\n");
                        return;
                    }
                    System.out.println("SINPE Movil transfer failed. Insufficient balance.\n");
                    return;
                }
            }
        }
        System.out.println("SINPE Movil transfer failed. Recipient SINPE number not found.\n");
        return;
    }

    public void interestCalculation(Account account) {
        account.interestCalculation();
        System.out.println("Interest calculation applied.\nNew balance: " + account.getBalance());
    }

    @Override
    public String toString() {
        return "Bank System information" +
                "\nBanks: " + getBanks() + "\n";
    }

}
