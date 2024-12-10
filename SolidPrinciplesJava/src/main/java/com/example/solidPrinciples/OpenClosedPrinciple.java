package com.example.solidPrinciples;

// Shape class is open for extension but closed for modification.
public class OpenClosedPrinciple {
}

abstract class Shape {
    abstract void findArea();
}

class Triangle extends Shape {

    @Override
    void findArea() {
        // Triangle area
    }
}

class Circle extends Shape {

    @Override
    void findArea() {
        // Circle area
    }
}