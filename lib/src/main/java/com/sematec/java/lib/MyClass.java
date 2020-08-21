package com.sematec.java.lib;

public class MyClass {

    int age = 5;
    double pi = 3.14;
    boolean isAdult = true;
    String name = "Pouya";
    byte b = 10;
    short s = 300;
    long l = 400000;
    char c = 'P';
    float f = 12.55f;

    int score;


    //  /   Slash
    //  \   back slash
    //  -   dash
    //  _   underline
    //  ()  parantez
    //  &   ampersand
    //  #   Sharp
    //  ~   tilde
    //  |   pipe line
    //  .   dot
    //  ,   comma
    //  :   Colon
    //  ;   semi colon
    //  '   Single Quotation
    //  "   Double Quotation
    //  []  brace
    //  {}  Curly brace


    public static int calculateAge(int birthYear) {
        int year = getYear();
        int age = year - birthYear;
        return age;
    }

    public static int getYear() {
        return 2020;
    }

    public static double sum(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    public void printName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        int age = calculateAge(1980); //call
        System.out.println(age);

        double result = sum(3.14, 9.99);
        System.out.println(result);
    }
}