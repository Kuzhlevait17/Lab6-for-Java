package ru.kuzhleva.lab4.generics;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Collectability {
    public static <T, P> P collectValues(
            List<T> source,
            // Функция, создающая новую пустую коллекцию
            Supplier<P> factory,
            // Функция, которая описывает, как добавлять некоторый элемент типа T в коллекцию P
            BiConsumer<P, T> accumulator) {
        P result = factory.get();
        for (T value : source) {
            accumulator.accept(result, value);
        }
        return result;
    }

}
