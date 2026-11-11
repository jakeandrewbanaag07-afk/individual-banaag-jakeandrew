package com.joysistvi.Day24.Activity;

public class Marker extends Pen implements Refillable {

    // only markers
    private boolean permanent;

    public Marker(String brand, String color, double weightInGrams, boolean permanent) {
        super(brand, color, weightInGrams);   // shared data goes up to Pen
        this.permanent = permanent;
    }

    public boolean isPermanent() { return permanent; }
    public void setPermanent(boolean permanent) { this.permanent = permanent; }

    // Pen abstract class
    @Override
    public void write() {
        System.out.println("Writing boldly with a marker.");
    }

    //  Refillable
    @Override
    public void refill() {
        System.out.println("Refilling the marker ink.");
    }

    @Override
    public String toString() {
        return "Type: Marker\n"
                + super.toString() + "\n"
                + "Permanent: " + (permanent ? "Yes" : "No");
    }
}
