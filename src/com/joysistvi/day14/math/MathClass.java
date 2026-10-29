package com.joysistvi.day14.math;

public class MathClass {

    public static void main(String[] args) {

        // 1. abs() - removes the minus sign (distance from zero)
        System.out.println("1. abs(-7)      = " + Math.abs(-7));      // 7

        // 2. max() - gives the bigger number
        System.out.println("2. max(10, 20)  = " + Math.max(10, 20));  // 20

        // 3. min() - gives the smaller number
        System.out.println("3. min(10, 20)  = " + Math.min(10, 20));  // 10

        // 4. pow(base, power) - multiplies the base by itself: 2 x 2 x 2
        System.out.println("4. pow(2, 3)    = " + Math.pow(2, 3));    // 8.0

        // 5. sqrt() - square root: which number times itself gives 16?
        System.out.println("5. sqrt(16)     = " + Math.sqrt(16));     // 4.0

        // 6. round() - nearest whole number (.5 goes up)
        System.out.println("6. round(4.5)   = " + Math.round(4.5));   // 5

        // 7. ceil() - always up (ceiling is above you)
        System.out.println("7. ceil(4.1)    = " + Math.ceil(4.1));    // 5.0

        // 8. floor() - always down (floor is below you)
        System.out.println("8. floor(4.9)   = " + Math.floor(4.9));   // 4.0

        // 9. random() - random decimal from 0.0 to less than 1.0
        //    Different every time you run it.
        System.out.println("9. random()     = " + Math.random());     // example: 0.7316

        // 10. log() - "e to what power gives this number?"
        System.out.println("10. log(e)      = " + Math.log(Math.E)); // 1.0

        // 11. log10() - "10 to what power gives this number?" (10 x 10 x 10 = 1000)
        System.out.println("11. log10(1000) = " + Math.log10(1000));  // 3.0

        // 12. exp() - e raised to a power
        System.out.println("12. exp(1)      = " + Math.exp(1));       // 2.718281828459045

        // 13. sin() - sine of an angle
        System.out.println("13. sin(90 deg) = " + Math.sin(Math.toRadians(90)));   // 1.0

        // 14. cos() - cosine of an angle
        System.out.println("14. cos(0 deg)  = " + Math.cos(Math.toRadians(0)));    // 1.0

        // 15. tan() - tangent of an angle (tiny rounding difference is normal)
        System.out.println("15. tan(45 deg) = " + Math.tan(Math.toRadians(45)));   // 0.99999999999999


    }
}
