package com.starterkit.abstraction;

public class SalariedEmployee extends Employee {
    private final double monthlySalary;

    public SalariedEmployee(String name, double monthlySalary) {
        super(name);
        if (monthlySalary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero.");
        }
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
