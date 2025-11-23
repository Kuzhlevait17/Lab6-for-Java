package ru.kuzhleva.lab4.compare;

public class MyNumber<T extends java.lang.Comparable<T>> implements Comparable<MyNumber<T>> {
    private T value;

    public MyNumber(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(MyNumber<T> other) {
        return this.value.compareTo(other.value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}