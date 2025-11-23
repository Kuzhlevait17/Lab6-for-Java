package ru.kuzhleva.lab5.Patterns;

public class SolveFractions implements Fraction {
    private int numerator;
    private int denominator;

    public SolveFractions(int numerator, int denominator) {
        // если числитель равен нулю, то ? ...
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулём числом.");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.denominator = denominator;
        this.numerator = numerator;
    }

    @Override
    public double getValue() {
        return (double) numerator / denominator;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.denominator = denominator;
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        SolveFractions other = (SolveFractions) obj;
        return numerator == other.numerator && denominator == other.denominator;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31*result + Double.hashCode(numerator);
        result = 31*result + Double.hashCode(denominator);
        return result;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
