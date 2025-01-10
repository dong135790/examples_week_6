/**
 * A class to demonstrate how to create classes.
 */
public class InventoryItem {

    /*
     * Data members of the class. 
     */
    // name
    private String name;

    // quantity
    private int quantity;

    /**
     * Constructor.
     */
    public InventoryItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * Returns the name of the item.
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Allows update of the name of the InventoryItem.
     * @param name new name for the InventoryItem
     */
    public void setName(String name) {
        this.name = name;
    }

    public boolean purchase(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            return true;
        }
        return false;
    }


    public String toString() {
        String result = String.format("Name: %s - Quantity: %d", name, quantity);
        return result;
        // return "Name: " + name + " - Quantity: " + quantity;
    }

}
