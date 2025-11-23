package ru.kuzhleva.lab3.assignments;

import java.util.Random;
import java.util.Scanner;

public class Assignments {
    // Задачи на методы

    // Задача 2
    // Сумма знаков.
    //Дана сигнатура метода: public int sumLastNums (int x);
    //Необходимо реализовать метод таким образом, чтобы он возвращал результат
    //сложения двух последних знаков числах, предполагая, что знаков в числе не
    //менее двух. Подсказки:
    //int x=123%10; // х будет иметь значение 3
    //int у=123/10; // у будет иметь значение 12
    //Пример:
    //x=4568
    //результат: 14
    public int sumLastNums(int x) {
            int lastDigit = Math.abs(x) % 10;
            int updatedNumber = Math.abs(x) / 10;
            int secondToLastDigit = updatedNumber % 10;
            return (lastDigit + secondToLastDigit);

    }

    // Задача 4
    //Есть ли позитив.
    //Дана сигнатура метода: public bool isPositive (int x);
    //Необходимо реализовать метод таким образом, чтобы он принимал число x и
    //возвращал true, если оно положительное.
    //Пример 1:
    //x=3
    //результат: true
    //Пример 2:
    //x=-5
    //результат: false
    public boolean isPositive(int x) {
        return (x > 0);
    }

    // Задача 6
    // Большая буква.
    //Дана сигнатура метода: public bool isUpperCase (char x);
    //Необходимо реализовать метод таким образом, чтобы он принимал символ x и
    //возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’.
    //Пример 1:
    //x=’D’
    //результат: true
    //Пример 2:
    //x=’q’
    //результат: false
    public boolean isUpperCase(char x) {
        return Character.isUpperCase(x);
    }

    // Задача 8
    // Делитель.
    //Дана сигнатура метода: public bool isDivisor (int a, int b);
    //Необходимо реализовать метод таким образом, чтобы он возвращал true, если
    //любое из принятых чисел делит другое нацело.
    //Пример 1:
    //a=3 b=6
    //результат: true
    //Пример 2:
    //a=2 b=15
    //результат: false
    public boolean isDivisor(int a, int b) {
        if (a==0 || b == 0) {
            return true;
        }
        return ((a % b == 0) || (b % a == 0));
    }

    // Задача 10
    // Многократный вызов.
    //Дана сигнатура метода: public int lastNumSum(int a, int b)
    //Необходимо реализовать метод таким образом, чтобы он считал сумму цифр
    //двух чисел из разряда единиц. Выполните с его помощью последовательное
    //сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить
    //задачу, используя минимально возможное количество вспомогательных
    //переменных.
    //Пример:
    //5+11 это 6
    //6+123 это 9
    //9+14 это 13
    //13+1 это 4
    //Итого 4
    public int lastNumSum(int a, int b) {
        int aDigit = Math.abs(a) % 10;
        int bDigit = Math.abs(b) % 10;
        return aDigit + bDigit;
    }

    // Задачи на условие

    // Задача 2
    // Безопасное деление.
    //Дана сигнатура метода: public double safeDiv (int x, int y);
    //Необходимо реализовать метод таким образом, чтобы он возвращал деление x
    //на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При
    //делении на 0 следует вернуть из метода число 0. Подсказка: смотри
    //ограничения на операции типов данных.
    //Пример 1:
    //x=5 y=0
    //результат: 0
    //Пример 2:
    //x=8 y=2
    //результат: 4
    public double safeDiv(int x, int y) {
        if (y == 0 || x == 0) {
            return 0.0;
        } else {
            return (double) x / y;
        }
    }

    // Задача 4
    // Строка сравнения.
    //Дана сигнатура метода: public String makeDecision (int x, int y);
    //Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    //которая включает два принятых методом числа и корректно выставленный
    //знак операции сравнения (больше, меньше, или равно).
    //Пример 1:
    //x=5 y=7
    //результат: “5< 7”
    //Пример 2:
    //x=8 y=-1
    //результат: “8 >-1”
    //Пример 3:
    //x=4 y=4
    //результат: “4==4”
    public String makeDecision(int x, int y) {
        if (x > y) {
            return ">";
        } else {
            if (x < y) {
                return "<";
            } else {
                return "==";
            }
        }
    }

    // Задача 6
    // Тройная сумма.
    //Дана сигнатура метода: public bool sum3 (int x, int y, int z);
    //Необходимо реализовать метод таким образом, чтобы он возвращал true, если
    //два любых числа (из трех принятых) можно сложить так, чтобы получить
    //третье.
    //Пример 1:
    //x=5 y=7 z=2
    //результат: true
    //Пример 2:
    //x=8 y=-1 z=4
    //результат: false
    public boolean sum3(int x, int y, int z) {
        if ((x + y == z) || (x + z == y) || (y + z == x)) {
            return true;
        }
        return false;
    }

