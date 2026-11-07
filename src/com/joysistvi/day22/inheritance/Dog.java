
package com.joysistvi.day22.inheritance;

// Don't Repeat Yourself Principle
public class Dog extends Animal {

   private String breed = "askal";

   public Dog(String name, int age, String breed) {
      super(name, age);
      this.breed = breed;
   }

   public String getBreed() {
      return breed;
   }

   public void setBreed(String breed) {
      this.breed = breed;
   }

   // Method overriding
   @Override
   public void makeSound() {
      System.out.println(getName() + " says: Woof! Woof!");
   }

   // A method that only Dog has
   public void fetch() {
      System.out.println(getName() + " is fetching the ball.");
   }

   @Override
   public String toString() {
      return "Type: Dog\n"
              + super.toString() + "\n"
              + "Breed: " + breed;
   }
}
