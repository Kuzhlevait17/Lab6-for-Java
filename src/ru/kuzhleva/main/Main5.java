package ru.kuzhleva.main;

import ru.kuzhleva.errors.ErrorChecker;
import ru.kuzhleva.lab5.Collectioning.ListOfValues;
import ru.kuzhleva.lab5.Collectioning.Maps;
import ru.kuzhleva.lab5.Collectioning.Queues;
import ru.kuzhleva.lab5.Collectioning.Sets;
import ru.kuzhleva.lab5.Patterns.Cat;
import ru.kuzhleva.lab5.Patterns.CountingMeowDecorator;
import ru.kuzhleva.lab5.Patterns.FractionProxy;
import ru.kuzhleva.lab5.stream.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main5 {
    private final ErrorChecker errorChecker = new ErrorChecker();

    public void show() throws IOException {
        String userCat, temporary2, additionalString;
        double temporary3, additionalDouble;
        boolean run, running;
        int task, smallerTask, userNumber, additionalMeow,
                userAmount, temporary1, additionalInteger,
                numerator,denominator, newNumerator, newDenominator;
        run = true;
        while (run) {
            System.out.println("""
                    Добро пожаловать!
                    Перед вами лабораторная работа 5.
                    Всего в лабораторной работе 7 задач:
                    1. Шаблоны
                    2. Структурные шаблоны
                    3. Список
                    4. Мап
                    5. Сет
                    6. Очередь
                    7. Стрим
                    0. Завершение работы программы.
                    """);
            System.out.print("Введите число - номер задачи: ");
            task = errorChecker.checkInteger();
            switch (task) {
                case 0: {
                    System.out.println("Завершение работы лабораторной работы 5...");
                    run = false;
                    System.out.println();
                    break;
                }
                case 1: {
                    System.out.println("""
                            В класс Дробь, добавить интерфейс на два метода: получение вещественного значения, установка
                            числителя и установка знаменателя.
                            Сгенерировать такую версию дроби, которая будет кэшировать вычисление вещественного
                            значения.
                            Если раннее в вашем варианте не было Дроби, то создайте сущность Дробь со следующими
                            особенностями:
                            • Имеет числитель: целое число
                            • Имеет знаменатель: целое число
                            • Дробь может быть создана с указанием числителя и знаменателя
                            • Может вернуть строковое представление вида “числитель/знаменатель”
                            • Необходимо корректно обрабатывать отрицательные значения. Учтите, что знаменатель не может
                            быть отрицательным.
                            • Переопределите метод сравнения объектов по состоянию таким образом, чтобы две дроби
                            считались одинаковыми тогда, когда у них одинаковые значения числителя и знаменателя.
                            """);
                    FractionProxy fraction = new FractionProxy(4,5);
                    System.out.println("Дробь: " + fraction + '\n');
                    System.out.println("Значение: " + fraction.getValue() + '\n');
                    System.out.println("Значение повторно: " +fraction.getValue() + '\n');
                    System.out.println("Изменим числитель... ");
                    fraction.setNumerator(1);
                    System.out.println("Числитель равен 1." + '\n');
                    System.out.println("Дробь: " + fraction + '\n');
                    System.out.println("Значение: " + fraction.getValue() + '\n');
                    System.out.println("Значение повторно: " + fraction.getValue() + '\n');
                    System.out.println("Изменим знаменатель... ");
                    fraction.setDenominator(100);
                    System.out.println("Знаменатель равен 100." + '\n');
                    System.out.println("Дробь: " + fraction + '\n');
                    System.out.println("Значение: " + fraction.getValue() + '\n');
                    System.out.println("Значение повторно: " + fraction.getValue() + '\n');
                    System.out.println();
                    System.out.println("""
                            Сейчас вам необходимо будет создать
                            свою дробь и по взаимодействовать с ней.
                            Например, дробь 1/7
                            1 - числитель.
                            7 - знаменатель.
                            """);
                    System.out.print("Введите целое число - числитель дроби: ");
                    numerator = errorChecker.checkInteger();
                    System.out.print("Введите целое число - знаменатель дроби: ");
                    denominator = errorChecker.checkInteger();
                    FractionProxy userFraction = new FractionProxy(numerator,denominator);
                    System.out.println("Дробь: " + userFraction + '\n');
                    System.out.println("Значение: " + userFraction.getValue() + '\n');
                    System.out.println("Значение повторно: " + userFraction.getValue() + '\n');
                    try {
                        System.out.println("Изменим знаменатель...");
                        System.out.print("Введите целое число - значение нового знаменателя: ");
                        newDenominator = errorChecker.checkInteger();
                        userFraction.setDenominator(newDenominator);
                        System.out.println("Дробь: " + userFraction + '\n');
                        System.out.println("Значение: " + userFraction.getValue() + '\n');
                        System.out.println("Значение повторно: " + userFraction.getValue() + '\n');
                        System.out.println("Изменим числитель...");
                        System.out.print("Введите целое число - значение нового числителя: ");
                        newNumerator = errorChecker.checkInteger();
                        userFraction.setNumerator(newNumerator);
                        System.out.println("Дробь: " + userFraction + '\n');
                        System.out.println("Значение: " + userFraction.getValue() + '\n');
                        System.out.println("Значение повторно: " + userFraction.getValue() + '\n');
                        System.out.println();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    System.out.println("""
                            Количество мяуканий.
                            Необходимо воспользоваться классом Кот и методом принимающим всех мяукающих из задачи 2.5.4.
                            Необходимо таким образом передать кота в указанный метод, что бы после окончания его работы
                            узнать сколько раз мяукал кот за время его работы. На рисунке показан пример работы. Перед вызовом
                            метода создаем кота, отправляем ссылку на кота в метод, после окончания его работы выводим
                            количество мяуканий на экран. Кота изменять нельзя.
                            Если раннее в вашем варианте не было Кота, то создайте
                            1. сущность Кот, которая описывается следующим образом:
                            • Имеет Имя (строка)
                            • Для создания необходимо указать имя кота.
                            • Может быть приведен к текстовой форме вида: “кот: Имя”
                            • Может помяукать, что приводит к выводу на экран следующего текста: “Имя: мяу!”,
                            вызвать мяуканье можно без параметров.
                            2. интерфейс Мяуканье: разработайте метод, который принимает набор объектов способных
                            мяукать и вызывает мяуканье у каждого объекта. Мяукающие объекты должны иметь метод со
                            следующей сигнатурой:
                            public void meow();
                            """);
                    Cat cat = new Cat("Ириска");
                    CountingMeowDecorator meowing = new CountingMeowDecorator(cat);
                    meowing.meow();
                    meowing.meow();
                    for (int i = 0; i < 12; i ++) {
                        meowing.meow();
                    }
                    System.out.println(meowing.getMeowCount());
                    System.out.println(meowing);
                    System.out.println();

                    Random random = new Random();
                    additionalMeow = random.nextInt(1,11);
                    System.out.println("""
                            Давайте создадим вашего котика!
                            Вам необходимо будет ввести имя котика,
                            а так же количество мяуканий.
                            К количеству мяуканий также добавится
                            случайное число от 1 до 10.
                            """);

                    System.out.print("Введите имя котика: ");
                    userCat = errorChecker.checkString();
                    Cat userKitty = new Cat(userCat);
                    System.out.print("Введите целое положительное число - количество мяуканий котика: ");
                    userNumber = errorChecker.checkInteger();
                    if (userNumber < 0 ) {
                        System.out.println("Количество мяуканий не может быть отрицательным числом!");
                    } else {
                        CountingMeowDecorator userMeowing = new CountingMeowDecorator(userKitty);
                        for (int i = 0; i < userNumber + additionalMeow; i++) {
                            userMeowing.meow();
                        }
                        System.out.println(userMeowing.getMeowCount());
                        System.out.println(userMeowing);
                    }
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("""
                            Составить программу, которая вставляет в список L за первым вхождением элемента E все
                            элементы списка L, если E входит в L.
                            """);
                    List<Integer> example = new ArrayList<>(Arrays.asList(1,2,3,4,5));
                    System.out.println(example);
                    System.out.println("Элемент = 4");
                    List<Integer> example2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
                    System.out.println(ListOfValues.addValues(example,4));
                    System.out.println();
                    System.out.println();
                    System.out.println(example2);
                    System.out.println("Элемент = 8");
                    System.out.println(ListOfValues.addValues(example2,8));
                    System.out.println();
                    System.out.println();
                    List<Integer> example3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,4,5,6));
                    System.out.println(example3);
                    System.out.println("Элемент = 4");
                    System.out.println(ListOfValues.addValues(example3,4));
                    System.out.println();
                    System.out.println();
                    List <String> example4 = new ArrayList<>(Arrays.asList("apple","banana","strawberry","kiwi","blueberry","mango"));
                    System.out.println(example4);
                    System.out.println("Элемент = kiwi");
                    System.out.println(ListOfValues.addValues(example4,"kiwi"));
                    System.out.println();
                    System.out.println();
                    List <String> example5 = new ArrayList<>(Arrays.asList("apple","banana","strawberry","kiwi","blueberry","mango"));
                    System.out.println(example5);
                    System.out.println("Элемент = grapes");
                    System.out.println(ListOfValues.addValues(example5,"grapes"));
                    System.out.println();
                    running = true;
                    while (running) {
                        System.out.println("""
                                Вам предстоит создать свой список,
                                ввести туда элементы и ввести значение
                                элемента, после которого возможно будет
                                совершена вставка.
                                Возможные типы данных:
                                1. Целый
                                2. Строковый
                                3. Дробный
                                0. Завершение работы задания 3.
                                """);
                        System.out.print("Введите число - тип данных: ");
                        userNumber = errorChecker.checkInteger();
                        switch (userNumber) {
                            case 0: {
                                System.out.println("Завершение работы задания 3...");
                                running = false;
                                break;
                            }
                            case 1: {
                                System.out.println("1. Целые числа");
                                System.out.print("Введите целое положительное число - количество элементов в массиве: ");
                                userAmount = errorChecker.checkInteger();
                                ArrayList<Integer> user = new ArrayList<>();
                                if (userAmount <= 0) {
                                    System.out.print("Количество элементов в массиве неположительное число.");
                                } else {
                                    for (int i = 0; i < userAmount; i++) {
                                        System.out.print("Введите значение " + (i+1) + "-ого элемента: ");
                                        temporary1 = errorChecker.checkInteger();
                                        user.add(temporary1);
                                    }
                                    System.out.print("Введите целое число - возможный элемент: ");
                                    additionalInteger = errorChecker.checkInteger();
                                    System.out.println(ListOfValues.addValues(user, additionalInteger));
                                }
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.println("2. Строки");
                                System.out.print("Введите целое положительное число - количество элементов в массиве: ");
                                userAmount = errorChecker.checkInteger();
                                ArrayList<String> user = new ArrayList<>();
                                if (userAmount <= 0) {
                                    System.out.print("Количество элементов в массиве неположительное число.");
                                } else {
                                    for (int i = 0; i < userAmount; i++) {
                                        System.out.print("Введите значение " + (i+1) + "-ого элемента: ");
                                        temporary2 = errorChecker.checkString();
                                        user.add(temporary2);
                                    }
                                    System.out.print("Введите строку - возможный элемент: ");
                                    additionalString = errorChecker.checkString();
                                    System.out.println(ListOfValues.addValues(user, additionalString));
                                }
                                System.out.println();
                                break;
                            }
                            case 3: {
                                System.out.println("3. Дробные числа");
                                System.out.print("Введите целое положительное число - количество элементов в массиве: ");
                                userAmount = errorChecker.checkInteger();
                                ArrayList<Double> user = new ArrayList<>();
                                if (userAmount <= 0) {
                                    System.out.print("Количество элементов в массиве неположительное число.");
                                } else {
                                    for (int i = 0; i < userAmount; i++) {
                                        System.out.print("Введите значение " + (i+1) + "-ого элемента: ");
                                        temporary3 = errorChecker.checkDouble();
                                        user.add(temporary3);
                                    }
                                    System.out.print("Введите дробное число - возможный элемент: ");
                                    additionalDouble = errorChecker.checkDouble();
                                    System.out.println(ListOfValues.addValues(user, additionalDouble));
                                }
                                System.out.println();
                                break;
                            }
                            default: {
                                System.out.println("Введено неверное значение!");
                                break;
                            }
                        }
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("""
                            В некотором вузе абитуриенты проходили предварительное тестирование, по результатам
                            которого они могут быть допущены к сдаче вступительных экзаменов в первом потоке.
                            Тестирование проводится по трём предметам, по каждому предмету абитуриент может набрать
                            от 0 100 баллов. При этом к сдаче экзаменов в первом потоке допускаются абитуриенты,
                            набравшие по результатам тестирования не менее 30 баллов по каждому из трёх предметов,
                            причём сумма баллов должна быть не менее 140. На вход программы подаются сведения о
                            результатах предварительного тестирования. Известно, что общее количество участников
                            тестирования не превосходит 500.
                            В первой строке вводится количество абитуриентов, принимавших участие в тестировании, N.
                            Далее следуют N строк, имеющих следующий формат:
                            <Фамилия><Имя><Баллы>
                            Здесь <Фамилия> – строка, состоящая не более чем из 20 символов; <Имя> – строка, состоящая не
                            более чем из 15 символов, <Баллы> – строка, содержащая два целых числа, разделенных
                            пробелом – баллы, полученные на тестировании по каждому из трёх предметов. При этом
                            <Фамилия> и <Имя>, <Имя> и <Баллы> разделены одним пробелом. Пример входной строки:
                            Романов Вельямин 48 39 55
                            Напишите программу, которая будет выводить на экран фамилии и имена абитуриентов,
                            допущенных к сдаче экзаменов в первом потоке. При этом имена и фамилии можно
                            выводить в произвольном порядке.
                            """);
                    Maps maps = new Maps();
                    maps.showStudents();
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.println("""
                            Файл содержит текст на русском языке. Сколько букв русского алфавита не встречается в этом
                            тексте?
                            """);
                    Sets element = new Sets();
                    element.count();
                    System.out.println();
                    break;
                }
                case 6: {
                    System.out.println("""
                            По списку L построить очередь (например, по списку из элементов 1, 2, 3 требуется построить
                            очередь из элементов 1, 2, 3, 3, 2, 1).
                            """);
                    Queues result = new Queues();
                    List <Integer> example6 = new ArrayList<>(Arrays.asList(1,2,3));
                    result.buildQueue(example6);
                    System.out.println();
                    running = true;
                    while (running) {
                        System.out.println("""
                                Вам предстоит создать свой список,
                                ввести туда элементы.
                                Возможные типы данных:
                                1. Целый
                                2. Строковый
                                3. Дробный
                                0. Завершение работы задания 3.
                                """);
                        System.out.print("Введите число - тип данных: ");
                        userNumber = errorChecker.checkInteger();
                        switch (userNumber) {
                            case 0: {
                                System.out.println("Завершение работы задания 3...");
                                running = false;
                                break;
                            }
                            case 1: {
                                System.out.println("1. Целые числа");
                                System.out.print("Введите целое положительное число - количество элементов в массиве: ");
                                userAmount = errorChecker.checkInteger();
                                ArrayList<Integer> user = new ArrayList<>();
                                if (userAmount <= 0) {
                                    System.out.print("Количество элементов в массиве неположительное число.");
                                } else {
                                    for (int i = 0; i < userAmount; i++) {
                                        System.out.print("Введите значение " + (i+1) + "-ого элемента: ");
                                        temporary1 = errorChecker.checkInteger();
                                        user.add(temporary1);
                                    }
                                    Queues userQueue = new Queues();
                                    userQueue.buildQueue(user);
                                }
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.println("2. Строки");
                                System.out.print("Введите целое положительное число - количество элементов в массиве: ");
                                userAmount = errorChecker.checkInteger();
                                ArrayList<String> user = new ArrayList<>();
                                if (userAmount <= 0) {
                                    System.out.print("Количество элементов в массиве неположительное число.");
                                } else {
                                    for (int i = 0; i < userAmount; i++) {
                                        System.out.print("Введите значение " + (i+1) + "-ого элемента: ");
                                        temporary2 = errorChecker.checkString();
                                        user.add(temporary2);
                                    }
                                    Queues userQueue = new Queues();
                                    userQueue.buildQueue(user);
                                }
                                System.out.println();
                                break;
                            }
                            case 3: {
                                System.out.println("3. Дробные числа");
                                System.out.print("Введите целое положительное число - количество элементов в массиве: ");
                                userAmount = errorChecker.checkInteger();
                                ArrayList<Double> user = new ArrayList<>();
                                if (userAmount <= 0) {
                                    System.out.print("Количество элементов в массиве неположительное число.");
                                } else {
                                    for (int i = 0; i < userAmount; i++) {
                                        System.out.print("Введите значение " + (i+1) + "-ого элемента: ");
                                        temporary3 = errorChecker.checkDouble();
                                        user.add(temporary3);
                                    }
                                    Queues userQueue = new Queues();
                                    userQueue.buildQueue(user);
                                }
                                System.out.println();
                                break;
                            }
                            default: {
                                System.out.println("Введено неверное значение!");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 7: {
                    running = true;
                    while (running) {
                        System.out.println("""
                                Задание 7 делится на два задания:
                                1. Ломаная
                                2. Люди
                                0. Завершение работы задания
                                """);
                        System.out.print("Введите число - номер задания: ");
                        smallerTask = errorChecker.checkInteger();
                        switch (smallerTask) {
                            case 0: {
                                System.out.println("Завершение работы задания 7....");
                                running = false;
                                break;
                            }
                            case 1: {
                                System.out.println("""
                                        Необходимо написать стрим:
                                        Дан набор объектов типа Point, необходимо взять все Point в разных координатах, убрать с
                                        одинаковыми X,Y, отсортировать по X, отрицательные Y сделать положительными и собрать это
                                        все в ломаную (объект типа Polyline)
                                        Если раннее в вашем варианте не было задание с классом Point и Polyline, то написать их:
                                        1. класс Point:
                                        • Координата Х: число.
                                        • Координата Y: число.
                                        • Может возвращать текстовое представление вида “{X;Y}”.
                                        2. класс Line (Линия), расположенная на двумерной плоскости, которая описывается:
                                        • Координата начала: Точка
                                        • Координата конца: Точка
                                        • Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
                                        3. класс Polyline (Ломаная), которая будет представлять собой ломаную линию. Ломаная
                                        линия представляет собой набор следующих характеристик:
                                        • Имеет массив Точек, через которые линия проходит.
                                        • Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”, где TN – это
                                        результат приведения к строке Точки с номером N
                                        """);
                                List<Point> points = Arrays.asList(
                                        new Point(4, 5),
                                        new Point(-4, -3),
                                        new Point(2.3, 2.3),
                                        new Point(2.5, 3.4),
                                        new Point(4, -5),
                                        new Point(4, 5),
                                        new Point(5.6, 7.8),
                                        new Point(7.7, -7.7),
                                        new Point(4.6, 5.6)
                                );

                                Line line = new Line(new Point(2.3,5.4), new Point (4,5));

                                List <Line> lines = Arrays.asList(
                                        new Line(new Point (4,5), new Point (2.3,2.3)),
                                        new Line(new Point(4,5), new Point (-4,-3)),
                                        new Line(new Point(5.6,7.8), new Point(2.3,2.3)),
                                        new Line(new Point (4,5), new Point (2.3,2.3)),
                                        new Line(new Point(4,5), new Point (-4,-3))
                                );
                                System.out.println("Изначальная ломаная: ");
                                System.out.println(lines);
                                try {
                                    System.out.println("Преобразованная ломаная: ");
                                    Polyline polyline = PolylineBuild.buildPolyline(lines);
                                    System.out.println(polyline);
                                   System.out.println();
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Ошибка: " + e.getMessage());
                                }
                                List<Line> line1 = Arrays.asList(
                                        new Line(new Point (-4,-3), new Point (4,5)),
                                        new Line(new Point(2.3,2.3), new Point (2.5,3.4)),
                                        new Line(new Point(-4,-3), new Point(4,5)),
                                        new Line(new Point (4.6,5.6), new Point (5.6,6.7)),
                                        new Line(new Point(4.6,5.6), new Point (7.7,14.7))
                                );
                                System.out.println("Изначальная ломаная: ");
                                System.out.println(line1);
                                try {
                                    System.out.println("Преобразованная ломаная: ");
                                    Polyline polyline = PolylineBuild.buildPolyline(line1);
                                    System.out.println(polyline);
                                    System.out.println();
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Ошибка: " + e.getMessage());
                                }

//                                System.out.println(points);
//                                try {
//                                    System.out.println("Преобразованная ломаная: ");
//                                    Polyline polyline = PolylineBuild.buildPolyline(points);
//                                    System.out.println(polyline);
//                                    System.out.println();
//                                } catch (IllegalArgumentException e) {
//                                    System.out.println("Ошибка: " + e.getMessage());
//                                }
//                                List<Point> points2 = Arrays.asList(
//                                        new Point(3, -2),
//                                        new Point(1, 5),
//                                        new Point(2, -3),
//                                        new Point(1, 5),
//                                        new Point(3, 2),
//                                        new Point(-1, -7)
//                                );
//                                System.out.println("Изначальная ломаная: ");
//                                System.out.println(points2);
//                                try {
//                                    System.out.println("Преобразованная ломаная: ");
//                                    Polyline polyline1 = PolylineBuild.buildPolyline(points2);
//                                    System.out.println(polyline1);
//                                } catch (IllegalArgumentException e) {
//                                    System.out.println("Ошибка: " + e.getMessage());
//                                }
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.println("""
                                        Дан текстовый файл со строками, содержащими имя человека и его номер в следующей форме:
                                        Вася:5
                                        Петя:3
                                        Аня:5
                                        Номера людей могут повторяться. У каких-то людей может не быть номера.
                                        Необходимо написать стрим выполняющую следующее:
                                        читаются все люди из файла, все имена приводится к нижнему регистру, но с первой буквой в
                                        верхнем регистре, убираем из перечня всех людей без номеров, а имена оставшихся группируются
                                        по их номеру:
                                        [5:[Вася, Аня], 3:[Петя]]
                                        """);
                                Stream2 stream2 = new Stream2();
                                stream2.groupBy();
                                System.out.println();
                                break;
                            }
                            default: {
                                System.out.println("Введен неверный номер задания.");
                                break;
                            }
                        }
                    }
                }
                default: {
                    System.out.println("Введен неверный номер задания.");
                    break;
                }
            }
        }
        System.out.println("Работа лабораторной работы 5 завершена.");
    }
}