    // Задача 8
    // Возраст.
    //Дана сигнатура метода: public String age (int x);
    //Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
    //которой сначала будет число х, а затем одно из слов:
    //год
    //года
    //лет
    //Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.
    //Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел
    //12, 13, 14.
    //Слово “лет”добавляется во всех остальных случаях.
    //Подсказка: оператор % позволяет получить остаток от деления.
    //Пример 1:
    //x=5
    //результат: “5 лет”
    //Пример 2:
    //x=31
    //результат: “31 год”
    //Пример 3:
    //x=44
    //результат: “44 года”
    public String age(int x) {
        if (x % 10 == 1 && x != 11) {
            return "год";
        } else if (((x % 10 == 2) || (x % 10 == 3) || (x % 10 == 4)) && ((x != 12) && (x != 13) && (x != 14)) && (x!=112) && (x!=113) && (x!=114) ) {
            return "года";
        } else {
            return "лет";
        }

    }

    // Задача 10
    // Вывод дней недели.
    //Дана сигнатура метода: public void printDays (String x);
    //В качестве параметра метод принимает строку, в которой записано название
    //дня недели. Необходимо реализовать метод таким образом, чтобы он выводил
    //на экран название переданного в него дня и всех последующих до конца недели
    //дней. Если в качестве строки передан не день, то выводится текст “это не день
    //недели”. Первый день понедельник, последний – воскресенье. Вместо if в данной
    //задаче используйте switch.
    //Пример 1:
    //x=”четверг”
    //результат:
    //четверг
    //пятница
    //суббота
    //воскресенье
    //Пример 2:
    //x=”чг”
    //результат:
    //это не день недели
    public void printDays(String x) {
        switch (x) {
            case "понедельник": {
                System.out.println("понедельник");
            }
            case "вторник": {
                System.out.println("вторник");
            }
            case "среда": {
                System.out.println("среда");
            }
            case "четверг": {
                System.out.println("четверг");
            }
            case "пятница": {
                System.out.println("пятница");
            }
            case "суббота": {
                System.out.println("суббота");
            }
            case "воскресенье": {
                System.out.println("воскресенье");
                break;
            }
            default: {
                System.out.println("это не день недели.");
                break;
            }
        }
    }

    // Задачи на циклы

    // Задача 2
    // Числа наоборот.
    //Дана сигнатура метода: public String reverseListNums (int x);
    //Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
    //которой будут записаны все числа от x до 0 (включительно).
    //Пример:
    //x=5
    //результат: “5 4 3 2 1 0”
    public String reserveListNums(int x) {
        StringBuilder Result = new StringBuilder();
        if (x < 0) {
            for (int i = x; i <= 0; i++) {
                Result.append(i).append(" ");
            }
        } else {
            for (int i = x; i >= 0; i--) {
                Result.append(i).append(" ");
            }
        }
        return Result.toString();
    }

