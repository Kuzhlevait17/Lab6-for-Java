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
        /*
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
                    main3.showDefault();
                    break;
                }
                case 4: {
                    Main4 main4 = new Main4();
                    main4.showDefault();
                    break;
                }
                case 5: {
                    Main5 main5 = new Main5();
                    main5.showDefault();
                    break;
                }
               default: {
                    System.out.println("Введён неверный номер лабораторной работы.\n");
                    break;
                }
            }
        }
        System.out.println("Работа программы успешно завершена.");*/

        System.out.println("Задание 1");
        Kitty pusheen = new Kitty("Пушин");
        InvokeReflection.showInvoke(pusheen);
        System.out.println();
        System.out.println("Задание 2");
        Guns guns = new Guns(7,7);
        DefaultReflection.showDefault(guns);
        System.out.println();
        System.out.println("Задание 3");
        OtherWeapon machineGun = new OtherWeapon(5,7);
        ToStringReflection.showToString(machineGun);
        System.out.println();
        System.out.println("Задание 4");
        ShooterCopy shooterCopy = new ShooterCopy("Booblik");
        ValidateReflection.showValidation(shooterCopy);
        System.out.println();
        System.out.println("Задание 5");
        Kitty kitty = new Kitty("Pusheen");
        TwoReflection.ShowTwo(kitty);
        System.out.println();
        System.out.println("Задание 6");
        CacheReflection.showCache(shooterCopy);
        System.out.println();
    }
}