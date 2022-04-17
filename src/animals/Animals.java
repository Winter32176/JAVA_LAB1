package animals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Animals {
    public static void main(String[] args) {
        Cat cat = new Cat("A");
        cat.printName();
        cat.sound();

        Dog dog = new Dog("B");
        dog.printName();
        dog.sound();

        Fox fox = new Fox("C");
        fox.printHabitat();
        fox.sound();

    }
}

