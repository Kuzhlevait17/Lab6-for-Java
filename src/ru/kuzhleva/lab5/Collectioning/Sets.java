package ru.kuzhleva.lab5.Collectioning;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Sets {

    public void count() {
        Set<Character> elements;
        try {
            elements = getCharacters();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String russianAlphabet = "ъхзщшгнекуцйэждлорпавыфюбьтимсчяё";
        Set <Character> alphabet = new HashSet<>();
        for (char c : russianAlphabet.toCharArray()) {
            alphabet.add(c);
        }
        Set <Character> missing = new HashSet<>(alphabet);
        missing.removeAll(elements);
//        String special = "!~`@#№$;%^:&*()_-=+{}[]?,./<>...";
//        Set <Character> specialSet = new HashSet<>();
//        for (char c : special.toCharArray()) {
//            specialSet.add(c);
//        }
//        missing.removeAll(specialSet);
        System.out.println("Количество отсутствующих букв в тексте: " + missing.size());
        System.out.println("Пропущенные буквы: " + missing);
    }

    private static Set<Character> getCharacters() throws IOException {
        Set <Character> elements = new HashSet<>();
        FileReader fileReader;
        try {
            fileReader = new FileReader("C:\\Users\\lukuz\\IdeaProjects\\Lab3\\src\\ru\\kuzhleva\\lab5\\Collectioning\\RealPoetry", StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            stringBuilder.append((char) fileReader.read());
        }
        String string = stringBuilder.toString().toLowerCase();
        for (char c : string.toCharArray()) {
            elements.add(c);
        }
        System.out.println();
        System.out.println(string);
        System.out.println();
        return elements;
    }

}
