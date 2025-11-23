package ru.kuzhleva.lab6.annotations.Reflections;

import ru.kuzhleva.lab6.annotations.BasicAnnotations.Default;

/**
 * Класс, выводящий имя класса, помеченного
 * аннотацией {@link Default}
 */
public class DefaultReflection {
    /**
     * Выводит в консоль имя класса, указанного аннотацией {@link Default},
     * расположенного над классом переданного объекта.
     *
     * @param object Объект, класс которого должен быть проверен на наличие аннотации {@link Default}.
     * @throws IllegalArgumentException, если аннотация {@link Default} отсутствует.
     * @see Default
     */
    public static void showDefault(Object object) {
        Class<?> myClass = object.getClass();
        Default aDefault = myClass.getAnnotation(Default.class);
        if (aDefault == null) {
            throw new IllegalArgumentException("Аннотация @Default не найдена.");
        }
        System.out.println("Класс по умолчанию: " + aDefault.value().getSimpleName());
    }
}
