package ru.kuzhleva.lab6.annotations.AdditionaClasses;

import ru.kuzhleva.lab6.annotations.BasicAnnotations.Invoke;
import ru.kuzhleva.lab6.annotations.BasicAnnotations.Two;

/**
 * Класс, предоставляющий мяукающего кота.
 * <p>
 * Класс помечен аннотацией {@link Two}, где
 * <ul>
 *     <li> first = имя кота. </li>
 *     <li> second = некоторое числовое представление(например, возраст или номер).</li>
 * </ul>
 * </p>
 * @see Two
 */
@Two(first = "Pusheen", second = 15)
public class Kitty {
    private final String name;

    /**
     * Создает объект Kitty с указанным именем.
     *
     * @param name Имя создаваемого объекта.
     */
    public Kitty(String name) {
            this.name = name;
    }

    /**
     * Производит мяуканье.
     * Метод помечен аннотацией {@link Invoke}, чтобы его можно было вызвать через механизм рефлексии.
     */
    @Invoke
    public void meow() {
            System.out.println(name + ": мяу!");
    }

    /**
     * Возвращает строковое представление объекта Kitty.
     * <p>
     * Формат: "Кот:" + имя_кота.
     * </p>
     * @return Строковое представление объекта Kitty.
     */
    @Override
    public String toString() {
            return "Кот: " + name;
    }
}
