package extension;

public interface Filter<T> {
    public Boolean run(T item);
}
