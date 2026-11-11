package com.joysistvi.Day24.Activity;

public abstract class Pen {


    private String brand;
    private String color;
    private double weightInGrams;

    // children call it with super
    public Pen(String brand, String color, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getWeightInGrams() { return weightInGrams; }
    public void setWeightInGrams(double weightInGrams) { this.weightInGrams = weightInGrams; }

    // no body: each child must write its own
    public abstract void write();

    // overloaded same name, different parameters)
    public void write(String text) {
        System.out.println("Writing: " + text);
    }

    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Writing: " + text);
        }
    }

    //written once, all pens use it
    public void store() {
        System.out.println("Storing the pen in the pencil case.");
    }

    //
    @Override
    public String toString() {
        return "Brand: " + brand + "\n"
                + "Color: " + color + "\n"
                + "Weight in Grams: " + weightInGrams;
    }
}