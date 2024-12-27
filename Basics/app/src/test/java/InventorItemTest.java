import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InventorItemTest {
    
    @Test
    public void testGetItem() {
        InventoryItem ii = new InventoryItem("Apples", 10);
        assertEquals("Apples", ii.getItem());
    }
}
