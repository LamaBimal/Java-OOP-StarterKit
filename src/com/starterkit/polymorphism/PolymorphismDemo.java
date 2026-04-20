package com.starterkit.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2.0), new Rectangle(3.0, 4.0)};

        for (Shape shape : shapes) {
            System.out.printf("%s area: %.2f%n", shape.name(), shape.area());
        }
    }
}
