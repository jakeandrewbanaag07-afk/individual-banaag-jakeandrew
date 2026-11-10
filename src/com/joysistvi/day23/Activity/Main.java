package com.joysistvi.day23.Activity;

public class Main {

    // Accepts any Pen or subclass. Java picks write()/refill() by the object's
    public static void testPen(Pen pen) {
        System.out.println(pen);  // calls the object's toString()
        pen.write();
        pen.refill();
        System.out.println();
    }

    public static void main(String[] args) {

        //  Create objects
        Pen pen = new Pen("Panda", "Blue", 15.0);
        Pen Ballpen = new Ballpen("Pilot", "Black", 20.0, 1.0);
        Pen Marker = new Marker("Pentel", "Red", 35.0, true);

        // polymorphism, called directly
        System.out.println("=== Calling methods on Pen references ===");

        System.out.println("\n--- Pen ---");
        pen.write();
        pen.refill();
        System.out.println();

        System.out.println("--- Ballpen ---");
        Ballpen.write();
        Ballpen.refill();
        System.out.println();

        System.out.println("--- Marker ---");
        Marker.write();
        Marker.refill();
        System.out.println();

        //  polymorphism, through testPen()
        System.out.println("=== testPen() ===");
        testPen(pen);
        testPen(Ballpen);
        testPen(Marker);
        System.out.println();

        // Part 4: overloading
        System.out.println("=== Overloading ===");
        Marker.write("Hello");     //  prints once
        Marker.write("Hello", 3);  // prints 3 times
    }
}
