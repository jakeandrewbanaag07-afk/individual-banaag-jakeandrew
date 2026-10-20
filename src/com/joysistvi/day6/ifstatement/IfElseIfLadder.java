package com.joysistvi.day6.ifstatement;

public class IfElseIfLadder {

    public static void main(String[] args) {

        int grade =70;
        String result;

        if (!(grade >= 1 && grade <= 100)) {
            return;
        }

        if (grade <= 70) { // 1 - 70
            result = "F";
        } else if (grade <= 80) { // 71 - 80
            result = "C";
        } else if (grade <= 90) {
            result = "B";
        } else if (grade <= 100){
            result = "A";
        } else {
            result = "Invalid Grade";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Classification: " + result);

    }
}



/*
  int day = 7;
        String DayName;

        if(day == 1){
            DayName = "Sunday";
        }else if (day == 2){
            DayName = "Monday";
        }else if (day == 3){
            DayName = "Tuesday";
        }else if (day == 4){
            DayName = "Wednesday";
        }else  if (day == 5){
            DayName = "Thursday";
        }else if (day == 6){
            DayName = "Friday";
        }else if (day == 7){
            DayName = "Saturday";
        }else{
            DayName = "Invalid Day";
        }System.out.println(DayName);
*/

/*if (grade >= 1 && grade <= 100) {

        if (grade <= 70) { // 1 - 70
result = "F";
        } else if (grade <= 80) { // 71 - 80
result = "C";
        } else if (grade <= 90) {
result = "B";
        } else {
result = "A";
        }
        System.out.println("Grade: " + grade);
            System.out.println("Classification: " + result);

        } else {
                System.out.println("Invalid Grade");
        }*/