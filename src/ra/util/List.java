package ra.util;

public interface List<T> {
    T[] findAll();
    T get(int index);
    void add(T t);
    void delete(int index);
    void update(int index, T t);
}
