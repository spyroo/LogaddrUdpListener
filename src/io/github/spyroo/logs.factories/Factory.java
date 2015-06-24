package io.github.spyroo.logs.factories;

public interface Factory<T, A> {
    T create(A arg);
}
