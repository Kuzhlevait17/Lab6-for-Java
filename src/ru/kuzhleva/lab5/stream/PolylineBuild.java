package ru.kuzhleva.lab5.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PolylineBuild {

//    public static Polyline buildPolyline(List<Point> points) {
//        if (points == null) {
//            throw new IllegalArgumentException("Массив с элементами не может быть пустым.");
//        } else {
//            Point[] result = points.stream()
//                    .map(p -> new Point(p.getCoordinateX(), Math.abs(p.getCoordinateY())))
//                    .distinct()
//                    .sorted(Comparator.comparing(Point::getCoordinateX))
//                    .toArray(Point[]::new);
//            return new Polyline(result);
//        }
//    }

    public static Polyline buildPolyline(List<Line> lines) {
        if (lines == null) {
            throw new IllegalArgumentException("Массив не может быть пустым.");
        } else {
            List<Point> middleResult = lines.stream().flatMap(
                    line -> Stream.of(new Point(line.getStart().getCoordinateX(), Math.abs(line.getStart().getCoordinateY())),
                            new Point(line.getEnd().getCoordinateX(),Math.abs(line.getStart().getCoordinateY()))))
                    .distinct()
                    .sorted(Comparator.comparing(Point::getCoordinateX))
                    .collect(Collectors.toList());

            List<Line> result = new ArrayList<>();
            for (int i = 0; i < middleResult.size() - 1; i++) {
                Point p1 = middleResult.get(i);
                Point p2 = middleResult.get(i+1);
                result.add(new Line(new Point(p1.getCoordinateX(),p2.getCoordinateY()), new Point(p2.getCoordinateX(),p2.getCoordinateY())));
            }
            return new Polyline(result.toArray(new Line[0]));
        }
    }
}
