package com.joysistvi.day22.inheritance;

// Parent / Super Class
public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Age: " + age;
    }
}