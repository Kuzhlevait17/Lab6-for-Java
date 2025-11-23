package ru.kuzhleva.lab3.maths;

import static java.lang.Integer.parseInt;
import static java.lang.StrictMath.pow;

public class Exponentiation {

    public static double calculation(String xStr, String yStr) {
        int base = parseInt(xStr);
        int exponent = parseInt(yStr);
        if (exponent == 0) {
            return 1;
        } else {
            return pow(base, exponent);
        }
    }

    public static void main (String[] args) {
        if (args.length < 2) {
            System.out.println("Использование: java Exponentiation <основание> <показатель>");
            System.out.println("Пример: java Exponentiation 2 3");
            return;
        }
        try {
            double result = calculation(args[0], args[1]);
            System.out.println("Результат возведения в степень " + args[0] + " " + args[1] + " = " + result );
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: оба параметра должны быть целыми числами.");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }

}
