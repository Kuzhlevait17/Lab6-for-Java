package ru.kuzhleva.lab5.Patterns;

public class MeowManager {
    public static void makeAllMeow(Meowable... meowables) {
        for (Meowable m : meowables) {
            m.meow();
        }
    }
}
