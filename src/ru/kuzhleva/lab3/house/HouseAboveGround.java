package ru.kuzhleva.lab3.house;

public class HouseAboveGround {
    private final int floors;
    public HouseAboveGround(int floors) {
        if (floors < 0) {
            throw new IllegalArgumentException("Количество этажей не может быть отрицательным числом.");
        }
        if (floors == 0) {
            throw new IllegalArgumentException("Количество этажей не может быть равно нулю.");
        }
        this.floors = floors;
    }
    public int getFloors() {
        return floors;
    }
    public String word() {
        if (floors % 10 == 1 && floors%100!=11) {
            return "этажом";
        } else {
            return "этажами";
        }
    }
    @Override
    public String toString() {
        return "Дом с " + floors + " " + word();
    }
}
