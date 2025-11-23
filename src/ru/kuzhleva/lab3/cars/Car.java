package ru.kuzhleva.lab3.cars;

public class Car {
    private String brand;
    private String model;
    private int govermentNumber;

    public int getGovermentNumber() {
        return govermentNumber;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public void setGovermentNumber(int govermentNumber) {
        if (govermentNumber > 0 && govermentNumber < 1000) {
            this.govermentNumber = govermentNumber;
        } else {
            System.out.println("Ошибка! Введён некорректный государственный номер");
            this.govermentNumber = 1;
        }
    }

    public Car() {
        this.govermentNumber = 1;
        this.brand = "Porsche";
        this.model = "911";
    }

    public Car(int govermentNumber, String brand, String model) {
        setGovermentNumber(govermentNumber);
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Машина " + brand + " " + model + " " + " завелась");
    }

    @Override
    public String toString() {
        return brand + "  " + model + "  " + govermentNumber;
    }

}
