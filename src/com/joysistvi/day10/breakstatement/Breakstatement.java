package com.joysistvi.day10.breakstatement;

public class Breakstatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }

            System.out.println( i + " Hello");
        }


    }
}


/*
break = stop the loop completely.
continue = skip this round, but keep looping.



for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        } */