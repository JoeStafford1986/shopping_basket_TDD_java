public class Item {
    private String name;
    private double cost;
    private boolean checkIfCalculated;

    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.checkIfCalculated = false;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public boolean checkIfCalculated() {
        return this.checkIfCalculated;
    }

    public void setIfCalculated(boolean newStatus) {
        this.checkIfCalculated = newStatus;
    }
}
