package ru.kuzhleva.main;

import ru.kuzhleva.errors.ErrorChecker;
import ru.kuzhleva.lab4.compare.*;
import ru.kuzhleva.lab4.lists.*;
import ru.kuzhleva.lab4.generics.*;
import java.util.*;

public class Main4 {
    public void show() {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(2,3,4,5),
                Arrays.asList(2,4,6,7,8,8)
        );

        List<List<Integer>> lists2 = Arrays.asList(
                Arrays.asList(-1,-2,-3),
                Arrays.asList(2,-3,4,-5),
                Arrays.asList(2,4,6,7,8,8)
        );
        List<String> string = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> integer = Arrays.asList(1,-7,3);

        ErrorChecker errors = new ErrorChecker();
        boolean run, runner, running;
        int choice, additionalChoice, anotherChoice, userNumber1,userNumber2;
        double user1, user2;
        String first,second;

        run = true;
        while(run) {
            System.out.println("""
                    Добро пожаловать!
                    Перед вами 4 лабораторная работа по Java.
                    Всего есть на выбор 3 задачи.
                    1. Сравнимое, обобщенный изменяемый массив.
                    2. Заполнение списка.
                    3. Функция, фильтр, сокращение, коллекционирование.
                    0. ВЫХОД ИЗ ПРОГРАММЫ.
                    """);
            System.out.print("Введите число - номер задачи: ");
            choice = errors.checkInteger();
            switch (choice) {
                case 0: {
                    System.out.println("Завершение работы подпрограммы....");
                    System.out.println("""
                            *
                            * *
                            * * *
                            * * * *
                            * * * * *
                            """);
                    run = false;
                    break;
                }
                case 1: {
                    runner = true;
                    while (runner) {
                        System.out.println("""
                                1. Данная задача делится на две подзадачи:
                                |
                                | __ 1. Сравнимое.
                                |
                                | __ 2. Обобщенный изменяемый массив.
                                |
                                | __ 0. ЗАВЕРШЕНИЕ РАБОТЫ ЗАДАЧИ.
                                
                                """);
                        System.out.print("Напишите цифру (0-2) - номер задачи: ");
                        additionalChoice = errors.checkInteger();
                        switch (additionalChoice) {
                            case 0: {
                                System.out.println("Завершение работы задачи...");
                                System.out.println("""
                                        *
                                        * *
                                        * * *
                                        """);
                                runner = false;
                                break;
                            }
                            case 1: {
                                System.out.println("""
                                        Сравнимое.
                                        Создайте ссылочный тип Сравнимое, гарантирующий наличие по данной ссылке метода со
                                        следующими характеристиками:
                                         Называется “сравнить”
                                         Принимает объект.
                                         Тип принимаемого объекта может быть изменен без изменения самого Сравнимого.
                                         Возвращает целое число
                                        """);
                                System.out.println("""
                                        Замечание. В результате сравнения
                                        0 означает, что объекты равны.
                                        Остальные числа означают, что значения неравны.
                                        """);
                                MyNumber<String> line22 = new MyNumber<>("Кошечка Пушин");
                                MyNumber<String> line23 = new MyNumber<>("Кошечка Пушин");
                                MyNumber<String> line24 = new MyNumber<>("Котик Попик");

                                MyNumber<Integer> number1 = new MyNumber<>(5);
                                MyNumber<Integer> number2 = new MyNumber<>(6);
                                MyNumber<Integer> number3 = new MyNumber<>(7);
                                MyNumber<Integer> number4 = new MyNumber<>(7);

                                MyNumber<Double> number5 = new MyNumber<>(2.3);
                                MyNumber<Double> number6 = new MyNumber<>(2.4);

                                System.out.println("Сравним два числа: 5 и 6");
                                int result1 = number1.compareTo(number2);
                                System.out.println("Результат сравнения: " +  result1 + '\n');

                                System.out.println("Сравним два других числа: 7 и 7");
                                int result2 = number3.compareTo(number4);
                                System.out.println("Результат сравнения: " + result2 + '\n');

                                System.out.println("Сравним две строчки: Кошечка Пушин и Кошечка Пушин.");
                                int result22 = line22.compareTo(line23);
                                System.out.println("Результат сравнения: " + result22 + '\n');

                                System.out.println("Сравним две строчки: Кошечка Пушин и Котик Попик.");
                                int result23 = line23.compareTo(line24);
                                System.out.println("Результат сравнения: " + result23 + '\n');

                                System.out.println("Сравним два нецелых числа: 2.3 и 2.4");
                                int result24 = number5.compareTo(number6);
                                System.out.println("Результат сравнения: " + result24 + '\n');

                                running = true;
                                while (running) {
                                    System.out.println("""
                                            Сейчас вам необходимо будет выбрать тип переменной:
                                            1. Integer (целое)
                                            2. Double (c плавающей точкой)
                                            3. String
                                            0. Завершение работы подзадачи.
                                            """);
                                    System.out.print("Введите число - тип переменной: ");
                                    anotherChoice = errors.checkInteger();
                                    switch (anotherChoice) {
                                        case 0: {
                                            System.out.println("Завершение работы....");
                                            running = false;
                                            break;
                                        }
                                        case 1: {
                                            System.out.println("""
                                                    1. Integer.
                                                    Вам необходимо будет ввести два целых числа,
                                                    а мы их сравним.
                                                    Например, 7.
                                                    """);
                                            System.out.print("Введите значение первого числа: ");
                                            userNumber1 = errors.checkInteger();
                                            MyNumber<Integer> userFirst = new MyNumber<>(userNumber1);
                                            System.out.println("Введите значение второго числа: ");
                                            userNumber2 = errors.checkInteger();
                                            MyNumber<Integer> userSecond = new MyNumber<>(userNumber2);
                                            int userResult;
                                            userResult = userFirst.compareTo(userSecond);
                                            System.out.println("Результат сравнения: " + userResult + '\n');
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("""
                                                    2. Double
                                                    Вам необходимо будет ввести два числа c плавающей точкой,
                                                    а мы их сравним.
                                                    Например, 7.77
                                                    """);
                                            System.out.print("Введите значение первого числа: ");
                                            user1 = errors.checkDouble();
                                            MyNumber<Double> userFirst = new MyNumber<>(user1);
                                            System.out.print("Введите значение второго числа: ");
                                            user2 = errors.checkDouble();
                                            MyNumber<Double> userSecond = new MyNumber<>(user2);
                                            int userResult;
                                            userResult = userFirst.compareTo(userSecond);
                                            System.out.println("Результат сравнения: " + userResult + '\n');
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("""
                                                    3. String
                                                    Вам необходимо будет ввести две строки,
                                                    а мы их сравним.
                                                    Например, Кошечка Пушин!
                                                    """);
                                            System.out.print("Введите значение первой строки: ");
                                            first = errors.checkString();
                                            MyNumber<String> userFirst = new MyNumber<>(first);
                                            System.out.println("Введите значение второй строки: ");
                                            second = errors.checkString();
                                            MyNumber<String> userSecond = new MyNumber<>(second);
                                            int userResult;
                                            userResult = userFirst.compareTo(userSecond);
                                            System.out.println("Результат сравнения: " + userResult + '\n');
                                            break;
                                        }
                                        default: {
                                            System.out.println("Введено неверное значение.\n");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("""
                                        Обобщенный изменяемый массив
                                        Измените решение любой задачи 2.2.1 таким образом, чтобы тип хранимого в массиве значения
                                        задавался во время создания объекта.
                                        """);
                                FillTheList<Integer> numbers = new FillTheList<> (new Integer[] {1,2,3,4,5,6,7});
                                FillTheList<String> pusheen = new FillTheList<>(new String[] {"Кошечка Пушин", "Пушин", "Pusheen", "Pusheen the cat"});

                                System.out.println("Массив имеет вид: ");
                                System.out.println(numbers);
                                System.out.println("Пуст ли массив? " + numbers.isEmpty());
                                System.out.println("Значение на пятой позиции: " + numbers.positionN(4));
                                System.out.println("Размер массива: " + numbers.size() + '\n');
                                System.out.println("Массив имеет вид: ");
                                System.out.println(pusheen);
                                System.out.println("Пуст ли массив? " + pusheen.isEmpty());
                                System.out.println("Значение на первой позиции: " + pusheen.positionN(0));
                                System.out.println("Размер массива: " + pusheen.size() + '\n');

                                running = true;
                                while (running) {
                                    System.out.println("""
                                            Сейчас вам необходимо будет выбрать тип переменной:
                                            1. Integer (целое)
                                            2. Double (c плавающей точкой)
                                            3. String
                                            0. Завершение работы подзадачи.
                                            """);
                                    System.out.print("Введите число - тип переменной: ");
                                    anotherChoice = errors.checkInteger();
                                    switch (anotherChoice) {
                                        case 0: {
                                            System.out.println("Завершение работы....\n");
                                            running = false;
                                            break;
                                        }
                                        case 1: {
                                            System.out.println(" 1. Integer ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            Integer[] userArray = new Integer[userNumber1];
                                            for (int i = 0; i < userArray.length; i++ ){
                                                System.out.print("Введите значение " + (i+1) + "-ого элемента: ");
                                                userArray[i] = errors.checkInteger();
                                            }
                                            FillTheList<Integer> userArr = new FillTheList<>(userArray);
                                            System.out.println("Массив имеет вид: ");
                                            System.out.println(userArr);
                                            System.out.println("Пуст ли массив? " + userArr.isEmpty());
                                            System.out.println("Значение на первой позиции: " + userArr.positionN(0));
                                            System.out.println("Размер массива: " + userArr.size());
                                            System.out.println();
                                            break;
                                        }
                                        case 2: {
                                            System.out.println(" 2. Double ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            Double[] userArray = new Double[userNumber1];
                                            for (int i = 0; i < userArray.length; i++ ){
                                                System.out.print("Введите значение " + (i+1) + "-ого элемента: ");
                                                userArray[i] = errors.checkDouble();
                                            }
                                            FillTheList<Double> userArr = new FillTheList<>(userArray);
                                            System.out.println("Массив имеет вид: ");
                                            System.out.println(userArr);
                                            System.out.println("Пуст ли массив? " + userArr.isEmpty());
                                            System.out.println("Значение на первой позиции: " + userArr.positionN(0));
                                            System.out.println("Размер массива: " + userArr.size());
                                            System.out.println();
                                            break;
                                        }
                                        case 3: {
                                            System.out.println(" 3. String ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            String[] userArray = new String[userNumber1];
                                            for (int i = 0; i < userArray.length; i++ ){
                                                System.out.print("Введите значение " + (i+1) + "-ого элемента: ");
                                                userArray[i] = errors.checkString();
                                            }
                                            FillTheList<String> userArr = new FillTheList<>(userArray);
                                            System.out.println("Массив имеет вид: ");
                                            System.out.println(userArr);
                                            System.out.println("Пуст ли массив? " + userArr.isEmpty());
                                            System.out.println("Значение на первой позиции: " + userArr.positionN(0));
                                            System.out.println("Размер массива: " + userArr.size());
                                            System.out.println();
                                            break;
                                        }
                                        default: {
                                            System.out.println("Введено неверное значение.\n");
                                            break;
                                        }
                                    }
                                }

                                break;
                            }
                            default: {
                                System.out.println("Введено неверное значение.");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("""
                            2. Заполнение списка.
                            Заполнение списка.
                            Создайте метод, который принимает список чисел (стандартный или из задачи 3.1.6) и заполняет
                            его значениями от 1 до 100. Метод должен принимать список с более чем одной параметризацией.
                            """);
                    List<Integer> list1 = new ArrayList<>();
                    List<Double> list2 = new ArrayList<>();
                    List<Float> list3 = new ArrayList<>();
                    List<Long> list4 = new ArrayList<>();

                    GeneralizedImmutableList.fillList(list1, Integer.class);
                    GeneralizedImmutableList.fillList(list2, Double.class);
                    GeneralizedImmutableList.fillList(list3, Float.class);
                    GeneralizedImmutableList.fillList(list4, Long.class);

                    System.out.println("Integer: " + "\n" + list1 + "\n");
                    System.out.println("Double: " + " \n" + list2 + "\n");
                    System.out.println("Float: " + "\n" + list3 + "\n");
                    System.out.println("Long:" + "\n" + list4 + "\n");
                    break;
                }
                case 3: {
                    runner = true;
                    while (runner) {
                        System.out.println("""
                                
                                1. Данная задача делится на четыре подзадачи:
                                |
                                | __ 1. Функция.
                                |
                                | __ 2. Фильтр.
                                |
                                | __ 3. Сокращение.
                                |
                                | __ 4. Коллекционирование.
                                |
                                | __ 0. ЗАВЕРШЕНИЕ РАБОТЫ ЗАДАНИЯ.
                                """);
                        System.out.print("\n" + "Напишите цифру (0-4) - номер задачи:");
                        additionalChoice = errors.checkInteger();
                        switch (additionalChoice) {
                            case 0: {
                                System.out.println("Завершение работы задания...");
                                System.out.println("""
                                        *
                                        * *
                                        * * *
                                        """);
                                runner = false;
                                break;
                            }
                            case 1: {
                                System.out.println("""
                                        Функция.
                                        Разработайте такой метод, который будет принимать список значений типа T, и объект имеющий
                                        единственный метод apply. Данный метод надо применить к каждому элементу списка, и вернуть
                                        новый список значений типа P, при этом типы T и P могут совпадать, а могут не совпадать.
                                        Используйте разработанный метод следующим образом:
                                        1. Передайте в метод список со значениями:“qwerty”, “asdfg”, “zx”, а получите список чисел,
                                        где каждое число соответствует длине каждой строки.
                                        2. Передайте в метод список со значениями: 1,-3,7, а получите список в котором все
                                        отрицательные числа стали положительными, а положительные остались без изменений
                                        3. Передайте в метод список состоящий из массивов целых чисел, а получите список в
                                        котором будут только максимальные значения каждого из исходных массивов
                                        """);
                                System.out.println("Массив со строками: " + string);
                                List<Integer> lengths = FunctionUnits.map(string, String::length);
                                System.out.println("Длины строк: " + lengths);
                                System.out.println("Массив с цифрами: " + integer);
                                List<Integer> positive = FunctionUnits.map(integer, integer1 -> Math.abs(integer1));
                                System.out.println("Цифры: " + positive);
                                List<int[]> arrays = Arrays.asList(
                                        new int[] {1,2,3},
                                        new int[] {3,4,5},
                                        new int[] {5,6,7}
                                );
                                System.out.println("Массивы: ");
                                for (int[] arr : arrays) {
                                    System.out.println(Arrays.toString(arr));
                                }
                                List<Integer> max = FunctionUnits.map(arrays, arr -> {
                                            int maximum = arr[0];
                                            for (int value : arr) {
                                                if (value > maximum) {
                                                    maximum = value;
                                                }
                                            }
                                            return maximum;
                                        }
                                );
                                System.out.println("Максимумы: " + max);
                                System.out.println();

                                running = true;
                                while (running) {
                                    System.out.println("""
                                            
                                            Сейчас вам необходимо будет выбрать тип переменной:
                                            1. Integer (целое)
                                            3. String (строка)
                                            0. Завершение работы подзадачи.
                                            """);
                                    System.out.print("Введите число - тип переменной: ");
                                    anotherChoice = errors.checkInteger();
                                    switch (anotherChoice) {
                                        case 0: {
                                            System.out.println("Завершение работы....\n");
                                            running = false;
                                            break;
                                        }
                                        case 1: {
                                            System.out.println(" 1. Integer ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            List<Integer> userArray = new ArrayList<>();
                                            for (int i = 0; i < userNumber1; i++) {
                                                System.out.print("Введите значение " + (i + 1) + "-ого элемента: ");
                                                userArray.add(errors.checkInteger());
                                            }
                                            List<Integer> positiveUser = FunctionUnits.map(userArray, integer1 -> Math.abs(integer1));
                                            System.out.println("Цифры: " + positiveUser);
                                            break;
                                        }
                                        case 3: {
                                            System.out.println(" 3. String ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            List<String> userArray = new ArrayList<>();
                                            for (int i = 0; i < userNumber1; i++) {
                                                System.out.print("Введите значение " + (i + 1) + "-ого элемента: ");
                                                userArray.add(errors.checkString());
                                            }
                                            List<Integer> lengthsUser = FunctionUnits.map(userArray, String::length);
                                            System.out.println("Длины строк: " + lengthsUser);
                                            break;
                                        }
                                        default: {
                                            System.out.println("Введено неверное значение.\n");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("""
                                        Фильтр.
                                        Разработайте такой метод, который будет принимать список значений типа T и объект имеющий
                                        единственный метод test (принимает T и возвращает boolean). Верните новый список типа T, из
                                        которого удалены все значения не прошедшие проверку условием.
                                        Используйте разработанный метод следующим образом:
                                        1. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, и отфильтруйте все
                                        строки имеющие менее трех символов
                                        2. Передайте в метод список со значениями: 1,-3,7, и отфильтруйте все положительные
                                        элементы
                                        3. Передайте в метод список состоящий из массивов целых чисел, а получите список в
                                        котором будут только те массивы, в которых нет ни одного положительного элемента
                                        """);
                                System.out.println("Массив со строками: " + string);
                                List<String> res1 = Filters.filter(string, s -> s.length() >= 3);
                                System.out.println("Длины слов больше 2: " + res1);
                                System.out.println("Массив с цифрами: " + integer);
                                List<Integer> res2 = Filters.filter(integer, x -> x<0);
                                System.out.println("Неположительные элементы элементы: " + res2);
                                System.out.println("Массивы: ");
                                for (List<Integer> list : lists2) {
                                    System.out.println(list);
                                }
                                List<List<Integer>> res3 = Filters.filter(lists2, arr -> {
                                            for (Integer element : arr) {
                                                if (element > 0) {
                                                    return false;
                                                }
                                            }
                                            return true;
                                        }
                                );
                                System.out.println("Элементы массивов с отрицательными элементами: " + res3);
                                running = true;
                                while (running) {
                                    System.out.println("""
                                            
                                            Сейчас вам необходимо будет выбрать тип переменной:
                                            1. Integer (целое)
                                            3. String (строка)
                                            0. Завершение работы подзадачи.
                                            """);
                                    System.out.print("Введите число - тип переменной: ");
                                    anotherChoice = errors.checkInteger();
                                    switch (anotherChoice) {
                                        case 0: {
                                            System.out.println("Завершение работы....\n");
                                            running = false;
                                            break;
                                        }
                                        case 1: {
                                            System.out.println(" 1. Integer ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            List<Integer> userArray = new ArrayList<>();
                                            for (int i = 0; i < userNumber1; i++) {
                                                System.out.print("Введите значение " + (i + 1) + "-ого элемента: ");
                                                userArray.add(errors.checkInteger());
                                            }
                                            List<Integer> resUser = Filters.filter(userArray, x -> x < 0);
                                            System.out.println("Неположительные элементы элементы: " + resUser);
                                            break;
                                        }
                                        case 3: {
                                            System.out.println(" 3. String ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            List<String> userArray = new ArrayList<>();
                                            for (int i = 0; i < userNumber1; i++) {
                                                System.out.print("Введите значение " + (i + 1) + "-ого элемента: ");
                                                userArray.add(errors.checkString());
                                            }
                                            List<String> resUser = Filters.filter(userArray, s -> s.length() >= 3);
                                            System.out.println("Длины слов больше 2: " + resUser);
                                            break;
                                        }
                                        default: {
                                            System.out.println("Введено неверное значение.\n");
                                            break;
                                        }
                                    }
                                }
                                System.out.println();
                                break;
                            }
                            case 3: {
                                System.out.println("""
                                        Сокращение.
                                        Разработайте такой метод, который будет принимать список значений типа T и способ с помощью
                                        которого список значений можно свести к одному значению типа T, которое и возвращается из
                                        метода.
                                        Используйте разработанный метод следующим образом:
                                        1. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, и сформируйте одну
                                        большую строку, которая состоит из всех строк исходного списка.
                                        2. Передайте в метод список со значениями: 1,-3,7, и верните сумму всех значений исходного
                                        списка.
                                        3. Имеется список, состоящий из списков целых чисел, получите общеe количество
                                        элементов во всех списках. Подсказка: решить задачу можно в одно действие или
                                        последовательно использовать методы из 3.3.1 и 3.3.3.
                                        Далее необходимо изменить разработанный метод таким образом, чтобы данный метод
                                        гарантированно не возвращал null и не выбрасывал ошибок в том случае, если исходный список
                                        пуст.
                                        """);
                                System.out.println("Массив со строками: " + string);
                                String concat = Reduction.reduce(string, "", (a, b) -> (a + b));
                                System.out.println("Результирующая строка: " + concat);
                                System.out.println("Массив с цифрами: " + integer);
                                int resulting = Reduction.reduce(integer, 0, (a, b) -> a + b);
                                System.out.println("Сумма элементов в массиве: " + resulting);
                                System.out.println("Массивы: ");
                                for (List<Integer> list : lists) {
                                    System.out.println(list);
                                }

                                List<Integer> sizes = new ArrayList<>();
                                for (List<Integer> innerList : lists) {
                                    sizes.add(innerList.size());
                                }
                                int amount = Reduction.reduce(sizes, 0, (a, b) -> a + b);
                                System.out.println("Количество элементов во всех массивах: " + amount);
                                List<Integer> emptyList = Arrays.asList();
                                int sum = Reduction.reduce(emptyList, 0, Integer::sum);
                                System.out.println("Сумма пустого списка: " + sum);
                                List<String> emptyStrings = Arrays.asList();
                                String concatenated = Reduction.reduce(emptyStrings, "", String::concat);
                                System.out.println("Конкатенация пустого списка: \"" + concatenated + "\"");
                                running = true;
                                while (running) {
                                    System.out.println("""
                                            
                                            Сейчас вам необходимо будет выбрать тип переменной:
                                            1. Integer (целое)
                                            3. String (строка)
                                            0. Завершение работы подзадачи.
                                            """);
                                    System.out.print("Введите число - тип переменной: ");
                                    anotherChoice = errors.checkInteger();
                                    switch (anotherChoice) {
                                        case 0: {
                                            System.out.println("Завершение работы....\n");
                                            running = false;
                                            break;
                                        }
                                        case 1: {
                                            System.out.println(" 1. Integer ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            List<Integer> userArray = new ArrayList<>();
                                            for (int i = 0; i < userNumber1; i++) {
                                                System.out.print("Введите значение " + (i + 1) + "-ого элемента: ");
                                                userArray.add(errors.checkInteger());
                                            }
                                            int userAmount = Reduction.reduce(userArray, 0, (a, b) -> a + b);
                                            System.out.println("Сумма элементов в массиве: " + userAmount);
                                            break;
                                        }
                                        case 3: {
                                            System.out.println(" 3. String ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            List<String> userArray = new ArrayList<>();
                                            for (int i = 0; i < userNumber1; i++) {
                                                System.out.print("Введите значение " + (i + 1) + "-ого элемента: ");
                                                userArray.add(errors.checkString());
                                            }
                                            String concatUser = Reduction.reduce(userArray, "", (a, b) -> (a + b));
                                            System.out.println("Результирующая строка: " + concatUser);
                                            break;
                                        }
                                        default: {
                                            System.out.println("Введено неверное значение.\n");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("""
                                        Коллекционирование.
                                        Разработайте такой метод, который будет возвращать коллекцию типа P со значениями типа T.
                                        Данный метод будет принимать:
                                        1. Список исходных значений
                                        2. Способ создания результирующей коллекции
                                        3. Способ передачи значений исходного списка в результирующую коллекцию.
                                        Используйте разработанный метод следующим образом:
                                        1. Передайте в метод список со значениями: 1,-3,7, и верните их разбитыми на два
                                        подсписка, в одном из которых будут только положительные числа, а в другом только
                                        отрицательные.
                                        2. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, “qw” и верните их
                                        разбитыми на подсписки таким образом, чтобы в любом подсписке были строки только
                                        одинаковой длины
                                        3. Передайте в метод список со значениями: “qwerty”, “asdfg”, “qwerty”, “qw” и верните набор
                                        такого вида, который не может содержать одинаковые объекты.
                                        """);

                                List<String> words = List.of("qwerty", "asdfg", "zx", "qw");
                                System.out.println("Массив со строками: " + words);
                                System.out.println("Массивы со словами одинаковой длины: ");
                                Map<Integer, List<String>> grouped = Collectability.collectValues(
                                        words,
                                        HashMap::new,
                                        (map, str) -> map.computeIfAbsent(str.length(), k -> new ArrayList<>()).add(str)
                                );

                                System.out.println(grouped);
                                List<String> data = List.of("qwerty", "asdfg", "qwerty", "qw");
                                System.out.println("Массив со строками: " + data);
                                System.out.println("Массив уникальных значений: ");
                                Set<String> unique = Collectability.collectValues(
                                        data,
                                        HashSet::new,
                                        Set::add
                                );
                                System.out.println(unique);
                                System.out.println("Массив со цифрами: " + integer);
                                System.out.println("Массивы положительных и отрицательных чисел:");
                                Map<String, List<Integer>> result = Collectability.collectValues(
                                        integer,
                                        HashMap::new, // Создаем новый контейнер (supplier)
                                        // Добавляем элементы (BiContainer)
                                        (map, num) -> {
                                            String key = num > 0 ? "positive" : "negative";
                                            map.computeIfAbsent(key, k -> new ArrayList<>()).add(num);
                                        }
                                );
                                System.out.println(result);

                                running = true;
                                while (running) {
                                    System.out.println("""
                                            
                                            Сейчас вам необходимо будет выбрать тип переменной:
                                            1. Integer (целое)
                                            3. String (строка)
                                            0. Завершение работы подзадачи.
                                            """);
                                    System.out.print("Введите число - тип переменной: ");
                                    anotherChoice = errors.checkInteger();
                                    switch (anotherChoice) {
                                        case 0: {
                                            System.out.println("Завершение работы....\n");
                                            running = false;
                                            break;
                                        }
                                        case 1: {
                                            System.out.println(" 1. Integer ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            List<Integer> userArray = new ArrayList<>();
                                            for (int i = 0; i < userNumber1; i++) {
                                                System.out.print("Введите значение " + (i + 1) + "-ого элемента: ");
                                                userArray.add(errors.checkInteger());
                                            }
                                            System.out.println("Массивы положительных и отрицательных чисел:");
                                            Map<String, List<Integer>> resultUser = Collectability.collectValues(
                                                    userArray,
                                                    HashMap::new, // Создаем новый контейнер (supplier)
                                                    // Добавляем элементы (BiContainer)
                                                    (map, num) -> {
                                                        String key = num > 0 ? "positive" : "negative";
                                                        map.computeIfAbsent(key, k -> new ArrayList<>()).add(num);
                                                    }
                                            );
                                            System.out.println(resultUser);
                                            break;
                                        }
                                        case 3: {
                                            System.out.println(" 3. String ");
                                            System.out.print("Введите целое число - количество элементов массива: ");
                                            userNumber1 = errors.checkInteger();
                                            List<String> userArray = new ArrayList<>();
                                            for (int i = 0; i < userNumber1; i++) {
                                                System.out.print("Введите значение " + (i + 1) + "-ого элемента: ");
                                                userArray.add(errors.checkString());
                                            }
                                            System.out.println("Массив со строками: " + userArray);
                                            System.out.println("Массив уникальных значений: ");
                                            Set<String> uniqueUser = Collectability.collectValues(
                                                    userArray,
                                                    HashSet::new,
                                                    Set::add
                                            );
                                            System.out.println(uniqueUser);
                                            break;
                                        }
                                        default: {
                                            System.out.println("Введено неверное значение.\n");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("Подпрограмма завершена....");
    }
}
