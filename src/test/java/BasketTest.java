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
}
