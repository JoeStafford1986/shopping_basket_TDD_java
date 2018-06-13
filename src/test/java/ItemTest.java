import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void canGetCost() {
        Item item = new Item(1);
        assertEquals(1, item.getCost());
    }
}
