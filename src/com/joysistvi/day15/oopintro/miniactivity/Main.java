package com.joysistvi.day15.oopintro.miniactivity;

public class Main {

    public static void main(String[] args) {

        Ballpen ballpen = new Ballpen();
        ballpen.brand = "Pilot";
        ballpen.color = "Blue";
        ballpen.inkType = "Gel";
        ballpen.tipSize = 0.5;
        ballpen.price = 25;

        ballpen.writeNotes();
        ballpen.drawLines();
        ballpen.signDocuments();
        ballpen.writeLetters();

        Ballpen ballpen2 = new Ballpen();
        ballpen2.brand = "Panda";
        ballpen2.color = "Black";
        ballpen2.inkType = "Oil-Based";
        ballpen2.tipSize = 0.7;
        ballpen2.price = 15;

        ballpen.writeNotes();
        ballpen.drawLines();
        ballpen.writeLetters();

        Ballpen ballpen3 = new Ballpen();
        ballpen3.brand = "Uni";
        ballpen3.color = "Red";
        ballpen3.inkType = "Gel";
        ballpen3.tipSize = 0.5;
        ballpen3.price = 20;

        ballpen.drawLines();
        ballpen.signDocuments();



    }
}
