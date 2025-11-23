package ru.kuzhleva.lab5.stream;

import java.util.Arrays;

public class Polyline {
//    private Point[] points;
//
//    public Polyline(Point[] points) {
//        if (points == null) {
//            throw new IllegalArgumentException("Массив значений не может быть пустым!");
//        }
//        this.points = Arrays.copyOf(points,points.length);
//    }
//
//    public Point[] getPoints() {
//        return Arrays.copyOf(points, points.length);
//    }

    private Line[] lines;

    public Polyline(Line[] lines) {
        if (lines == null) {
            throw new IllegalArgumentException("Массив значений не может быть пустым!");
        }
        this.lines = Arrays.copyOf(lines,lines.length);
    }

    public Line[] getLines() {
        return Arrays.copyOf(lines, lines.length);
    }

    @Override
    public String toString() {
        return "Линия " + Arrays.toString(lines);
    }

}
