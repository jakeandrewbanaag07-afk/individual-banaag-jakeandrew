package com.joysistvi.day14.advancemath;

public class AdvanceStudyMath {

    public static void main(String[] args) {

        System.out.println("===== PART 1: BASIC MATH =====");

        System.out.println(Math.abs(-10));      // 10    (removes the minus sign)
        System.out.println(Math.max(7, 12));    // 12    (bigger number)
        System.out.println(Math.min(7, 12));    // 7     (smaller number)
        System.out.println(Math.pow(2, 3));     // 8.0   (2 x 2 x 2)
        System.out.println(Math.sqrt(25));      // 5.0   (square root)
        System.out.println(Math.cbrt(27));      // 3.0   (cube root)
        // REMEMBER: pow, sqrt and cbrt always give a decimal (double), like 8.0


        // ========================================================
        //  PART 2: ROUNDING
        // ========================================================
        System.out.println();
        System.out.println("===== PART 2: ROUNDING =====");

        System.out.println(Math.round(4.6));    // 5     (nearest whole number)
        System.out.println(Math.round(4.4));    // 4
        System.out.println(Math.ceil(4.1));     // 5.0   (ceiling = always UP)
        System.out.println(Math.floor(4.9));    // 4.0   (floor   = always DOWN)
        /*
         *  4 ----------- 4.5 ----------- 5
         *  floor -> 4                ceil -> 5
         *  round -> 4 (below .5)     round -> 5 (.5 or above)
         */


        // ========================================================
        //  PART 3: PI AND RANDOM
        // ========================================================
        System.out.println();
        System.out.println("===== PART 3: PI AND RANDOM =====");

        // Math.PI is a ready-made value of pi
        System.out.println(Math.PI);

        // Area of a circle = PI x radius x radius
        double radius = 5;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle area: " + area);

        // Math.random() gives a random decimal from 0.0 up to (not including) 1.0
        System.out.println(Math.random());

        // Random whole number from 1 to 10:
        //   Math.random() * 10  -> 0.0 to 9.99...
        //   (int)               -> cuts the decimals -> 0 to 9
        //   + 1                 -> 1 to 10
        int randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println("Random 1-10: " + randomNumber);

        // RANDOM FORMULA:  (int) (Math.random() * HOWMANY) + START
        // Dice (1 to 6):   (int) (Math.random() * 6) + 1


        // ========================================================
        //  PART 4: PRACTICE (try each task first, then check the answer)
        // ========================================================
        System.out.println();
        System.out.println("===== PART 4: PRACTICE =====");

        // Task 1: Print the absolute value of -25.
        System.out.println(Math.abs(-25));                  // 25

        // Task 2: Print the biggest number between 15 and 42.
        System.out.println(Math.max(15, 42));               // 42

        // Task 3: Print 5 to the power of 3.
        System.out.println(Math.pow(5, 3));                 // 125.0

        // Task 4: Print the square root of 144.
        System.out.println(Math.sqrt(144));                 // 12.0

        // Task 5: Using 7.6, print its round, ceil and floor.
        double num = 7.6;
        System.out.println(Math.round(num));                // 8
        System.out.println(Math.ceil(num));                 // 8.0
        System.out.println(Math.floor(num));                // 7.0

        // Task 6: Print a random dice roll (1 to 6).
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println(dice);                           // any number 1 to 6

        // Task 7: A circle has radius 3. Print its area.
        double r = 3;
        System.out.println(Math.PI * Math.pow(r, 2));       // 28.274333882308138

    }
}
