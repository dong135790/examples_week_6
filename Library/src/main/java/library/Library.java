package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
     * Check out the publication with the given title.
     *
     * @param title title of the publication
     * @return true if successful
     */
    public boolean checkoutPublication(String title) {

        LibraryItem found = null;
        for (LibraryItem item : items) {
            if (item instanceof Publication p && p.getTitle().equals(title)) {
                found = item;
                break;
            }
        }

        if (found == null || found.isCheckedOut()) {
            return false;
        }
        return found.checkoutItem();
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
     *
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
     * Return a list of all books that are available for checkout
     *
     * @return list of LibraryItem
     */
    public List<LibraryItem> getAvailableBooks() {
        List<LibraryItem> books = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item instanceof Book b
                    && !b.isCheckedOut()) {
                books.add(b);
            }
        }
        return books;
    }

    /**
     * Return a list of all Magazines that are checked out.
     *
     * @return list of LibraryItem
     */
    public List<LibraryItem> getCheckedOutMagazines() {
        List<LibraryItem> magazines = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item instanceof Magazine m
                    && m.isCheckedOut()) {
                magazines.add(m);
            }
        }
        return magazines;
    }

//    public List<LibraryItem> filter(Predicate<LibraryItem> filter) {
//        List<LibraryItem> result = new ArrayList<>();
//        for (LibraryItem item : items) {
//            if (filter.test(item)) {
//                result.add(item);
//            }
//        }
//        return result;
//    }

    public List<LibraryItem> filter(Predicate<LibraryItem> predicate) {

        List<LibraryItem> result =
                items.stream()
                .filter(predicate)
                        .toList();

        return result;


    }


    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        for (Object item : items) {
            result.append(item);
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }

}
