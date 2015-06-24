package io.github.spyroo.logs.factory;

public interface Warehouse<T, I> {

    I store  (T obj);
    T discard(I id );


}
