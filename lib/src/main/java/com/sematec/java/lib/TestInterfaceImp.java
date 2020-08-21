package com.sematec.java.lib;

public class TestInterfaceImp implements TestInterface {
    String name;
    int age = 50;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printName(String name) {
        System.out.println(name);
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
