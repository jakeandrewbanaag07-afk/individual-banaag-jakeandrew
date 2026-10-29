package com.joysistvi.day11.singledarray;
import java.util.Scanner;

public class ArrayExampleWithSizeOnly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax
        // datatype variable = new datatype[size]
        System.out.println("Enter six colors ");

        String[] colors = new String[6];
        for (int i = 0; i < colors.length; i++) {

            System.out.print("Enter color: [" + (i + 1) + "]: ");
            colors[i] = sc.nextLine();
        }

        // Read after Write
        System.out.println("\n Printing all the  colors:");
        for (String color : colors) {
            System.out.println(color + " ");
        }


    }
}
// int count= 0;
// count+=2;
