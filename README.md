# Java OOP Fundamentals

Welcome to the **Java OOP Fundamentals**! 🎉 This repository is designed for beginners who want to learn the fundamentals of Object-Oriented Programming (OOP) in Java.

## 📝 What You'll Learn
- **Encapsulation**: How to protect data and expose behavior.
- **Inheritance**: Building relationships between classes.
- **Polymorphism**: Achieving flexibility with interfaces and overridden methods.
- **Abstraction**: Defining contracts and shared behavior using abstract classes.

## 📂 Project Structure
```text
src/com/starterkit/
├── abstraction/
│   ├── Employee.java
│   ├── SalariedEmployee.java
│   └── AbstractionDemo.java
├── encapsulation/
│   ├── BankAccount.java
│   └── EncapsulationDemo.java
├── inheritance/
│   ├── Animal.java
│   ├── Dog.java
│   └── InheritanceDemo.java
└── polymorphism/
    ├── Shape.java
    ├── Circle.java
    ├── Rectangle.java
    └── PolymorphismDemo.java
```

## 🚀 How to Use
1. Clone this repository:
   ```bash
   git clone https://github.com/LamaBimal/Java-OOP-StarterKit.git
   cd Java-OOP-StarterKit
   ```

2. Compile all Java files:
   ```bash
   mkdir -p out
   javac -d out $(find src -name "*.java")
   ```

3. Run any demo class:
   ```bash
   java -cp out com.starterkit.encapsulation.EncapsulationDemo
   java -cp out com.starterkit.inheritance.InheritanceDemo
   java -cp out com.starterkit.polymorphism.PolymorphismDemo
   java -cp out com.starterkit.abstraction.AbstractionDemo
   ```

## 🎯 Suggested Learning Path
1. Start with `encapsulation/BankAccount.java` to understand private state and controlled mutation.
2. Move to `inheritance/Animal.java` and `inheritance/Dog.java` for parent-child relationships.
3. Continue with `polymorphism/Shape.java` and implementations to see one interface, multiple behaviors.
4. Finish with `abstraction/Employee.java` to learn abstract class contracts.

## 🤝 Contributing
Feel free to fork this repo, add your own OOP examples, and open a pull request.
