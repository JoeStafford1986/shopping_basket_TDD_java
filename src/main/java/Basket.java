import java.util.ArrayList;

public class Basket {
    private ArrayList<Item> items;
    private double totalCost;

    public Basket() {
        items = new ArrayList<>();
        totalCost = 0;
    }

    public int getItemsCount() {
        return this.items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void removeAllItems() {
        this.items.clear();
    }

    public double calculateTotalCost() {
        for (Item item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public int getCountOfSameItems(Item itemToCheck) {
        int itemsOfSameType = 0;
        for (Item item : items) {
            if (itemToCheck == item) {
                itemsOfSameType++;
            }
        }
        return itemsOfSameType;
    }
}
