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

    public double calculateTotalCost(Customer customer) {
        ArrayList<Item> duplicateItems = new ArrayList<>();
        for (Item duplicateItem : items) {
            if (getCountOfSameItems(duplicateItem) > 2 && getCountOfSameItems(duplicateItem) % 2 != 0 && !duplicateItems.contains(duplicateItem)) {
                duplicateItems.add(duplicateItem);
            }
        }
        for (Item item : this.items) {
            if ( item.checkTwoForOne() && getCountOfSameItems(item) > 1) {
                totalCost += (item.getCost() / 2);
            } else {
                totalCost += item.getCost();
            }
        }
        for (Item duplicateItem : duplicateItems) {
            totalCost += (duplicateItem.getCost() / 2);
        }
        if (customer.checkLoyalty()) {
            totalCost = (totalCost / 100) * 98;
        }
        if (totalCost > 20.00) {
            totalCost = (totalCost / 100) * 90;
        }
        return totalCost;
    }

    public int getCountOfSameItems(Item itemToCheck) {
        int itemsOfSameType = 0;
        for (Item item : this.items) {
            if (itemToCheck.getName().equals(item.getName())) {
                itemsOfSameType++;
            }
        }
        return itemsOfSameType;
    }
}
