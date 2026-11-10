package com.joysistvi.day23.Activity;


public class Marker extends Pen {

    // Data member
    private boolean permanent;

    // Constructor
    public Marker(String brand, String color, double weightInGrams, boolean permanent) {
        super(brand, color, weightInGrams);
        this.permanent = permanent;
    }

    // Getter and setter
    public boolean isPermanent() { return permanent; }
    public void setPermanent(boolean permanent) { this.permanent = permanent; }

    //  Overridden methods
    @Override
    public void write() {
        System.out.println("Writing boldly with a marker.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the marker ink.");
    }

    @Override
    public String toString() {
        // (condition ? a : b) turns true/false into "Yes"/"No"
        return "Type: Marker\n"
                + super.toString() + "\n"
                + "Permanent: " + (permanent ? "Yes" : "No");
    }
}
