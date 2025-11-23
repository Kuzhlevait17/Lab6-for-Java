package ru.kuzhleva.lab4.lists;


import java.util.Arrays;

public class FillTheList<T> {
    private T[] values;

    public FillTheList(T[] elements) {
        if (elements == null) {
            throw new IllegalArgumentException("Массив значений не может быть пустым.");
        }
        this.values = Arrays.copyOf(elements, elements.length);
    }

    public FillTheList(FillTheList<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("Массив значений не может быть пустым.");
        }
        this.values = Arrays.copyOf(list.values,list.size());
    }


    public T positionN(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Значение индекса не может выходить за диапазон значений массива.");
        }
        return values[index];
    }

    public FillTheList<T> setValue(int index, T value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Значение индекса не может выходить за диапазон значений массива.");
        }
        T[] newArr = Arrays.copyOf(values,values.length);
        newArr[index] = value;
        return new FillTheList<>(newArr);
    }

    public T[] toArray() {
        return Arrays.copyOf(values,values.length);
    }

    public boolean isEmpty() {
        return (values.length == 0);
    }

    public int size() {
        return values.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}