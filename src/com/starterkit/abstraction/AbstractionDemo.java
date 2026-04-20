package com.starterkit.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        Employee employee = new SalariedEmployee("Jordan", 4500.00);
        employee.printPayStub();
    }
}
