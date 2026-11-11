package com.joysistvi.day23.polymorphism.Activity;

// Child class: inherits brand, color, weight, and their getters/setters from Pen.
public class Ballpen extends Pen {

    //  Data member
    private double pointSize;

    // Constructor
    // super(...) sends the shared data up to Pen's constructor.
    public Ballpen(String brand, String color, double weightInGrams, double pointSize) {
        super(brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    // Getter and setter
    public double getPointSize() { return pointSize; }
    public void setPointSize(double pointSize) { this.pointSize = pointSize; }

    //  Overridden methods
    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    @Override
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }

    @Override
    public String toString() {
        // type + Pen's details (super.toString()) + point size
        return "Type: Ballpen\n"
                + super.toString() + "\n"
                + "Point Size: " + pointSize;
    }
}
