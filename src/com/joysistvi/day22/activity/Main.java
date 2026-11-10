package com.joysistvi.day22.activity;


public class Main {
    public static void main(String[] args) {


        Pen pen = new Pen("Panda", "Black", 20.0);

        Ballpen ballpen = new Ballpen("Pilot", "Black", 20.0, 1.0);

        Marker marker = new Marker("Pentel", "Red", 35.0, true);

        System.out.println("=== Pen ===");
        System.out.println(pen);
        pen.write();

        System.out.println("\n=== Ballpen ===");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println("\n=== Marker ===");
        System.out.println(marker);
        marker.write();
    }
}
