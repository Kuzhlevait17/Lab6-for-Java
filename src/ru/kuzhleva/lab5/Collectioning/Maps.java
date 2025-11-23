package ru.kuzhleva.lab5.Collectioning;

import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.*;

public class Maps {
   public void showStudents() {
       try {
           BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lukuz\\IdeaProjects\\Lab3\\src\\ru\\kuzhleva\\lab5\\Collectioning\\Students"));
           int amount = Integer.parseInt(reader.readLine().trim());

           Map<String,int[]> entrant = new HashMap<>();

           for (int i = 0; i < amount; i++) {
               String[] parts = reader.readLine().split(" ");
               String fullName = parts[0] + " " + parts[1];
               int[] score = new int[3];
               score[0] = Integer.parseInt(parts[2]);
               score[1] = Integer.parseInt(parts[3]);
               score[2] = Integer.parseInt(parts[4]);
               entrant.put(fullName, score);
           }
           int count = 0;
           for (Map.Entry<String, int[]> entry : entrant.entrySet()) {
               String name = entry.getKey();
               int[] scores = entry.getValue();

               int sum = scores[0] + scores[1] + scores[2];
               if (sum >= 140 && scores[0] >= 30 && scores[1] >= 30 && scores[2] >= 30 ) {
                   count++;
                   System.out.println(name + "   " + scores[0] + " " + scores[1] + " " + scores[2] + " " + sum);
               }
           }
           System.out.println("Количество студентов в первом потоке: " + count);
       } catch (IOException e) {
           e.printStackTrace();
       }


   }
}
