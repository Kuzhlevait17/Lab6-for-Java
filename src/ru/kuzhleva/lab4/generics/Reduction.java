package ru.kuzhleva.lab4.generics;

import java.util.List;
import java.util.Objects;
import java.util.function.BinaryOperator;

public class Reduction {
    // identity - это начальное значение / нейтральное значение
    // для строки начальным/ нейтральным значением будет пустая строка ""
    // для чисел начальным значением (в зависимости от типа переменной) будет 0 (0,0.0 и тд).
    public static <T> T reduce(List<T> list, T identity, BinaryOperator<T> operator) {
        Objects.requireNonNull(list, "Список не может быть null");
        Objects.requireNonNull(identity, "Начальное значение не может быть null");
        Objects.requireNonNull(operator, "Бинарный оператор не может быть null");

        T result = identity;
        for (T element : list) {
            result = operator.apply(result,element);
        }
        return result;
    }
}
