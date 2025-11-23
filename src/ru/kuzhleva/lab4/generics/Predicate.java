package ru.kuzhleva.lab4.generics;

@FunctionalInterface
public interface Predicate <T> {
    boolean test(T t);
}
