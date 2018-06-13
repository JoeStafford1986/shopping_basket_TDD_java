import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Test
    public void checkItemsStartsEmpty() {
        Basket basket = new Basket();
        assertEquals(0, basket.getItemsCount());
    }
}
