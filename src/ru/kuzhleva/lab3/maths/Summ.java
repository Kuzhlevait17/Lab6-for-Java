package ru.kuzhleva.lab3.maths;

import java.util.Random;

public class Summ {
    private static int s = 0;
    private int z = 0;
    private static Random rnd;
    public Summ(){
        s++;
        z++;
        System.out.println("s = " + s + " z = " + z);
    }

    public static int summ(int x, int y) {
        return x+y;
    }
}
