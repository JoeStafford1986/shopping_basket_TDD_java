public class Item {
    private String name;
    private double cost;
    private boolean twoForOne;

    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.twoForOne = false;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public boolean checkTwoForOne() {
        return this.twoForOne;
    }

    public void setTwoForOne(boolean newStatus) {
        this.twoForOne = newStatus;
    }
}
