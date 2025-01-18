/**
 * Used by InventoryItem to indicated that there is an insufficient quantity of an item to complete a purchase.
 */
public class InsufficientQuantityException extends Exception {

    /**
     * Create a new InsufficientQuantity Exception.
     *
     * @param message message providing more information about this exception
     */
    public InsufficientQuantityException(String message) {
        // Demonstration of a call to the superclass constructor.
        super(message);
    }

    /**
     * Demonstration of invoking the superclass method getMessage()
     *
     * @return the message associated with this exception.
     */
    @Override
    public String getMessage() {
        return "Insufficient Quantity:" + super.getMessage();
    }

}
