package IF2000_2025.Lab_03.domain;
import java.util.ArrayList;

public class Logbook {
    private ArrayList<Transaction> accMovements = new ArrayList<Transaction>();

    public Logbook() {

    }

    public void addMovement(Transaction transaction) {
        this.accMovements.add(transaction);
    }

    public String getAccMovements() {
        String msg = "";

        for (Transaction transaction : accMovements) {
            msg += transaction.toString() + "\n";
        }
        return msg;
    }

    @Override
    public String toString() {
        return "Logbook information" +
                "\nAccount Movements: \n" + getAccMovements();
    }
}
