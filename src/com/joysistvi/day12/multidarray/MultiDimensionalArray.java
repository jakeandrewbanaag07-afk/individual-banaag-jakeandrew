package com.joysistvi.day12.multidarray;
import java.util.Scanner;
public class MultiDimensionalArray {

    public static void main(String[] args) {
        // coordinates: rows & column
        //                  0 1 2
        //  int[][] numbers = {{1, 2, 3, 4, 5}, {4, 5, 6}, {7, 8, 9}, {0}};

        //System.out.println([1][1]);

        // System.out.println(numbers[2].length);

//        System.out.println("traversing a multi-dimensional array using nested for loop");
//        //                  0 <  4
//
//        for (int rows = 0; rows < numbers.length; rows++) { // outer loop
//            //                    0 < 5
//            for (int column = 0; column < numbers[rows].length; column++) {
//                System.out.println(numbers[rows][column]);
//            }
//            System.out.println();
//        }
//
//        //}
//        System.out.println("\n traversing a multi-dimensional array using nested for- each loop");
//        for (int[] rows : numbers) {
//            for (int column : rows) {
//                System.out.println(column);
//            }
//            System.out.println();
//        }

//

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of row :");
        int row = scanner.nextInt();
        System.out.println("Enter size of column: ");
        int colum = scanner.nextInt();
        String[][] planets = new String[2][5];

        for (int rows = 0; rows < planets.length; rows++) {
            for (int column = 0; column < planets[rows].length; column++) {
                System.out.print("Enter planet [" + rows + "][" + column + "]: ");
                planets[rows][column] = scanner.nextLine();
            }
            System.out.println();
        }

        System.out.println("Planets entered:");
        for (String[] rows : planets) {
            System.out.print("[ ");
            for (String column : rows) {
                System.out.print(column + " ");
            }
            System.out.println("]");
        }

        scanner.close();


        }
    }
