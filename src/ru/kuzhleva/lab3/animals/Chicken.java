package ru.kuzhleva.lab3.animals;

public class Chicken extends Animals {
    public Chicken(String name) {
        super(name, "Курица");
    }
    public void speak(int amount) {
        for (int i = 0; i < amount-1; i++) {
            System.out.print("Ко-");
        }
        System.out.print("Ко!");
    }

    @Override
    public String toString() {
        return super.toString() + " говорит:";
    }
}
