package IF2000_2025.Lab_03.domain;

public class Client {
    private int id;
    private String name;
    private int number;
    private String direction;

    public Client(int id, String name, int number, String direction) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.direction = direction;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getDirection() {
        return direction;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Client information" +
                "\nID = " + id +
                "\nName = " + name +
                "\nNumber = " + number +
                "\nDirection = " + direction + "\n";
    }
}
