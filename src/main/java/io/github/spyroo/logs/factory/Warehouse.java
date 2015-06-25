package io.github.spyroo.logs.factory;

import java.util.List;

public interface Warehouse<T, I> {

    I store  (T obj);
    T discard(I id );
    List<T> getInventory();
    int size();

}
