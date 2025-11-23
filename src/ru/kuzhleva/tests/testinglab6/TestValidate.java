package ru.kuzhleva.tests.testinglab6;

import org.junit.jupiter.api.Test;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.ShooterCopy;
import ru.kuzhleva.lab6.annotations.BasicAnnotations.Validate;
import ru.kuzhleva.lab6.annotations.Reflections.ValidateReflection;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Класс, проверяющий корректность работы аннотации {@link Validate}
 * и механизма отображения в классе {@link ValidateReflection}
 */
public class TestValidate {
    /**
     * Проверяет корректность извлечения списка при вызове работы метода
     * {@link ValidateReflection#showValidation(Object)}.
     * @see ValidateReflection
     */
    @Test
    void testValidate() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));

        try {
            ShooterCopy shooterCopy = new ShooterCopy("Alex");
            ValidateReflection.showValidation(shooterCopy);
            String result = out.toString();
            assertTrue(result.contains("ShooterCopy"));
            assertTrue(result.contains("WeaponCopy"));
        } finally {
            System.setOut(original);
        }
    }

    /**
     * Проверяет, что при использовании аннотации {@link Validate}
     * с пустым массивом метод {@link ValidateReflection#showValidation(Object)}
     * выбрасывает исключение {@link IllegalArgumentException}
     * @see ValidateReflection
     */
    @Test
    void testEmptyAnnotationThrowException() {

        @Validate({})
        class TestClass {}

        TestClass obj = new TestClass();

        assertThrows(IllegalArgumentException.class,() -> ValidateReflection.showValidation(obj));
    }
}
