package cs5004list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CS5004LinkedListTest {

    @Test
    public void testInsertEmpty() {
        CS5004LinkedList<String> list = new CS5004LinkedList<>();
        assertEquals("", list.toString());
    }

    @Test
    public void testInsertOne() {
        CS5004LinkedList<String> list = new CS5004LinkedList<>();
        list.insert("cat");
        assertEquals("cat", list.toString().trim());
    }

    @Test
    public void testInsertBefore() {
        CS5004LinkedList<String> list = new CS5004LinkedList<>();
        list.insert("cat");
        list.insert("alligator");
        assertEquals("alligator -> cat", list.toString().trim());
    }

    @Test
    public void testInsertAfter() {
        CS5004LinkedList<String> list = new CS5004LinkedList<>();
        list.insert("alligator");
        list.insert("cat");
        assertEquals("alligator -> cat", list.toString().trim());
    }

    @Test
    public void testInsertBetween() {
        CS5004LinkedList<String> list = new CS5004LinkedList<>();
        list.insert("alligator");
        list.insert("dog");
        list.insert("cat");
        assertEquals("alligator -> cat -> dog", list.toString().trim());
    }

}