    // Задача 4
    // Степень числа.
    //Дана сигнатура метода: public int pow (int x, int y);
    //Необходимо реализовать метод таким образом, чтобы он возвращал результат
    //возведения x в степень y.
    //Подсказка: для получения степени необходимо умножить единицу на число x, и
    //сделать это y раз, т.е. два в третьей степени это 1*2*2*2
    //Пример:
    //x=2
    //y=5
    //результат: 32
    public int pow(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= y; i++) {
                result *= x;
            }
            return result;
        }
    }

    // Задача 6

    // Одинаковость.
    //Дана сигнатура метода: public bool equalNum (int x);
    //Необходимо реализовать метод таким образом, чтобы он возвращал true, если
    //все знаки числа одинаковы, и false в ином случае.
    //Подсказки:
    //int x=123%10; // х будет иметь значение 3
    //int у=123/10; // у будет иметь значение 12
    //Пример 1:
    //x=1111
    //результат: true
    //Пример 2:
    //x=1211
    //результат: false
    public boolean equalNum (int x)  {
        x = Math.abs(x);
        int secondToLastDigit;
        int lastDigit = x%10;
        x = x/10;
        while (x>0) {
            secondToLastDigit = x%10;
            if (lastDigit != secondToLastDigit) {
                return false;
            }
            x = x/10;
        }
        return true;
    }

    // Задача 8
    // Левый треугольник.
    //Дана сигнатура метода: public void leftTriangle (int x);
    //Необходимо реализовать метод таким образом, чтобы он выводил на экран
    //треугольник из символов ‘*’ у которого х символов в высоту, а количество
    //символов в ряду совпадает с номером строки.
    //Пример 1:
    //x=2
    //результат:
    //*
    //**
    //Пример 2:
    //x=4
    //результат:
    //*
    //**
    //***
    //****
    public void leftTriangle (int x) {
        if ( x <= 0 ) {
            System.out.println("Число не может быть меньше нуля или равным нулю.");
        }
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // Задача 10
    // Угадайка.
    //Дана сигнатура метода: public void guessGame()
    //Необходимо реализовать метод таким образом, чтобы он генерировал
    //случайное число от 0 до 9, далее считывал с консоли введенное пользователем
    //число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод
    //запускается до тех пор, пока пользователь не угадает число. После этого
    //выведите на экран количество попыток, которое потребовалось пользователю,
    //чтобы угадать число.
    //Пример:
    //Введите число от 0 до 9:
    //5
    //Вы не угадали, введите число от 0 до 9:
    //9
    //Вы угадали!
    //Вы отгадали число за 2 попытки
    Random random = new Random();
    Scanner keyboard = new Scanner(System.in);
    public void guessGame() {
        int randomNumber = random.nextInt(0, 10);
        int userGuess;
        while (true) {
            System.out.print("Введите цифру от 0 до 9: ");
            String line = keyboard.next().trim();
            try {
                userGuess = Integer.parseInt(line);
                System.out.println();
                if (userGuess < 0 || userGuess > 9) {
                    System.out.println("Вы ввели неверное значение.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка. Введено неверное число.");
            }
        }
        int tries = 1;
        while (userGuess != randomNumber) {
            System.out.print("Вы не угадали. Введите цифру от 0 до 9: ");
            userGuess = keyboard.nextInt();
            if (userGuess < 0 || userGuess > 9) {
                System.out.println("Вы ввели неверное значение.");
                continue;
            }
            tries++;
        }
        if (userGuess == randomNumber) {
            System.out.println("Вы угадали!");
            if (tries % 10 == 1) {
                System.out.println("Вы отгадали число за " + tries + " попытку");
            } else if ((tries % 10 == 2) || (tries % 10 == 3) || (tries % 10 == 4)) {
                System.out.println("Вы отгадали число за " + tries + " попытки");
            } else {
                System.out.println("Вы отгадали число за " + tries + " попыток");
            }
        }
    }

    // Задачи на массивы

    // Задача 2
    // Поиск последнего значения.
    //Дана сигнатура метода: public int findLast (int[] arr, int x);
    //Необходимо реализовать метод таким образом, чтобы он возвращал индекс
    //последнего вхождения числа x в массив arr. Если число не входит в массив –
    //возвращается -1.
    //Пример:
    //arr=[1,2,3,4,2,2,5]
    //x=2
    //результат: 5
    public int findLast (int[] arr,int x) {
        for (int i = arr.length -1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Задача 4
    // Добавление в массив.
    //Дана сигнатура метода: public int[]add (int[] arr, int x, int pos);
    //Необходимо реализовать метод таким образом, чтобы он возвращал новый
    //массив, который будет содержать все элементы массива arr, однако в позицию
    //pos будет вставлено значение x.
    //Пример:
    //arr=[1,2,3,4,5]
    //x=9
    //pos=3
    //результат: [1,2,3,9,4,5]
    public int[] add (int[] arr, int x, int pos) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
        }
        newArray[pos] = x;
        for (int i = pos; i<arr.length; i++ ) {
            newArray[i+1] = arr[i];
        }
        return newArray;
    }

    // Задача 6
    //Реверс.
    //Дана сигнатура метода: public void reverse (int[] arr);
    //Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
    //После проведенных изменений массив должен быть записан задом-наперед.
    //Пример:
    //arr=[1,2,3,4,5]
    //результат: arr=[5,4,3,2,1]
    public void reverse (int[] arr )  {
        int firstIndex = 0;
        int temporary;
        int lastIndex = arr.length - 1;
        while (firstIndex < lastIndex) {
            temporary = arr[firstIndex];
            arr[firstIndex] = arr[lastIndex];
            arr[lastIndex] = temporary;

            firstIndex++;
            lastIndex--;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    // Задача 8
    // Объединение.
    //Дана сигнатура метода: public int[] concat (int[] arr1,int[] arr2);
    //Необходимо реализовать метод таким образом, чтобы он возвращал новый
    //массив, в котором сначала идут элементы первого массива (arr1), а затем
    //второго (arr2).
    //Пример:
    //arr1=[1,2,3]
    //arr2=[7,8,9]
    //результат: [1,2,3,7,8,9]
    public int[] concat (int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            newArray[arr1.length + j] = arr2[j];
        }
        return newArray;
    }

    // Задача 10
    // Удалить негатив.
    //Дана сигнатура метода: public int[] deleteNegative (int[] arr);
    //Необходимо реализовать метод таким образом, чтобы он возвращал новый
    //массив, в котором записаны все элементы массива arr кроме отрицательных.
    //Пример:
    //arr=[1,2,-3,4,-2,2,-5]
    //результат: [1,2,4,2]
    public int[] deleteNegative (int[] arr) {
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative++;
            }
        }
        int[] newArray = new int[arr.length - negative];
        int index = 0;
        for (int i = 0; i < arr.length; i++)  {
            if (arr[i] >= 0) {
                newArray[index] = arr[i];
                index++;
            }
        }
        return newArray;
    }
}
