package library;

/**
 * Super class for items in the library that are publications, like books and magazines.
 * This is in contrast to items that may be media (LPs or CDs) or tools (hammers or saws).
 */
public abstract class Publication implements LibraryItem {

    protected int pageCount;
    protected String title;
    protected boolean isCheckedOut;

    /**
     * Construct a Publication with a given title and page count.
     *
     * @param title title of the publication
     * @param pageCount number of pages
     */
    public Publication(String title, int pageCount) {
        this.pageCount = pageCount;
        this.title = title;
        this.isCheckedOut = false; // defaults to false
    }


    /**
     * Return the title.
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Return the page count.
     * @return
     */
    public int getPageCount() {
        return pageCount;
    }

    /*
    All Publications are checked out and returned in the same way.
    It is reasonable to implement this functionality in this superclass.
     */
    @Override
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    @Override
    public boolean checkoutItem() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Title: " + title
                + ", PageCount: " + pageCount;
    }

    /**
     * Abstract classes can have abstract methods that must be implemented by concrete child classes.
     */
    public abstract void read();


}
