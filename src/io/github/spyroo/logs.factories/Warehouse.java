package io.github.spyroo.logs.factories;

public interface Warehouse<T, I> {

    I store  (T obj);
    T discard(I id );


}
