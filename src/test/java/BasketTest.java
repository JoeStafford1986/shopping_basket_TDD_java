import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {
    private Basket basket;
    private Item item1;
    private Item item2;

    @Before
    public void before() {
        basket = new Basket();

        item1 = new Item(1);
        item2 = new Item(2);
    }

    @Test
    public void checkItemsStartsEmpty() {
        assertEquals(0, basket.getItemsCount());
    }

    @Test
    public void canAddItem() {
        basket.addItem(item1);
        assertEquals(1, basket.getItemsCount());
    }

    @Test
    public void canAddMultipleItemsSame() {
        basket.addItem(item1);
        basket.addItem(item1);
        assertEquals(2, basket.getItemsCount());
    }

    @Test
    public void canAddMultipleItemsDifferent() {
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(2, basket.getItemsCount());
    }

    @Test
    public void canRemoveItem() {
        basket.addItem(item1);
        basket.removeItem(item1);
        assertEquals(0, basket.getItemsCount());
    }

    @Test
    public void canEmptyBasketSingleItem() {
        basket.addItem(item1);
        basket.removeAllItems();
        assertEquals(0, basket.getItemsCount());
    }

    @Test
    public void canEmptyBasketMultipleItems() {
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.removeAllItems();
        assertEquals(0, basket.getItemsCount());
    }

    @Test
    public void canEmptyBasketAlreadyEmpty() {
        basket.removeAllItems();
        assertEquals(0, basket.getItemsCount());
    }

    @Test
    public void canCalculateTotalCostSingleItem() {
        basket.addItem(item1);
        assertEquals(1, basket.calculateTotalCost(), 0.01);
    }

    @Test
    public void canCalculateTotalCostMultipleItemsSame() {
        basket.addItem(item1);
        basket.addItem(item1);
        assertEquals(2.00, basket.calculateTotalCost(), 0.01);
    }

    @Test
    public void canCalculateTotalCostMultipleItemsDifferent() {
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(3.00, basket.calculateTotalCost(), 0.01);
    }

    @Test
    public void canCalculateTotalCostEmpty() {
        assertEquals(0.00, basket.calculateTotalCost(), 0.01);
    }

    @Test
    public void canCalculateTotalCostAfterRemovingAnItem() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.removeItem(item2);
        assertEquals(1.00, basket.calculateTotalCost(), 0.01);
    }

    @Test
    public void canDiscountBasketWhenTotalHighEnough() {
        Item item3 = new Item(21.00);
        basket.addItem(item3);
        assertEquals(17.90, basket.calculateTotalCost(), 1.00);
    }

    @Test
    public void canGetCountOfSameItems() {
        basket.addItem(item1);
        basket.addItem(item1);
        assertEquals(2, basket.getCountOfSameItems(item1));
    }

    @Test
    public void canGetCountOfSameItemsExcessItem() {
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(2, basket.getCountOfSameItems(item1));
    }
}
