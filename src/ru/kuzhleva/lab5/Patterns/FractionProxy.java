package ru.kuzhleva.lab5.Patterns;

public class FractionProxy implements Fraction {
    private final SolveFractions realFraction;
    private Double cache = null;

    public FractionProxy(int numerator, int denominator) {
        this.realFraction = new SolveFractions(numerator,denominator);
    }

    @Override
    public int getDenominator() {
        return realFraction.getDenominator();
    }

    @Override
    public int getNumerator() {
        return realFraction.getNumerator();
    }

    @Override
    public void setDenominator(int denominator) {
        System.out.println("[Кэш " + (isEmpty() ? "пуст" : "не пуст") + "]");
        realFraction.setDenominator(denominator);
        invalidateCache();
    }

    private boolean isEmpty() {
        return cache == null;
    }

    @Override
    public void setNumerator(int numerator) {
        System.out.println("[Кэш " + (isEmpty() ? "пуст" : "не пуст") + "]");
        realFraction.setNumerator(numerator);
        invalidateCache();
    }

    @Override
    public double getValue() {
        System.out.println("[Кэш " + (isEmpty() ? "пуст" : "не пуст") + "]");
        if (cache == null) {
            System.out.println("[Кэш пуст] -> ВЫПОЛНЯЕТСЯ ВЫЧИСЛЕНИЕ");
            cache = realFraction.getValue();
        } else {
            System.out.println("[Кэш пуст] -> ИСПОЛЬЗУЕМ ЗНАЧЕНИЕ ИЗ КЭША");
        }
        return cache;
    }

    @Override
    public String toString() {
        return realFraction.toString();
    }

    private void invalidateCache() {
        System.out.println("[Сброс кэша]");
        cache = null;
        System.out.println("[Кэш пуст].");
    }
}
