package com.sematec.java.lib;

public class TestChildClass extends TestParentClass {

    public void printData() {
        printAge();
        printName();
    }

    @Override
    public void printName() {
        System.out.println("Welcome, ");
        super.printName();
    }

    @Override
    public void printAge() {
        System.out.println("Your age is: " + age);
    }

}
