import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {
    private Basket basket;

    @Before
    public void before() {
        basket = new Basket();
    }

    @Test
    public void checkItemsStartsEmpty() {
        assertEquals(0, basket.getItemsCount());
    }

    @Test
    public void canAddItem() {
        Item item = new Item(1);
        basket.addItem(item);
        assertEquals(1, basket.getItemsCount());
    }
}
