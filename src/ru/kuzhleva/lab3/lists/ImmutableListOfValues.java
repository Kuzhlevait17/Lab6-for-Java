package ru.kuzhleva.lab3.lists;

import java.util.Arrays;

public class ImmutableListOfValues {
    private final int[] values;

    public ImmutableListOfValues(int... elements) {
        if (elements == null) {
            throw new IllegalArgumentException("Массив значений не может быть пустым.");
        }
        this.values = Arrays.copyOf(elements, elements.length);
    }

    public ImmutableListOfValues(ImmutableListOfValues list) {
        if (list == null) {
            throw new IllegalArgumentException("Массив значений не может быть пустым.");
        }
        this.values = Arrays.copyOf(list.values,list.size());
    }


    public int positionN(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Значение индекса не может выходить за диапазон значений массива.");
        }
        return values[index];
    }

    public ImmutableListOfValues setValue(int index, int value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Значение индекса не может выходить за диапазон значений массива.");
        }
        int[] newArr = Arrays.copyOf(values,values.length);
        newArr[index] = value;
        return new ImmutableListOfValues(newArr);
    }

    public int[] toArray() {
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
