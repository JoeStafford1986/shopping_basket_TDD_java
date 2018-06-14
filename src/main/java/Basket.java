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
        this.items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void removeAllItems() {
        this.items.clear();
    }

    public double calculateTotalCost() {
        for (Item item : this.items) {
            totalCost += item.getCost();
        }
        if (totalCost > 20.00) {
            totalCost = (totalCost / 100) * 90;
        }
        return totalCost;
    }

    public int getCountOfSameItems(Item itemToCheck) {
        int itemsOfSameType = 0;
        for (Item item : this.items) {
            if (itemToCheck == item) {
                itemsOfSameType++;
            }
        }
        return itemsOfSameType;
    }

    public ArrayList<Item> getItemsOfSameType(Item item) {
        ArrayList<Item> itemsOfSameType = new ArrayList<>();
        for (Item otherItem : this.items) {
            if (item == otherItem) {
                itemsOfSameType.add(otherItem);
            }
        }
        return itemsOfSameType;
    }


}
