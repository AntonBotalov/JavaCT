package test;

public class Toy {
    private int id;
    private String name;
    private int amount;
    private int luck;

    public Toy(int id, String name, int amount, int luck) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.luck = luck;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " Name: " + this.name + " Luck: " + this.luck;
    }

}
