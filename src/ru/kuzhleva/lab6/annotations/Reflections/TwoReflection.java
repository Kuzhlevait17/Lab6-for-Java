package ru.kuzhleva.lab6.annotations.Reflections;

import ru.kuzhleva.lab6.annotations.BasicAnnotations.Two;

/**
 * Класс, выводящий значения, указанные в аннотации {@link Two}
 */
public class TwoReflection {
    /**
     * Выводит значения полей, указанных в аннотации {@link Two}
     * над переданным объектом.
     *
     * @param object Объект, класс которого должен быть проверен на наличие аннотации {@link Two}
     * @see Two
     */
    public static void ShowTwo(Object object) {
        Class <?> myClass = object.getClass();
        Two annotation = myClass.getAnnotation(Two.class);
        System.out.println(annotation.first() + " " + annotation.second());
    }
}
