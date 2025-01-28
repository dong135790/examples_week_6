package cs5004list;

import java.util.function.Predicate;

public interface CS5004List<T> {

    boolean add(T t);

    CS5004List<T> filter(Predicate<T> predicate);

}
