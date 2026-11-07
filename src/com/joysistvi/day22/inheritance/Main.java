


package com.joysistvi.day22.inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", 3);
        Cat cat = new Cat("Mingming", 2, "White");
        Dog dog = new Dog("Bantay", 3, "Aspin");

        System.out.println("=== Animal ===");
        System.out.println(animal);
        animal.eat();
        animal.makeSound();

        System.out.println("\n=== Dog ===");
        System.out.println(dog);
        dog.eat(); // Inherited from Animal
        dog.makeSound(); // Overridden in Dog
        dog.fetch(); // Only Dog has this

        System.out.println("\n=== Cat ===");
        System.out.println(cat);
        cat.eat(); // Inherited from Animal
        cat.makeSound(); // Overridden in Cat
        cat.scratch(); // Only Cat has this
    }
}
