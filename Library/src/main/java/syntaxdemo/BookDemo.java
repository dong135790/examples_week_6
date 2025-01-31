package syntaxdemo;

/**
 * A Book class to demonstrate various Java syntax things.
 */
public class BookDemo implements Comparable<BookDemo> {

    /**
     * An enum can be used to declare a fixed set of constants.
     */
    public enum BookType {HARD_COVER, PAPERBACK, KINDLE}

    // data members for our book
    private String title;
    private Name author;
    private BookType bookType;
    private int pageCount;

    /**
     * Build a new Book with a given title, author, and type
     * @param title
     * @param author
     * @param bookType
     */
    public BookDemo(String title, Name author, BookType bookType, int pageCount) {
        this.title = title;
        this.author = author;
        this.bookType = bookType;
        this.pageCount = pageCount;
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

    /**
     * Getter for author
     *
     * @return author
     */
    public Name getAuthor() {
        return author;
    }

    public BookType getBookType() {
        return bookType;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(BookDemo o) {
                return this.title.compareTo(o.title);


//        if (this.author.last().equals(o.author.last())) {
//            if (this.author.first().equals(o.author.first())) {
//                return this.pageCount - o.pageCount;
//            } else {
//                return this.author.first().compareTo(o.author.first());
//            }
//        } else {
//            return this.author.last().compareTo(o.author.last());
//        }


//        if (this.title COMES_BEFORE o.title) {
//
//        }

//        return this.pageCount - o.pageCount;

//        if (this.pageCount < o.pageCount) {
//            return -1;
//        } else if (this.pageCount > o.pageCount) {
//            return 1;
//        } else {
//            return 0;
//        }

    }

    @Override
    public String toString() {
        return "BookDemo{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", bookType=" + bookType +
                '}';
    }

}
