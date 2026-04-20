package com.starterkit.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alex", 100.0);
        account.deposit(50.0);
        account.withdraw(30.0);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Current balance: " + account.getBalance());
    }
}
