package com.joysistvi.day13.string;

public class Activity10_Banaag {

    public static void main(String[] args) {
        String text = "Hello Java World";

        // 1. contains()  ->  "Is this word inside my text?"
        // Answer is true or false.
        System.out.println(text.contains("World"));   // true  (World is in the text)
        System.out.println(text.contains("Python"));  // false (Python is NOT in the text)

        // 2. startsWith()  ->  "Does my text BEGIN with this?"
        System.out.println(text.startsWith("Hello")); // true
        System.out.println(text.startsWith("World")); // false

        // 3. endsWith()  ->  "Does my text FINISH with this?"
        System.out.println(text.endsWith("World"));   // true
        System.out.println(text.endsWith("Hello"));   // false

        // 4. indexOf()  ->  "At which box number does it start?"
        // If it is not found, you get -1.
        System.out.println(text.indexOf("World"));    // 6  (W is in box 6)
        System.out.println(text.indexOf('o'));        // 4  (first 'o' is in box 4)
        System.out.println(text.indexOf("Python"));   // -1 (not found)

        // 5. trim()  ->  "Cut off the extra spaces at the start and end"
        // Spaces in the middle stay.
        // The [ ] are only here so you can SEE the spaces.
        String spaced = "   Java   ";
        System.out.println("[" + spaced + "]");        // [   Java   ]
        System.out.println("[" + spaced.trim() + "]"); // [Java]

        // 6. replace()  ->  "Swap this for that"
        // The original text does not change. You get a new String.
        System.out.println(text.replace("World", "Class")); // Hello Class
        System.out.println(text.replace('o', '0'));         // Hell0 W0rld

        // 7. toCharArray()  ->  "Break the text into single letters"
        // Each letter goes into its own box in a char array.
        char[] letters = "Java".toCharArray();   // ['J', 'a', 'v', 'a']

        // The loop visits box 0, 1, 2, 3 and prints each letter.
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        // Prints:
        // J
        // a
        // v
        // a


        String country = "Philippines";

// First character (index 0)
        System.out.println("First character: " + country.charAt(0));

// Last character (index = length - 1)
        System.out.println("Last character: " + country.charAt(country.length() - 1));

// Make everything lowercase so 'P' and 'p' are the same
        String lower = country.toLowerCase();

// Count 'p'
        int pCount = 0;                              // counter starts at 0
        for (int i = 0; i < lower.length(); i++) {   // go through every letter
            if (lower.charAt(i) == 'p') {            // is it a 'p'?
                pCount++;                            // yes, add 1
            }
        }
        System.out.println("P/p appears: " + pCount);

// Count vowels
        int vowelCount = 0;
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);               // current letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;                        // it's a vowel, add 1
            }
        }
        System.out.println("Total vowels: " + vowelCount);

    }
}
