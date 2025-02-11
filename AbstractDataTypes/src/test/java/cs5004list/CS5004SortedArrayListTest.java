package cs5004list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CS5004SortedArrayListTest {

    @Test
    public void testInsertArrayList() {
        CS5004SortedList<Integer> list = new CS5004SortedArrayList<>();
        list.insert(1);
        assertEquals("1", list.toString().trim());
    }

    @Test
    public void testInsertBeforeArrayList() {
        CS5004SortedList<Integer> list = new CS5004SortedArrayList<>();
        list.insert(3);
        list.insert(1);
        assertEquals("1 3", list.toString().trim());

    }

    @Test
    public void testInsertAfterArrayList() {
        CS5004SortedList<Integer> list = new CS5004SortedArrayList<>();
        list.insert(1);
        list.insert(3);
        assertEquals("1 3", list.toString().trim());

    }

    @Test
    public void testInsertDuplicateArrayList() {
        CS5004SortedList<Integer> list = new CS5004SortedArrayList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        assertEquals("1 2 2 3", list.toString().trim());

    }

    @Test
    public void testInsertBetweenArrayList() {
        CS5004SortedList<Integer> list = new CS5004SortedArrayList<>();
        list.insert(1);
        list.insert(3);
        list.insert(2);
        assertEquals("1 2 3", list.toString().trim());

    }

    @Test
    public void testInsertManyArrayList() {
        CS5004SortedList<Integer> list = new CS5004SortedArrayList<>();
        list.insert(1);
        list.insert(3);
        list.insert(2);
        list.insert(12);
        list.insert(13);
        list.insert(3);
        list.insert(13);
        list.insert(1);
        assertEquals("1 1 2 3 3 12 13 13", list.toString().trim());

    }

}