package udemy;

/**
 * Author: Sahil Sharma
 * Created On: March 22, 2018
 * Project: Inheritance
 */

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 15);

        Dog dog = new Dog("Bruno", 8, 35, 2, 4, 1, 24, "Silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
