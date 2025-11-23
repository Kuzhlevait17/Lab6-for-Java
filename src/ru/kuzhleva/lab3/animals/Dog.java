package ru.kuzhleva.lab3.animals;

public class Dog extends Animals{
    private boolean Stray;

    public void setStray(boolean stray) {
        Stray = stray;
    }

    public boolean isStray() {
        return Stray;
    }

    public Dog(String name, boolean Stray) {
        super(name, "Собака");
        this.Stray = Stray;
    }

    @Override
    public String toString() {
        return super.toString() + isStray();
    }
}
