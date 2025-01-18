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

    // total number of InventoryItems created
    static int inventoryCount = 0;


    /**
     * Creates a new InventoryItem with the specified name and quantity.
     * @param name name of the item, e.g., apples
     * @param quantity number of the item in the inventory
     */
    public InventoryItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        inventoryCount++;
    }

    /**
     * Demonstration of overloading the constructor.
     *
     * Construct a new InventoryItem with a default quantity of 0.
     *
     * @param name name of the item, e.g., apples
     */
    public InventoryItem(String name) {
        // Option1 - BAD: repeat code in the other constructor
//        this.name = name;
//        this.quantity = 0;
        // Option 2 - BETTER: call the other constructor using this
        this(name, 0);

    }


    /**
     * Returns the name of the item.
     *
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the quantity available.
     *
     * @return number of the item in the inventory
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Allows update of the name of the InventoryItem.
     *
     * @param name new name for the InventoryItem
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A version of purchase that returns true if a purchase is successful and false otherwise.
     *
     * The method will decrease the quantity of this item in the inventory.
     *
     * @param quantity number to be purchased
     * @return true if successful
     */
//    public boolean purchase(int quantity) {
//        if (quantity <= this.quantity) {
//            this.quantity -= quantity;
//            return true;
//        }
//        return false;
//    }

    /**
     * A version of purchase that throws an exception if the number to be purchased exceeds the number in the
     * inventory.
     *
     * The method will decrease the quantity of this item in the inventory.
     *
     * @param quantity number to be purchased
     * @throws InsufficientQuantityException if the quantity to be purchased exceeds the quantity available
     */
    public void purchase(int quantity) throws InsufficientQuantityException {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            // generate an exception
            throw new InsufficientQuantityException("Not enough in the inventory!");
        }
    }


    @Override
    public String toString() {
        String result = String.format("Name: %s - Quantity: %d", name, quantity);
        return result;
        // return "Name: " + name + " - Quantity: " + quantity;
    }

    /**
     * Determine if two InventoryItem objects are equal.
     * They are equal if they have the same name and same quantity.
     *
     * @param o the other InventoryItem
     * @return true if they are the same
     */
    @Override
    public boolean equals(Object o) {

        // cast o to be an InventoryItem
        InventoryItem other = (InventoryItem) o;

        // Option 1: do not use an if statement
        return this.name.equals(other.getName())
                && this.quantity == other.getQuantity();

        // Option 2: use an if statement
//        if (this.name.equals(other.getName())
//                && this.quantity == other.getQuantity()
//        ) {
//            return true;
//        }
//        return false;
    }

    /**
     * When overriding equals, you must also override hashCode.
     *
     * @return a hashCode for this object
     */
    @Override
    public int hashCode() {
        // TODO: This could be improved:
        // https://www.sitepoint.com/how-to-implement-javas-hashcode-correctly/
        // https://www.baeldung.com/java-hashcode
        // This is a minimal implementation that relies on the same fields
        // used in the equals method.
        return name.hashCode() + quantity;
    }

}
