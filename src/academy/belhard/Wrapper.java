package academy.belhard;

public class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public boolean isTheSame(T obj) {
        return item.equals(obj);
    }
}
