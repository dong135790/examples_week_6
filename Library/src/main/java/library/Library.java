package library;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to store our full library.
 */
public class Library {

    private List<LibraryItem> items;

    /**
     * Construct a new, empty Library.
     */
    public Library() {
        items = new ArrayList<>();
    }

    /**
     * Add an item to the library.
     *
     * @param item the new item
     */
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    /**
     * Return the number of items available for checkout.
     *
     * @return
     */
    public int countAvailableItems() {
        int count = 0;
        for (LibraryItem item : items) {
            if (!item.isCheckedOut()) {
                count++;
            }
         }
        return count;
    }

    /**
     * Return the number of Books that are available for checkout.
     * @return
     */
    public int countAvailableBooks() {
        int count = 0;
        for (LibraryItem item : items) {
            if (!item.isCheckedOut() &&
                item instanceof Book b) {
                count++;
            }
        }
        return count;
    }

    /**
     * Return a list of all book authors.
     *
     * @return List of Strings representing author names.
     */
    public List<String> getAuthors() {
        List<String> authors = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item instanceof Book b) {
                authors.add(b.getAuthor());
            }
        }
        return authors;
    }

}
