package library;

/**
 * An interface that describes the behavior that any item in a library must support.
 */
public interface LibraryItem {

    /**
     * Determine whether the item is checked out.
     *
     * @return true if the item is checked out and false otherwise.
     */
    boolean isCheckedOut();

    /**
     * Check out the item.
     * If the item is already checked out the method will return false.
     *
     * @return true if the checkout was successful
     */
    boolean checkoutItem();

    /**
     * Return the item.
     * If the item is bot checked out the method will return false.
     *
     * @return true if the return was successful
     */
    boolean returnItem();


}
