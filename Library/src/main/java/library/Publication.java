package library;

public abstract class Publication implements LibraryItem {

    private int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    public boolean isCheckedOut() {
        return false;
    }


}
