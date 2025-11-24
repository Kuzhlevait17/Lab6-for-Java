package ru.kuzhleva.main;

import ru.kuzhleva.errors.ErrorChecker;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.Guns;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.Kitty;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.OtherWeapon;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.ShooterCopy;
import ru.kuzhleva.lab6.annotations.Reflections.*;

public class Main6 {
    public void show() {
        ErrorChecker errorChecker = new ErrorChecker();
        int task, userCartridge,userStorage;
        boolean run;
        String userName;
        run = true;
        while (run) {
            System.out.println("""
                        Добро пожаловать!
                        Перед вами лабораторная работа 6.
                        Всего в лабораторной работе 8 задач:
                        1. Аннотация @Invoke
                        2. Аннотация @Default
                        3. Аннотация @ToString
                        4. Аннотация @Validate
                        5. Аннотация @Two
                        6. Аннотация @Cache
                        7. Тест @ToString
                        8. Тест @Validate
                        0. ЗАВЕРШЕНИЕ РАБОТЫ ЛАБОРАТОРНОЙ РАБОТЫ
                        """);
            System.out.print("Введите число - номер задачи: ");
            task = errorChecker.checkInteger();
            switch (task) {
                case 0: {
                    System.out.println("Завершение работы лабораторной работы 6...");
                    run = false;
                    System.out.println();
                    break;
                }
                case 1: {
                    System.out.println("""
                            @Invoke.
                            Разработайте аннотацию @Invoke, со следующими характеристиками:
                            • Целью может быть только МЕТОД
                            • Доступна во время исполнения программы
                            • Не имеет свойств
                            Создайте класс, содержащий несколько методов, и проаннотируйте хотя бы один из них
                            аннотацией @Invoke.
                            Реализуйте обработчик (через Reflection API), который находит методы, отмеченные
                            аннотацией @Invoke, и вызывает их автоматически.
                            """);
                    System.out.println("""
                            В данном задании вам необходимо создать своего котика -
                            ввести имя котику. А мы применим аннотацию @Invoke.
                            """);
                    System.out.print("Введите имя котика: ");
                    userName = errorChecker.checkString();
                    try {
                        Kitty userKitty = new Kitty(userName);
                        InvokeReflection.showInvoke(userKitty);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("""
                            @Default.
                            Разработайте аннотацию @Default, со следующими характеристиками:
                            • Целью может быть ТИП или ПОЛЕ
                            • Доступна во время исполнения программы
                            • Имеет обязательное свойство value типа Class
                            Проаннотируйте какой-либо класс данной аннотацией, указав тип по умолчанию.
                            Напишите обработчик, который выводит имя указанного класса по умолчанию.
                            """);
                    System.out.println("""
                            В данном задании вам необходимо ввести два числа -
                            количество пуль в пистолете и вместимость пистолета.
                            Количество пуль не может быть отрицательным числом.
                            Вместимость пистолета не может быть неположительным числом.
                            А мы выведем имя класса, в котором создаем пистолет.
                            """);
                    while (true) {
                        System.out.print("Введите целое неотрицательное число - количество пуль: ");
                        userCartridge = errorChecker.checkInteger();
                        if (userCartridge < 0) {
                            System.out.println("Введено неверное значение.");
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        System.out.print("Введите целое положительное число - вместимость магазина: ");
                        userStorage = errorChecker.checkInteger();
                        if (userStorage <= 0) {
                            System.out.println("Введено неверное значение.");
                        } else {
                            break;
                        }
                    }
                    try {
                        Guns guns = new Guns(userCartridge, userStorage);
                        DefaultReflection.showDefault(guns);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("""
                            @ToString.
                            Разработайте аннотацию @ToString, со следующими характеристиками:
                            • Целью может быть ТИП или ПОЛЕ
                            • Доступна во время исполнения программы
                            • Имеет необязательное свойство value c двумя вариантами значений: YES или NO
                            • Значение свойства по умолчанию: YES
                            Проаннотируйте класс аннотацией @ToString, а одно из полей – с @ToString(Mode.NO).
                            Создайте метод, который формирует строковое представление объекта, учитывая только те поля,
                            где @ToString имеет значение YES.
                            """);
                    System.out.println("""
                            В данном задании вам необходимо ввести два числа -
                            количество пуль в автомате и вместимость автомата.
                            Количество пуль не может быть отрицательным числом.
                            Вместимость пистолета не может быть неположительным числом.
                            А мы выведем строковое представление объекта, в котором
                            @ToString имеет значение YES/
                            """);
                    while (true) {
                        System.out.print("Введите целое неотрицательное число - количество пуль: ");
                        userCartridge = errorChecker.checkInteger();
                        if (userCartridge < 0) {
                            System.out.println("Введено неверное значение.");
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        System.out.print("Введите целое положительное число - вместимость магазина: ");
                        userStorage = errorChecker.checkInteger();
                        if (userStorage <= 0) {
                            System.out.println("Введено неверное значение.");
                        } else {
                            break;
                        }
                    }
                    try {
                        OtherWeapon machineGun = new OtherWeapon(userCartridge, userStorage);
                        ToStringReflection.showToString(machineGun);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("""
                            @Validate.
                            Разработайте аннотацию @Validate, со следующими характеристиками:
                            • Целью может быть ТИП или АННОТАЦИЯ
                            • Доступна во время исполнения программы
                            • Имеет обязательное свойство value, типа Class[]
                            Проаннотируйте класс аннотацией @Validate, передав список типов для проверки.
                            Реализуйте обработчик, который выводит, какие классы указаны в аннотации.
                            """);
                    System.out.println("""
                            В данном задании вам необходимо будет ввести
                            имя стрелка, а мы выведем классы, которые указаны
                            в аннотации @Validate.
                            """);
                    System.out.print("Введите имя стрелка: ");
                    userName = errorChecker.checkString();
                    try {
                        ShooterCopy shooterCopy = new ShooterCopy(userName);
                        ValidateReflection.showValidation(shooterCopy);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.println("""
                            @Two.
                            Разработайте аннотацию @Two, со следующими характеристиками:
                            • Целью может быть ТИП
                            • Доступна во время исполнения программы
                            • Имеет два обязательных свойства: first типа String и second типа int
                            Проаннотируйте какой-либо класс аннотацией @Two, передав строковое и числовое значения.
                            Реализуйте обработчик, который считывает и выводит значения этих свойств.
                            """);
                    System.out.println("""
                            В данном задании вам необходимо создать своего котика -
                            ввести имя котику. А мы применим аннотацию @Two
                            и выведем два значения.
                            """);
                    System.out.print("Введите имя котика: ");
                    userName = errorChecker.checkString();
                    try {
                        Kitty userKitty = new Kitty(userName);
                        TwoReflection.ShowTwo(userKitty);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    System.out.println();
                    break;
                }
                case 6: {
                    System.out.println("""
                            @Cache.
                            Разработайте аннотацию @Cache, со следующими характеристиками:
                            • Целью может быть ТИП
                            • Доступна во время исполнения программы
                            • Имеет необязательное свойство value, типа String[]
                            • Значение свойства по умолчанию: пустой массив
                            Проаннотируйте класс аннотацией @Cache, указав несколько кешируемых областей.
                            Создайте обработчик, который выводит список всех кешируемых областей или сообщение, что
                            список пуст.
                            """);
                    System.out.println("""
                            В данном задании вам необходимо будет ввести
                            имя стрелка, а мы выведем список всех кешируемых областей.
                            """);
                    System.out.print("Введите имя стрелка: ");
                    userName = errorChecker.checkString();
                    try {
                        ShooterCopy shooterCopy = new ShooterCopy(userName);
                        CacheReflection.showCache(shooterCopy);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    System.out.println();
                    break;
                }
                case 7: {
                    System.out.println("""
                             Напишите тест, используя фреймворк JUnit, к методу toString() (или методу, формирующему
                            строковое представление объекта, основанное на аннотации @ToString).
                            • Проверить, что в результирующей строке отображаются только те поля, которые имеют
                            аннотацию @ToString(Mode.YES) или не аннотированы вовсе.
                            • Убедиться, что поля с @ToString(Mode.NO) не попадают в вывод.
                            """);
                    System.out.println("Работу тестирования можно посмотреть в пакете tests/testinglab6/TestToString");
                    System.out.println();
                    break;
                }
                case 8: {
                    System.out.println("""
                            Написать тест, используя фреймворк JUnit, который проверяет корректность работы механизма
                            валидации классов, отмеченных аннотацией @Validate.
                            • Создать класс с аннотацией @Validate, указывающей массив типов для проверки.
                            • Использовать тест, который вызывает обработчик и проверяет, что список классов,
                            переданный в аннотации, корректно извлекается и при передаче пустого массива
                            выбрасывается исключение IllegalArgumentException.
                            • В тесте использовать аннотацию @Test с параметром expected (или assertThrows в JUnit 5)
                            """);
                    System.out.println("Работу тестирования можно посмотреть в пакете tests/testinglab6/TestValidate");
                    System.out.println();
                    break;
                }
                default: {
                        System.out.println("Введен неверный номер задания.");
                        break;
                }
            }
        }
        System.out.println("Работа лабораторной работы 6 завершена.");
    }
}
