package library;

public class BookDemo {

    public enum BookType {HARD_COVER, PAPERBACK, KINDLE}

    private String title;
    private Name author;
    private BookType bookType;


    public BookDemo(String title, Name author, BookType bookType) {
        this.title = title;
        this.author = author;
        this.bookType = bookType;
    }

    /**
     * Books are stored according to their type. Hard cover books are in Stack 1, paperbacks are in Stack 2, andK Kindle
     * books are online.
     *
     * @return location of the book
     */
    public String getLocation() {

        // Option 1: standard if
        if (bookType == BookType.HARD_COVER) {
            return "Stack 1";
        } else if (bookType == BookType.PAPERBACK) {
            return "Stack 2";
        } else if (bookType == BookType.KINDLE) {
            return "Online";
        }
        return null;

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
//        String location = switch (bookType) {
//            case HARD_COVER -> "Stack 1";
//            case PAPERBACK -> "Stack 2";
//            case KINDLE -> "Online";
//        };
//        return location;


    }


    // Used only for some local testing of Book.
    public static void main(String[] args) {

        BookDemo book = new BookDemo("Kindred", new Name("Octavia", "Butler"), BookType.HARD_COVER);

        BookType type = BookType.HARD_COVER;

        System.out.println(book.getLocation());


    }

}
