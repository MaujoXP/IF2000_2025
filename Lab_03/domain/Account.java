package IF2000_2025.Lab_03.domain;

public abstract class Account {
    private int id;
    private double balance;
    private Client client;
    private Logbook logbook = new Logbook();
    private int sinpeMovil;

    public Account(int id, double balance, Client client, int sinpeMovil) {
        this.id = id;
        this.balance = balance;
        this.client = client;
        this.sinpeMovil = sinpeMovil;
    }

    public abstract void deposit(Transaction transaction);
    public abstract void withdraw(Transaction transaction);
    public abstract void interestCalculation();

    public void addTransaction(Transaction transaction) {
        logbook.addMovement(transaction);
    }

    public Logbook getLogbook() {
        return logbook;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public int getSinpeMovil() {
        return sinpeMovil;
    }

    public Client getClient() {
        return client;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setLogbook(Logbook logbook) {
        this.logbook = logbook;
    }

    public void setSinpeMovil(int sinpeMovil) {
        this.sinpeMovil = sinpeMovil;
    }

    @Override
    public String toString() {
        return "Account information" +
                "\nID = " + id +
                "\nBalance = " + balance +
                "\n" + client.toString() +
                "\n" + logbook.toString() + "\n";
    }
}
