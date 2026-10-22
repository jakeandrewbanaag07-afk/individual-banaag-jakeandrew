package com.joysistvi.day6.operator;

public class Activity3_Banaag {

    public static void main(String[] args) {

        int age = 17;
        boolean hasValidID = true;
        if (age >= 18 && hasValidID){
            System.out.println("You are allowed to enter an event.");
        }else{
            System.out.println("You are not allowed to enter the event");
        }

        boolean isWeekend = false;
        boolean isHoliday = false;
        if (isWeekend || isHoliday){
            System.out.println("No classes if it is a weekend  OR a holiday");
        }else{
            System.out.println("There are classes today");
        }

        int score = 80;
        String result= (score>= 75) ? "Passed" : "failed";
        System.out.println(result);

        int num = 30;
        int num2 = 40;
        int bigger =(num > num2) ? num : num2;
        System.out.println("Bigger:" + bigger);


    }
}
