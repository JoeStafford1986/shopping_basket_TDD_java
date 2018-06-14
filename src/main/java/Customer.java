public class Customer {
    private boolean loyal;

    public Customer() {
        this.loyal = false;
    }

    public boolean checkLoyalty() {
        return this.loyal;
    }

    public void setLoyalty(boolean newStatus) {
        this.loyal = newStatus;
    }
}
