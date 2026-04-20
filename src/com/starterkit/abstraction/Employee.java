package com.starterkit.abstraction;

public abstract class Employee {
    private final String name;

    protected Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();

    public void printPayStub() {
        System.out.printf("%s earns $%.2f this period.%n", name, calculatePay());
    }
}
