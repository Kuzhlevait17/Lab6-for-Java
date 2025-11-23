package ru.kuzhleva.lab3.animals;

public class Leo extends Animals {
    private static final boolean hunter = true;
    public boolean isHunter() {
        return hunter;
    }
    public Leo(String name) {
        super(name,"Лев");
    }
    @Override
    public String toString() {
            return super.toString() + " " + hunter;
    }
}
