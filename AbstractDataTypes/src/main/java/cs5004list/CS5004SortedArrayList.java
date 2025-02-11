package cs5004list;

public class CS5004SortedArrayList<T extends Comparable<T>> implements CS5004SortedList<T> {

    private T[] elements;
    private int size;

    public CS5004SortedArrayList() {
        elements = (T[]) new Comparable[10];
        size = 0;
    }

    public void insert(T element) {
        // TODO
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

}
