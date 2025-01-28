package cs5004list;

import java.util.function.Predicate;

public class CS5004ArrayList<T> implements CS5004List<T> {

    private T[] elements;
    private int size;

    public CS5004ArrayList() {
        elements = (T[]) new Object[10];
    }

    public boolean add(T element) {
        if (size <= elements.length) {
            elements[size++] = element;
            return true;
        }
        // TODO: resize
        return false;
    }

    public CS5004List<T> filter(Predicate<T> predicate) {
        throw new UnsupportedOperationException();
    }


}
