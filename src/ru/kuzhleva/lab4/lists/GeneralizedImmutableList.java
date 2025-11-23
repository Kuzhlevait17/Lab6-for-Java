package ru.kuzhleva.lab4.lists;

import java.util.Arrays;
import java.util.List;

public class GeneralizedImmutableList<T> {
    private T[] element;

    public GeneralizedImmutableList(T[] elements) {
        if (elements == null) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }
        this.element = Arrays.copyOf(elements,elements.length);
    }

    public GeneralizedImmutableList(GeneralizedImmutableList<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("Массив значений не может быть пустым.");
        }
        this.element = Arrays.copyOf(list.element,list.size());
    }

    public T positionN(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Значение индекса не может выходить за диапазон значений массива.");
        }
        return element[index];
    }

    public FillTheList<T> setValue(int index, T value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Значение индекса не может выходить за диапазон значений массива.");
        }
        T[] newArr = Arrays.copyOf(element,element.length);
        newArr[index] = value;
        return new FillTheList<>(newArr);
    }

    public static <T extends Number> void fillList(List<T> list, Class<T> currentClass) {
        //list.clear();
        for (int i = 1; i <= 100; i++) {
            T value = convertToType(i, currentClass);
            list.add(value);
        }
    }

    private static <T extends Number> T convertToType(int value, Class<T> currentClass) {
        if (currentClass == Integer.class)
            return currentClass.cast(value);
        if (currentClass == Double.class)
            return currentClass.cast((double) value);
        if (currentClass == Float.class)
            return currentClass.cast((float) value);
        if (currentClass == Long.class)
            return currentClass.cast((long) value);
        throw new IllegalArgumentException("Неподдерживаемый тип: " + currentClass);
    }

    public T[] toArray() {
        return Arrays.copyOf(element,element.length);
    }

    public boolean isEmpty() {
        return (element.length == 0);
    }

    public int size() {
        return element.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(element);
    }
}
