package academy.belhard;

public class CustomCollection<T> implements CustomCollectionApi<T> {
    private Object[] items;
    private int size;

    public CustomCollection() {
        items = new Object[10];
        size = 0;
    }

    public void add(T item) {
        items[size] = item;
        size++;
    }

    public T get(int index) {
        return (T) items[index];
    }
}
