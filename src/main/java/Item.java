public class Item {
    private double cost;
    private boolean checkIfCalculated;

    public Item(double cost) {
        this.cost = cost;
        this.checkIfCalculated = false;
    }

    public double getCost() {
        return this.cost;
    }

    public boolean checkIfCalculated() {
        return this.checkIfCalculated;
    }
}
