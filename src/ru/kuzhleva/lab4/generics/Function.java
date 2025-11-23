package ru.kuzhleva.lab4.generics;

@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);
}
