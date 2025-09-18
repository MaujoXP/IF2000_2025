package IF2000_2025.Lab_03.domain;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public Bank(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }


    public ArrayList<Account> getAccountsList() {
        return accounts;
    }

    
    public String getAccounts() {
        String msg = "Bank Accounts:\n";

        for (Account account : accounts) {
            msg += account.toString() + "\n";
        }
        return msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank information" +
                "\nName = " + name + 
                "\nAccounts: \n" + getAccounts() + "\n";
    }
}
