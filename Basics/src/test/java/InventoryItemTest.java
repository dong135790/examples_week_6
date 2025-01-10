import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryItemTest {
    
    @Test
    public void testGetName() {
        InventoryItem ii = new InventoryItem("Apples", 10);
        assertEquals("Apples", ii.getName());
    }

    @Test
    public void testPurchaseSuccess() {
        InventoryItem ii = new InventoryItem("Apples", 10);
        assertTrue(ii.purchase(5));
    }

    @Test
    public void testPurchaseFailure() {
        InventoryItem ii = new InventoryItem("Apples", 10);
        assertFalse(ii.purchase(15));
    }

}
