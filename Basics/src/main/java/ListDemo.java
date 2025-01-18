import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {

        // create a list of String
        List<String> names = new ArrayList<String>();

        // add some items to the list
        names.add("John");
        names.add("Jane");
        names.add("Bob");

        // use an enhanced for loop to print all names
        for (String name : names) {
            System.out.println(name);
        }

        // create a list of Integers
        // note: must use the Integer wrapper
        List<Integer> ids = new ArrayList<Integer>();

        // java uses autoboxing to convert int to Integer
        ids.add(1);


    }

}
