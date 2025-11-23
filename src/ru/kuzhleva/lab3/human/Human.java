package ru.kuzhleva.lab3.human;

public class Human {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //изменение
    public void setName(String name) {
        if (name == null) {
            System.out.println("ERROR NAME");
            //ввод
        }
        else {
            this.name = "Ivan";
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 70) {
            this.age = age;
        }
        else {
            System.out.println("ERROR AGE");
            this.age = 16;
        }

        this.age = age;
    }

    // Конструктр копирования
    public Human(Human human) {
        this.name = human.name;
        this.age = human.age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age + " лет";
    }
}
