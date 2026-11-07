package com.joysistvi.day22.activity;


public class Main {
    public static void main(String[] args) {

        // Create Ballpen object
        Ballpen ballpen = new Ballpen("Pilot", "Black", 20.0, 1.0);

        // Create Marker object
        Marker marker = new Marker("Pentel", "Red", 35.0, true);

        System.out.println("=== Pen ===");


        System.out.println("=== Ballpen ===");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println("\n=== Marker ===");
        System.out.println(marker);
        marker.write();
    }
}
