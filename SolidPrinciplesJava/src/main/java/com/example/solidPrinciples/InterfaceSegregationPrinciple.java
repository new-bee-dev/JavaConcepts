package com.example.solidPrinciples;

// As per interface segregation principle, we should keep interfaces as small as possible.
// and instead of adding new method to interface, we should create new interface to avoid change in current implementation.
public class InterfaceSegregationPrinciple {
}

interface Animal {
    void feed();
    void groom();
}

class Dog implements Animal {

    @Override
    public void feed() {

    }

    @Override
    public void groom() {

    }
}

class Tiger implements Animal {

    @Override
    public void feed() {

    }

    // groom method is irrelevant here since tigers can not be groomed.
    // But for avoiding compile error, we have to prvoide some dummy implementation which is a bad practice.
    @Override
    public void groom() {

    }
}