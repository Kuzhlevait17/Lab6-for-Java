package ru.kuzhleva.tests.testinglab6;

import org.junit.jupiter.api.Test;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.OtherWeapon;
import ru.kuzhleva.lab6.annotations.BasicAnnotations.Mode;
import ru.kuzhleva.lab6.annotations.BasicAnnotations.ToString;
import ru.kuzhleva.lab6.annotations.Reflections.ToStringReflection;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Класс, проверяющий корректность работы аннотации {@link ToString}
 * и механизма отображения в классе {@link ToStringReflection}.
 */
public class TestToString {
    /**
     * Проверяет корректность отображения полей
     * метода {@link ToStringReflection#showToString(Object)}, учитывая
     * <ul>
     *     <li> Поля, помеченные аннотацией {@link ToString}
     *     со свойством по умолчанию {@link Mode#YES}, должны быть выведены. </li>
     *     <li> Поля, не помеченные аннотацией {@link ToString} также должны быть выведены</li>
     *     <li> Поля, помеченные аннотацией {@link ToString} со свойством
     *     {@link Mode#NO}, не должны быть выведены. </li>
     * </ul>
     * @see ToString
     */
    @Test
    void testShowToString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));

        try {
            OtherWeapon machineGun = new OtherWeapon(5,7);
            ToStringReflection.showToString(machineGun);
            String result = out.toString();
            assertTrue(result.contains("magazineCapacity = "));
            assertFalse(result.contains("cartridge"));

        } finally {
            System.setOut(original);
        }
    }
}
