package com.joysistvi.day20.b;

import com.joysistvi.day20.a.Employee;
// class public and default access modifiers
public class B extends Employee{

    public static void main(String[] args) {

        B b = new B();
        b.printAge();
        System.out.println(b.age);
    }
}
