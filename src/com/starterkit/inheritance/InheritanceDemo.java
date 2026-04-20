package com.starterkit.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Mystery Animal");
        Animal dog = new Dog("Buddy");

        genericAnimal.speak();
        dog.speak();
    }
}
