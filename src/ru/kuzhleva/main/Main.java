package ru.kuzhleva.main;

import ru.kuzhleva.errors.ErrorChecker;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.Guns;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.Kitty;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.OtherWeapon;
import ru.kuzhleva.lab6.annotations.AdditionaClasses.ShooterCopy;
import ru.kuzhleva.lab6.annotations.Reflections.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ErrorChecker errors = new ErrorChecker();
        boolean run;
        int labNumber;
        run = true;
        while (run) {
            System.out.println("""
                    Добро пожаловать!
                    Вы можете выбрать две лабораторные работы:
                    
                     | ---------------------------------------
                     | – Лабораторная работа 3.
                     |
                     | – Лабораторная работа 4.
                     |
                     | - Лабораторная работа 5.
                     |
                     | - Лабораторная работа 6.
                     |
                     | – Завершение работы программы 0.
                     | ---------------------------------------
                     
                    Для того, чтобы выбрать лаборатрную работу, напишите
                    её номер (число).
                    """);
            System.out.print("Напишите число - номер лабораторной работы: ");
            labNumber = errors.checkInteger();
            switch (labNumber) {
                case 0: {
                    System.out.println("""
                            Завершение работы....
                            *
                            * *
                            * * *
                            * * * * 
                            * * * * *
                            """);
                    run = false;
                    break;
                }
                case 3: {
                    Main3 main3 = new Main3();
                    main3.show();
                    break;
                }
                case 4: {
                    Main4 main4 = new Main4();
                    main4.show();
                    break;
                }
                case 5: {
                    Main5 main5 = new Main5();
                    main5.show();
                    break;
                }
                case 6: {
                    Main6 main6 = new Main6();
                    main6.show();
                    break;
                }
               default: {
                    System.out.println("Введён неверный номер лабораторной работы.\n");
                    break;
                }
            }
        }
        System.out.println("Работа программы успешно завершена.");
    }
}