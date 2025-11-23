package ru.kuzhleva.lab5.Patterns;

public class CountingMeowDecorator implements Meowable {
    private final Meowable cat;
    private int meowCount = 0;

    public CountingMeowDecorator(Meowable cat) {
        this.cat = cat;
    }

    @Override
    public void meow() {
        meowCount++;
        cat.meow();
    }

    public int getMeowCount( ) {
        return meowCount;
    }

    @Override
    public String toString() {
        if ( (meowCount % 10 == 2 || meowCount %10 == 3 || meowCount % 10 == 4 )&&
                (meowCount % 100 != 12 && meowCount % 100 != 13 && meowCount%100 != 14)) {
            return "Котик мяукал " + meowCount + " раза";
        }
        return "Котик мяукал " + meowCount + " раз";
    }
}
