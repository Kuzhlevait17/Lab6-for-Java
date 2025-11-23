package ru.kuzhleva.errors;

import java.util.*;


public class ErrorChecker {
    Scanner keyboard = new Scanner(System.in);

    public int checkInteger() {
        int checkNumber;
        String line;
        while (true) {
            line = keyboard.nextLine();
            try {
                checkNumber = Integer.parseInt(line);
                System.out.println();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка. Введено неверное число.");
                System.out.print("Введите целое число: ");
            }
        }
        return checkNumber;
    }

    public String checkStringInteger() {
        int checkNumber;
        String line;
        while (true) {
            line = keyboard.nextLine();
            try {
                checkNumber = Integer.parseInt(line);
                System.out.println();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка. Введено неверное число.");
                System.out.print("Введите целое число: ");
            }
        }
        return line;
    }

    public double checkDouble() {
        double checkNumber;
        String line;
        while (true) {
            line = keyboard.nextLine();
            try {
                checkNumber = Double.parseDouble(line);
                System.out.println();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка. Введено неверное число.");
                System.out.print("Введите целое число: ");
            }
        }
        return checkNumber;
    }


    public String checkString() {
        String line;
        boolean valid;

        while (true) {
            line = keyboard.nextLine();
            if (line != null) {
                line = line.trim();
            }

            // Проверка на пустую строку после trim()
            if (line == null || line.isEmpty()) {
                System.out.println("Ошибка. Строка не может быть пустой.");
                System.out.print("Введите новое значение: ");
                continue;
            }

            valid = true;
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (!Character.isLetter(ch) && ch != ' ' && ch != '-' && ch != '\'') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return line;
            } else {
                System.out.println("Ошибка. Строка должна состоять только из букв, пробелов, '-' или '\''.");
                System.out.print("Введите новое значение: ");
            }
        }
    }
}

