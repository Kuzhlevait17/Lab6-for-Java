package ru.kuzhleva.lab5.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

    public void groupBy() throws IOException {
        try (Stream <String> lines = Files.lines(Paths.get("C:\\Users\\lukuz\\IdeaProjects\\Lab3\\src\\ru\\kuzhleva\\lab5\\stream\\humans"))) {
            Map <Integer, List<String>> groups = lines
                    .filter(line -> !line.isBlank())
                    .filter(line -> line.contains(":"))
                    .map(line -> line.split(":",2))
                    .filter( parts -> parts.length == 2 && !parts[1].isBlank())
                    .map(parts -> Map.entry(formatName(parts[0]), Integer.parseInt(parts[1].trim())))
                    .collect(Collectors.groupingBy(
                            Map.Entry::getValue,
                            Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
            System.out.println(groups.toString());
        }
    }

    private static String formatName(String name) {
        name = name.trim().toLowerCase();
        return name.isEmpty() ? name : Character.toUpperCase(name.charAt(0)) + name.substring(1);
     }

}