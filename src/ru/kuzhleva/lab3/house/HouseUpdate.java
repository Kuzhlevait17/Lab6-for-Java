package ru.kuzhleva.lab3.house;

public class HouseUpdate {
    //private int floors;
    private final int floors; // Устанавливаем значение единожды т.к. этажность дома не меняется.
    //    public HouseUpdate() {
    //       this.floors = 0;
    //    }
    public HouseUpdate(int floors) {
        this.floors = floors;
    }
    public int getFloors() {
        return floors;
    }
    //    public void setFloors(int floors) {
//        if (floors > 0 && floors <= 163) {
//            this.floors = floors;
//        } else {
//            System.out.println("Ошибка! Введено неверное количество этажей.");
//        }
//    }
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
