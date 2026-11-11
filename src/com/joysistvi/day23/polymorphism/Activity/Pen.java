package com.joysistvi.day23.polymorphism.Activity;


public class Pen {

    // Data members
    private String brand;
    private String color;
    private double weightInGrams;

    //  Constructor
    public Pen(String brand, String color, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    // Getters and setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getWeightInGrams() { return weightInGrams; }
    public void setWeightInGrams(double weightInGrams) { this.weightInGrams = weightInGrams; }

    //  Methods that child classes override
    public void write() {
        System.out.println("Writing with a pen.");
    }

    public void refill() {
        System.out.println("Refilling the pen.");
    }

    // Overloaded write()
    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a pen.");
    }

    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            write(text);  // reuse write(String)
        }
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\n"
                + "Color: " + color + "\n"
                + "Weight in Grams: " + weightInGrams;
    }
}