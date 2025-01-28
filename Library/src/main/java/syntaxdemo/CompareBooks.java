package syntaxdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareBooks {

    public static void main(String[] args) {
        List<BookDemo> books = new ArrayList<>();
        books.add(new BookDemo("Charlotte's Web", new Name("EB", "White"), BookDemo.BookType.HARD_COVER));
        books.add(new BookDemo("Kindred", new Name("Octavia", "Butler"), BookDemo.BookType.HARD_COVER));
        books.add(new BookDemo("A Song of Fire and Ice", new Name("George", "RR Martin"), BookDemo.BookType.KINDLE));
        books.add(new BookDemo("the CATCHER in the RYE", new Name("JD", "Salinger"), BookDemo.BookType.PAPERBACK));

        System.out.println(books);
//        Collections.sort(books);



    }
}
