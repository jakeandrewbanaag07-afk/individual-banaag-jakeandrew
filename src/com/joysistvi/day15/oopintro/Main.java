package com.joysistvi.day15.oopintro;

public class Main {

    public static void main(String[] args) {
        // class instantiation / create an object of a class
        Laptop laptop = new Laptop();
        laptop.brand = "Lenovo";
        laptop.color = "Black";
        laptop.weightInKg = 1.5;
        laptop.cpu = "Ryzen";
        laptop.ramInGb = 16;

        laptop.browseInterner();
        laptop.crateDocuments();
        laptop.sendMessages();
        laptop.transferFiles();

        Laptop laptop2 = new Laptop();
        laptop2.brand = "HP";
        laptop2.color = "White";
        laptop2.weightInKg = 1;
        laptop2.cpu = "i5";
        laptop2.ramInGb = 12;

        laptop2.browseInterner();
        laptop2.crateDocuments();
        laptop2.sendMessages();

        Laptop laptop3 = new Laptop();
        laptop3.brand = "Acer";
        laptop3.color = "Grey";
        laptop3.weightInKg = 2.1;
        laptop3.cpu = "Ryzen 7";
        laptop3.ramInGb = 32;

        laptop3.browseInterner();
        laptop3.crateDocuments();
        laptop3.transferFiles();



    }
}
