package extension;

import java.util.ArrayList;

public class ArrayData<T, S> extends ArrayList<T> {
    public ArrayData<S, T> map(Map<T, S> listener) {
        ArrayData<S, T> newList = new ArrayData<S, T>();
        for (T item : this) {
            newList.add(listener.run(item));
        }
        return newList;
    }
    public ArrayData<T, S> filter (Filter<T> listener) {
        ArrayData<T, S> newList = new ArrayData<T, S>();
        for (T item : this) {
            if (listener.run(item)) {
                newList.add(item);
            }
        }
        return newList;
    }
}
