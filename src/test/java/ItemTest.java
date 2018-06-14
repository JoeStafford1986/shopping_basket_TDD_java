import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    private Item item;

    @Before
    public void before() {
        item = new Item(1.00);
    }

    @Test
    public void canGetCost() {
        assertEquals(1.00, item.getCost(), 0.01);
    }

    @Test
    public void canCheckIfCalculatedStartsFalse() {
        assertEquals(false, item.checkIfCalculated());
    }
}
