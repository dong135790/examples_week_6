package library;

import java.util.List;
import java.util.function.Predicate;

public class LibraryDriver {

    /*
        System.out.println(library.checkoutPublication("Kindred"));
        System.out.println(library.checkoutPublication("A Song of Fire and Ice"));
        System.out.println(library.checkoutPublication("Kindred"));
        System.out.println(library.checkoutPublication("Wired"));

     */

    public static void main(String[] args) {

        Library library = LibraryFactory.buildLibrary();
        library.checkoutPublication("Kindred");
        library.checkoutPublication("Wired");

//        System.out.println(library.getAvailableBooks());
//        System.out.println(library.getCheckedOutMagazines());

        // Option 1: Implement the test functionality in a separate, named class
//        CheckedOutMagazinesPredicate comp = new CheckedOutMagazinesPredicate();
//        List<LibraryItem> results = library.filter(comp);
//        System.out.println(results);

        // Option 2: use an anonymous class
//        List<LibraryItem> results = library.filter(
//                new Predicate<LibraryItem>() {
//                    @Override
//                    public boolean test(LibraryItem libraryItem) {
//                        return libraryItem instanceof Magazine m && m.isCheckedOut();
//                    }
//                }
//        );
//        System.out.println(results);

        // Option 3: assign a lambda to a Predicate variable
//        Predicate<LibraryItem> checkedOutMagazines =
//                (item) -> ((item instanceof Magazine m) && (m.isCheckedOut()));
//        List<LibraryItem> results = library.filter(checkedOutMagazines);

        // Option 4: pass the function direction into filter
        List<LibraryItem> checkedOutMagazines = library
                .filter((item) -> ((item instanceof Magazine m) && (m.isCheckedOut())));
//        System.out.println(checkedOutMagazines);


        List<LibraryItem> availableBooks = library
                .filter((item) -> ((item instanceof Book) && (!item.isCheckedOut())));
//        System.out.println(availableBooks);

        List<LibraryItem> longBooks = library
                .filter((item) -> ((item instanceof Book) && (((Book) item).getPageCount() > 300)));
        System.out.println(longBooks);






//        System.out.println(library.filter(AVAILABLE BOOKS));
        // getAvailableBooks
        // getCheckedOutMagazines



//        System.out.println(library);


    }
}
