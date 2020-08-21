package com.sematec.java.lib;

public class TestIf {

    public static void main(String[] args) {

        int age = 30;
        boolean isMale = true;

        //AND
        if (age > 20 && isMale == true) {
            System.out.println("You can Smoke!");
        }


        //OR
        if (age > 20 || isMale == true) {
            System.out.println("You can Smoke!");
        }


        if (age > 20) {
            System.out.println("Adult");
        } else if (age > 10) {
            System.out.println("Teen");
        } else {
            System.out.println("Kid");
        }


        if (isMale == true) {
            System.out.println("Male");
        } else {
            System.out.println("Female");
        }

    }
}
