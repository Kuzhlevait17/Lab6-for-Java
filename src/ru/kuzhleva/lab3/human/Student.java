package ru.kuzhleva.lab3.human;

public class Student extends Human{ //данные в классе = поля, они всегда приватные
    private int course;
    private final boolean gender; //final = можно установить только 1 раз

    //свойства (сеттеры и геттеры)
    //получение
    public int getCourse() {
        return course;
    }
    public boolean getGender() {
        return gender;
    }
    public void setCourse(int course) {
        if (course >= 1 && course <= 6) {
            this.course = course;
        }
        else {
            System.out.println("ERROR COURSE");
            this.course = 1;
        }
        this.course = course;
    }

    // конструкторы для инициализации данных. три вида конструкторов
    // по умолчанию
    public Student() {
        super("Ivan",16);
        this.course = 1;
        this.gender = true;
    }
    //конструктор копирования
    public Student(Student student) {
        // Конструкт родительского класса.
        // super (student.getName(),student.getAge());
        super(new Human(student.getName(),student.getAge()));
        //super(student) так тоже можно
        this.course = student.course;
        this.gender = student.gender;
    }
    //конструктор с параметрами
    public Student(String name, int age, int course, boolean gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.course = course;
        super(name,age);
        setCourse(course);
        this.gender = gender;
    }

    public Student(String name, int age, boolean gender, int course) {
        this(name,age,course, gender);
    }

    public Student(String name) {
        this(name,24,true,3);
    }

    public Student(String name, int course) {
        this(new Student(name,24,course,true));
    }

    //перегрузка
    @Override //аннотация
    public String toString() {
        return super.toString() + " " +course + " " + gender;
    }
}