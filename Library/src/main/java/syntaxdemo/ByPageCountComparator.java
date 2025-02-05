package syntaxdemo;

import java.util.Comparator;

public class ByPageCountComparator implements Comparator<BookDemo> {

    @Override
    public int compare(BookDemo o1, BookDemo o2) {
        return o1.getPageCount() - o2.getPageCount();
    }
}
