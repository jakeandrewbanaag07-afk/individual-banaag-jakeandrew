package com.joysistvi.day25.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayListCrud {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        // Create / Add item(s)
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add(1, "White");
        colors.add("White");
        colors.add("Yellow");


        // Update / Set item(s)
        //colors.set(0, "Mlue");

        // Read / Get item(s)
        //System.out.println(colors.get(0));

        // Delete / Remove an item(s)
        //colors.remove(0);

        //colors.remove("Pink");

        // Remove all items in the list
//        colors.removeAll(colors);
//        colors.clear();

        // get size
        System.out.println(colors.size());

        // traverse an arraylist using for-loop
//        for(int i = 0; i < colors.size(); i++){
//            System.out.println(colors.get(i));
//        }

//        for (String color : colors){
//            System.out.println(color);
//        }

        // traverse an arraylist using for each loop
//        colors.forEach(System.out::println);

        // sorting
//        Collections.sort(colors);
//        System.out.println("\nAfter sorting:");
//        colors.forEach(System.out::println);

        Collections.shuffle(colors);
        colors.forEach(System.out::println);
        System.out.println();
        Collections.shuffle(colors);
        colors.forEach(System.out::println);
        System.out.println();
        Collections.shuffle(colors);
        colors.forEach(System.out::println);

        // contains

        System.out.println(colors.contains("Black"));

        // indexOF()
        System.out.println(colors.indexOf("White")); // first occurance
        System.out.println(colors.lastIndexOf("White")); // last occurance


//        Random random = new Random();
//        System.out.println(random.nextBoolean());

        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            System.out.println(random.nextInt(58) + 1);
        }
    }
}
