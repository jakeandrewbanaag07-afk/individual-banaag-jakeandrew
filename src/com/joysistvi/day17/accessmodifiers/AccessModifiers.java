package com.joysistvi.day17.accessmodifiers;


public class AccessModifiers {

    static class Student {
        private String name = "Jake";

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.getName());
    }

}
