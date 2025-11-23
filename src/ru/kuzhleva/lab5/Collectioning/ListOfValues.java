package ru.kuzhleva.lab5.Collectioning;

import java.util.ArrayList;
import java.util.List;

public class ListOfValues<T> {
    private List<T> values;

    public ListOfValues(List<T> elements) {
        if (elements == null) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        this.values = List.copyOf(elements);
    }

    public static<T> List<T> addValues(List <T> list, T element) {
        List<T> oldValues = new ArrayList<>();
        List<T> beforeSearch = new ArrayList<>();
        int index = 0;
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            for (int j = index+1; j < list.size(); j++) {
                oldValues.add(list.get(j));
            }
            for (int j = 0; j < index; j++) {
                beforeSearch.add(list.get(j));
            }
            List<T> copy = List.copyOf(list);
            list.clear();
            list.addAll(beforeSearch);
            list.add(element);
            list.addAll(copy);
            list.addAll(oldValues);
        }
        return list;
     }

    @Override
    public String toString() {
        return values.toString();
    }
}
