package ru.kuzhleva.lab3.dots;

public class Dots {
    private double x;
    private double y;

    public Dots(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Dots other = (Dots) obj;
        return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;

    }

    @Override
    public int hashCode() {
        int result = 31;
        long tempX = Double.doubleToLongBits(x);
        result = 31*result + (int)(tempX ^ (tempX >>> 32));
        long tempY = Double.doubleToLongBits(y);
        result = 31*result + (int)(tempY ^ (tempY >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Точка: " + "{" + x + ";" + y + "}";
    }
}
