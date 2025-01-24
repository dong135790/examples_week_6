package syntaxdemo;

/**
 * A Book class to demonstrate various Java syntax things.
 */
public class BookDemo {

    /**
     * An enum can be used to declare a fixed set of constants.
     */
    public enum BookType {HARD_COVER, PAPERBACK, KINDLE}

    // data members for our book
    private String title;
    private Name author;
    private BookType bookType;


    /**
     * Build a new Book with a given title, author, and type
     * @param title
     * @param author
     * @param bookType
     */
    public BookDemo(String title, Name author, BookType bookType) {
        this.title = title;
        this.author = author;
        this.bookType = bookType;
    }

    /**
     * Books are stored according to their type. Hard cover books are in Stack 1, paperbacks are in Stack 2, and Kindle
     * books are online.
     *
     * Demonstrates use of enum and use of switch
     *
     * @return location of the book
     */
    public String getLocation() {

        // Option 1: standard if
//        if (bookType == BookType.HARD_COVER) {
//            return "Stack 1";
//        } else if (bookType == BookType.PAPERBACK) {
//            return "Stack 2";
//        } else if (bookType == BookType.KINDLE) {
//            return "Online";
//        }
//        return null;

        // Option 2: basic switch
        // break is required
//        String location = null;
//        switch (bookType) {
//            case HARD_COVER:
//                location = "Stack 1";
//                break;
//            case PAPERBACK:
//                location = "Stack 2";
//                break;
//            case KINDLE:
//                location = "Online";
//                break;
//        }
//        return location;

        // Option 3: enhanced switch
        String location = switch (bookType) {
            case HARD_COVER -> "Stack 1";
            case PAPERBACK -> "Stack 2";
            case KINDLE -> "Online";
        };
        return location;
    }

    // Used only for some local testing of Book.
    public static void main(String[] args) {

        BookType type = BookType.HARD_COVER;
        System.out.println(type.name());

        BookDemo book = new BookDemo(
                "Kindred",
                new Name("Octavia", "Butler"),
                type);

//        System.out.println(book.getLocation());


    }

}
