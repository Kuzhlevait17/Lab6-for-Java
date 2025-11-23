package ru.kuzhleva.lab3.house;

public class House {
    private int floors;
    public House() {
        this.floors = 0;
    }
    public House(int floors) {
        this.floors = floors;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
//        if (floors > 0 && floors <= 163) {
//            this.floors = floors;
//        } else {
//            System.out.println("Ошибка! Введено неверное количество этажей.");
//        }
        this.floors = floors;
    }
    public String word(int floors) {
        if (floors % 10 == 1 && floors % 100 != 11) {
            return "этажом";
        } else {
            return "этажами";
        }
    }
    @Override
    public String toString() {
        return "Дом с " + floors + " " + word(floors);
    }
}
