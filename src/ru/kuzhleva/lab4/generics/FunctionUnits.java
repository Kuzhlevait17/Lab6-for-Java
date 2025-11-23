package ru.kuzhleva.lab4.generics;

import java.util.ArrayList;
import java.util.List;

public class FunctionUnits {
    public static <T,R> List<R> map(List<T> list, Function <T,R> function) {
        List<R> result = new ArrayList<>();
        for (T element : list) {
            result.add(function.apply(element));
        }

        return result;
    }
}