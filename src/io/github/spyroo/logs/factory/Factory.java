package io.github.spyroo.logs.factory;

public interface Factory<T, A> {
    T create(A arg);
}
