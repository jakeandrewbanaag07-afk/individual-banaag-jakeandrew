package com.joysistvi.day6.ifstatement;

import java.sql.SQLOutput;

public class IfElseStatement {

    public static void main(String[] args) {

        // program that identifies if age is valid or invalid
        int age = 17;

       // String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        // System.out.println(result);

        String result = "";

        if (age >= 18) {
            // execute when age is 18 ot older
            result = "Valid Age";
        }else{
            result = "Invalid Age";
        }
        System.out.println("Result: " + result);


    }
}
