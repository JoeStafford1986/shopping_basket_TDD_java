import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;

    @Before
    public void before() {
        customer = new Customer();
    }

    @Test
    public void canCheckLoyalty() {
        assertEquals(false, customer.checkLoyalty());
    }

    @Test
    public void canSetLoyalty() {
        customer.setLoyalty(true);
        assertEquals(false, customer.checkLoyalty());
    }
}
