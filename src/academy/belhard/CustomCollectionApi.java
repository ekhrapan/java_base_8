package academy.belhard;

public interface CustomCollectionApi<T> {
    void add(T item);

    T get(int index);

    // раскомментируйте и реализуйте данный метод в классе CustomCollection самостоятельно
//    void add(T... items);
}
