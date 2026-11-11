package com.joysistvi.Day24.Activity;

public class Main {

    //Ballpen and Marker are both Pens
    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
    }

    // Accepts anything that implements Refillable
    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS);
    }

    // Accepts anything that implements Clickable
    public static void testClickable(Clickable clickable) {
        clickable.click();
    }

    public static void main(String[] args) {


        Ballpen ballpen = new Ballpen("Pilot", "Black", 30.0, 1.0);
        Marker marker = new Marker("Pentel", "Red", 14.0, true);

        // both are Pens
        System.out.println("=== testPen() ===");
        testPen(ballpen);
        System.out.println();
        testPen(marker);
        System.out.println();

        // both implement Refillable
        System.out.println("=== testRefillable() ===");
        testRefillable(ballpen);
        System.out.println();
        testRefillable(marker);
        System.out.println();

        // Ballpen only
        System.out.println("=== testClickable() ===");
        testClickable(ballpen);
    }
}